package com.bread_nicecat.fantasticfighting.item;

import com.bread_nicecat.fantasticfighting.FantasticFighting;

import net.minecraft.item.Item;

public class DebugToolkitItem extends Item {

	public static final String NAME = "debug.toolkit";

	public DebugToolkitItem() {
		super(new Properties().group(FantasticFighting.tab));
		setRegistryName(ItemManager.getRegistryName(NAME));
	}

}
