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
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(bus = Bus.MOD)
public class ManagerEntity {

	private static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister
			.create(ForgeRegistries.ENTITIES, FantasticFighting.MODID);
	public static final HashMap<String, RegistryObject<EntityType<? extends Entity>>> entities = new HashMap<>();

	public static void register(IEventBus bus) {
		registerEntity(MonarchMechaEntity.NAME, MonarchMechaEntity::new, 3.6f, 12.5f);
		ENTITY_TYPES.register(bus);
	}

	private static <T extends Entity> void registerEntity(String name, EntityType.IFactory<T> factoryIn, float width,
			float height) {
		entities.put(name, ENTITY_TYPES.register(name,
				() -> EntityType.Builder.create(factoryIn, EntityClassification.MISC).size(width, height).build(name)));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void render(FMLClientSetupEvent event) {
		for (String name : entities.keySet()) {
			RenderingRegistry.registerEntityRenderingHandler(entities.get(name).get(), MonarchMechaRenderer::new);
		}
	}

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
