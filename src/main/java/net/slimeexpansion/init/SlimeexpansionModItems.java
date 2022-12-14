
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slimeexpansion.init;

import net.slimeexpansion.SlimeexpansionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class SlimeexpansionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlimeexpansionMod.MODID);
	public static final RegistryObject<Item> COAL_SLIME = REGISTRY.register("coal_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(SlimeexpansionModEntities.COAL_SLIME, -13421773, -16777216,
					new Item.Properties().tab(SlimeexpansionModTabs.TAB_SLIME_EXPANSION)));
	public static final RegistryObject<Item> SLIME = block(SlimeexpansionModBlocks.SLIME, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
