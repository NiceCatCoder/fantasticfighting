package com.bread_nicecat.fantasticfighting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bread_nicecat.fantasticfighting.entity.ManagerEntity;
import com.bread_nicecat.fantasticfighting.item.ItemDebugToolkit;
import com.bread_nicecat.fantasticfighting.item.ManagerItem;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FantasticFighting.MODID)
public class FantasticFighting {
	public static final String MODID = "fantasticfighting";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup tab;
	static {
		tab = new ItemGroup(MODID) {
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ManagerItem.ITEMS.get(ItemDebugToolkit.NAME));
			}
		};
		tab.setBackgroundImageName("fantasticfighting.png");
	}

	public FantasticFighting() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ManagerEntity.register(bus);
	}
}
