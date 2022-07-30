
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slimeexpansion.init;

import net.slimeexpansion.block.SlimeBlock;
import net.slimeexpansion.SlimeexpansionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class SlimeexpansionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SlimeexpansionMod.MODID);
	public static final RegistryObject<Block> SLIME = REGISTRY.register("slime", () -> new SlimeBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SlimeBlock.registerRenderLayer();
		}
	}
}
