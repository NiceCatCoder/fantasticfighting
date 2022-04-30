package com.bread_nicecat.fantasticfighting.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;

public class MonarchMechaEntity extends MobEntity {

	public MonarchMechaEntity(EntityType<? extends MobEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO setBoundingBox(new AxisAlignedBB(new BlockPos(1, 1, 1), new BlockPos(5,
		// 5, 5)));
	}

	public static final String NAME = "monarch_mecha";

}
