
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slimeexpansion.init;

import net.slimeexpansion.SlimeexpansionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class SlimeexpansionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlimeexpansionMod.MODID);
	public static final RegistryObject<Item> COAL_SLIME = REGISTRY.register("coal_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(SlimeexpansionModEntities.COAL_SLIME, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
