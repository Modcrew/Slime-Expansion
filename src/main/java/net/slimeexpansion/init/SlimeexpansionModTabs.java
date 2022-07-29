
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slimeexpansion.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SlimeexpansionModTabs {
	public static CreativeModeTab TAB_SLIME_EXPANSION;

	public static void load() {
		TAB_SLIME_EXPANSION = new CreativeModeTab("tabslime_expansion") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.SLIME_BALL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
