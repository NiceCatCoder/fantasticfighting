package com.bread_nicecat.fantasticfighting.entity;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.bread_nicecat.fantasticfighting.FantasticFighting;
import com.bread_nicecat.fantasticfighting.entity.renderer.MonarchMechaRenderer;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(bus = Bus.MOD)
public class EntityManager {

	private static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister
			.create(ForgeRegistries.ENTITIES, FantasticFighting.MODID);
	// 实体映射表
	public static final HashMap<String, RegistryObject<EntityType<? extends Entity>>> entities = new HashMap<>();
	// 实体最大生命
	private static final HashMap<String, Double> maxHealths = new HashMap<>();

	// 实体渲染映射表
	@SuppressWarnings("rawtypes")
	private static final HashMap<String, IRenderFactory> renderers = new HashMap<>();

	// 添加总线,并添加实体到队列
	public static void register(IEventBus bus) {
		registerEntity(MonarchMechaEntity.NAME, MonarchMechaEntity::new, MonarchMechaRenderer::new, 3.6f, 12.5f,
				1250.0D);
		ENTITY_TYPES.register(bus);
	}

	// 将实体加入注册队列
	private static <T extends Entity> void registerEntity(String name, EntityType.IFactory<T> factoryIn,
			IRenderFactory<? super T> renderFactoryIn, float width, float height, double maxHealth) {
		registerEntity(name, factoryIn, renderFactoryIn, width, height);
		maxHealths.put(name, maxHealth);
	}

	private static <T extends Entity> void registerEntity(String name, EntityType.IFactory<T> factoryIn,
			IRenderFactory<? super T> renderFactoryIn, float width, float height) {
		entities.put(name, ENTITY_TYPES.register(name,
				() -> EntityType.Builder.create(factoryIn, EntityClassification.MISC).size(width, height).build(name)));
		renderers.put(name, renderFactoryIn);
	}

	// 最大生命值
	@SuppressWarnings("unchecked")
	@SubscribeEvent
	public static void setupAttributes(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			for (String name : entities.keySet()) {
				if (maxHealths.get(name) != null) {
					GlobalEntityTypeAttributes.put((EntityType<? extends LivingEntity>) entities.get(name).get(),
							MobEntity.func_233666_p_()
									.createMutableAttribute(Attributes.MAX_HEALTH, maxHealths.get(name)).create());
				}
			}
		});
	}

	// 渲染贴图
	@SuppressWarnings("unchecked")
	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void render(FMLClientSetupEvent event) {
		for (String name : entities.keySet()) {
			RenderingRegistry.registerEntityRenderingHandler(entities.get(name).get(), renderers.get(name));
		}
	}

	// 获取贴图
	public static ResourceLocation getEntityTexture(String textureName) {
		return new ResourceLocation(FantasticFighting.MODID, "textures/entity/" + textureName + ".png");
	}

	public static Reader getModelReader(String modelName) {
		InputStream s = FantasticFighting.class
				.getResourceAsStream("/assets/fantasticfighting/models/entity/" + modelName + ".B_NC_LOCK");
		if (s == null) {
			FantasticFighting.LOGGER.error("could not find model:" + modelName + ".B_NC_LOCK");
			return null;
		}
		return new InputStreamReader(s);
	}
}
