
package net.slimeexpansion.client.renderer;

import net.slimeexpansion.entity.CoalSlimeEntity;
import net.slimeexpansion.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CoalSlimeRenderer extends MobRenderer<CoalSlimeEntity, Modelcustom_model<CoalSlimeEntity>> {
	public CoalSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoalSlimeEntity entity) {
		return new ResourceLocation("slimeexpansion:textures/coalslimealpha.png");
	}
}
