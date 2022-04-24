package com.bread_nicecat.fantasticfighting.item;

import java.util.HashMap;

import com.bread_nicecat.fantasticfighting.FantasticFighting;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(bus = Bus.MOD)
public class ManagerItem {
	public static final HashMap<String, Item> ITEMS = new HashMap<>();

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		ITEMS.put(ItemDebugToolkit.NAME, new ItemDebugToolkit());
		for (Item item : ITEMS.values())
			event.getRegistry().register(item);
	}

	public static ResourceLocation getRegistryName(String name) {
		return new ResourceLocation(FantasticFighting.MODID, name);
	}

	public static Item newSimpleItem(ItemGroup tab, String name, int maxStack) {
		Properties properties = new Properties().group(tab);
		properties.maxStackSize(maxStack);
		Item item = new Item(properties);
		item.setRegistryName(getRegistryName(name));
		return item;
	}
}
