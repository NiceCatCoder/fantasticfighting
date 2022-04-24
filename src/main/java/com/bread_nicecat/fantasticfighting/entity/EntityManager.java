package com.bread_nicecat.fantasticfighting.entity;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(bus = Bus.MOD)
public class EntityManager {
	@SubscribeEvent
	public static void onClientSetUpEvent(FMLClientSetupEvent event) {
		/*  RenderingRegistry.registerEntityRenderingHandler(EntityTypeRegistry.flyingSwordEntity.get(), (EntityRendererManager manager) -> {
		      return new FlyingSwordRender(manager);
		  });*/
	}
}
