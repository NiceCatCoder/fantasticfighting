package com.bread_nicecat.fantasticfighting.entity.renderer;

import com.bread_nicecat.fantasticfighting.entity.MonarchMechaEntity;
import com.bread_nicecat.fantasticfighting.entity.ManagerEntity;
import com.bread_nicecat.fantasticfighting.entity.renderer.model.BreadNiceCatModelBase;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class MonarchMechaRenderer extends EntityRenderer<Entity> {

	private /*ModelMonarchMecha*/EntityModel<Entity> MODEL;

	public MonarchMechaRenderer(EntityRendererManager renderManager) {
		super(renderManager);
		// MODEL = new ModelMonarchMecha();
		MODEL = new BreadNiceCatModelBase(ManagerEntity.getModelReader(MonarchMechaEntity.NAME + ".java_mcp"));
	}

	@Override
	public void render(Entity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		matrixStackIn.push();
		matrixStackIn.rotate(Vector3f.XN.rotationDegrees(180));
		IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.MODEL.getRenderType(this.getEntityTexture(entityIn)));
		this.MODEL.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F,
				1.0F);
		matrixStackIn.pop();
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		return ManagerEntity.getEntityTexture(MonarchMechaEntity.NAME);
	}
}
