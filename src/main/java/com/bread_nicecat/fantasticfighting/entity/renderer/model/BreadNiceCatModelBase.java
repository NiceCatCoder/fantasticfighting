package com.bread_nicecat.fantasticfighting.entity.renderer.model;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

import com.bread_nicecat.fantasticfighting.FantasticFighting;
import com.bread_nicecat.fantasticfighting.entity.renderer.model.BreadNiceCatEntityModelJsonFormat.InnerClass_01;
import com.bread_nicecat.fantasticfighting.entity.renderer.model.BreadNiceCatEntityModelJsonFormat.InnerClass_01.InnerClass_01_01;
import com.google.gson.GsonBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BreadNiceCatModelBase extends EntityModel<Entity> {
	private final HashMap<String, ModelRenderer> rs = new HashMap<>();
	private final ArrayList<ModelRenderer> rrs = new ArrayList<>();

	public BreadNiceCatModelBase(Reader b_nc_fileIn) {
		this(new GsonBuilder().create().fromJson(b_nc_fileIn, BreadNiceCatEntityModelJsonFormat.class));
		try {
			b_nc_fileIn.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BreadNiceCatModelBase(BreadNiceCatEntityModelJsonFormat bncjf) {
		if (!bncjf.getState_000()) {
			FantasticFighting.LOGGER.error("Failed to load model file");
		} else {
			FantasticFighting.LOGGER.info("Start loading Model:fantasticfighting:" + bncjf.getVal_000());
			this.textureWidth = bncjf.getVal_502();
			this.textureHeight = bncjf.getVal_503();
			for (InnerClass_01 ic_01 : bncjf.getVal_501()) {
				rs.put(ic_01.getVal_501_000(), new ModelRenderer(this));
			}
			for (String rrS : bncjf.getVal_508()) {
				rrs.add(rs.get(rrS));
			}
			for (InnerClass_01 ic_01 : bncjf.getVal_501()) {
				ModelRenderer r = rs.get(ic_01.getVal_501_000());
				r.setRotationPoint(ic_01.getVal_501_101(), ic_01.getVal_501_102(), ic_01.getVal_501_103());
				for (String c : ic_01.getVal_506_101()) {
					r.addChild(rs.get(c));
				}
				for (InnerClass_01_01 ic_01_01 : ic_01.getVal_505_101()) {
					r.setTextureOffset(ic_01_01.getVal_505_101_101(), ic_01_01.getVal_505_101_102()).addBox(
							ic_01_01.getVal_505_101_103(), ic_01_01.getVal_505_101_104(), ic_01_01.getVal_505_101_105(),
							ic_01_01.getVal_505_101_106(), ic_01_01.getVal_505_101_107(), ic_01_01.getVal_505_101_108(),
							ic_01_01.getVal_505_101_109(), ic_01_01.isVal_505_101_110());
				}
				setRotationAngle(r, ic_01.getVal_507_101(), ic_01.getVal_507_102(), ic_01.getVal_507_103());
			}
		}
	}

	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		for (ModelRenderer rr : rrs) {
			rr.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
		}
	}

	private static void setRotationAngle(ModelRenderer r, float val_507_101, float val_507_102, float val_507_103) {
		r.rotateAngleX = val_507_101;
		r.rotateAngleY = val_507_102;
		r.rotateAngleZ = val_507_103;
	}

}
