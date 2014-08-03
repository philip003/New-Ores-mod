package com.philip003.newores.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeedFood;

import com.philip003.newores.NewOres;

public class ItemWeed extends ItemSeedFood {

	public ItemWeed(int hunger, float saturation, Block Crop, Block plantedOn) {
		super(hunger, saturation, Crop, plantedOn);
		setTextureName(NewOres.MODID + ":weed");
		setUnlocalizedName("weed");
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}