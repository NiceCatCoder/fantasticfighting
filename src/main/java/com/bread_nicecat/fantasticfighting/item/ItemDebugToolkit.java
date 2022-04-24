package com.bread_nicecat.fantasticfighting.item;

import com.bread_nicecat.fantasticfighting.FantasticFighting;

import net.minecraft.item.Item;

public class ItemDebugToolkit extends Item {

	public static final String NAME = "debug.toolkit";

	public ItemDebugToolkit() {
		super(new Properties().group(FantasticFighting.tab));
		setRegistryName(ManagerItem.getRegistryName(NAME));
	}

}
