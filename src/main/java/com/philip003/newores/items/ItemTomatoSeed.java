package com.philip003.newores.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.potion.Potion;

import com.philip003.newores.NewOres;

public class ItemTomatoSeed extends ItemSeedFood {

	public ItemTomatoSeed(int p_i45351_1_, float p_i45351_2_, Block seedResult,
			Block plantedOn) {
		super(p_i45351_1_, p_i45351_2_, seedResult, plantedOn);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("tomatoSeed");
		setTextureName(NewOres.MODID + ":tomatoseed");
		setPotionEffect(Potion.poison.id, 15, 1, 0.25F);
	}
}