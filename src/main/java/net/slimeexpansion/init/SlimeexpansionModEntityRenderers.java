
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slimeexpansion.init;

import net.slimeexpansion.client.renderer.CoalSlimeRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlimeexpansionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SlimeexpansionModEntities.COAL_SLIME.get(), CoalSlimeRenderer::new);
	}
}
