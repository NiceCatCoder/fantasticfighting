package com.bread_nicecat.fantasticfighting.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class MonarchMechaEntity extends MobEntity {

	public MonarchMechaEntity(EntityType<? extends MobEntity> type, World worldIn) {
		super(type, worldIn);
		this.getAttributeManager().createInstanceIfAbsent(Attributes.MAX_HEALTH);
	}

	public static final String NAME = "monarch_mecha";

}
