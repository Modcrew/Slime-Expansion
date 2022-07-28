
package net.slimeexpansion.client.renderer;

import net.slimeexpansion.entity.CoalSlimeEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

public class CoalSlimeRenderer extends MobRenderer<CoalSlimeEntity, SlimeModel<CoalSlimeEntity>> {
	public CoalSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoalSlimeEntity entity) {
		return new ResourceLocation("slimeexpansion:textures/coalslimealpha.png");
	}
}
