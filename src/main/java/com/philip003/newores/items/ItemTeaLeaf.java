package com.philip003.newores.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeedFood;

import com.philip003.newores.NewOres;

public class ItemTeaLeaf extends ItemSeedFood {
	public ItemTeaLeaf(int hunger, float saturation, Block Crop, Block Farmland) {
		super(hunger, saturation, Crop, Farmland);
		setTextureName(NewOres.MODID + ":tealeaf");
		setUnlocalizedName("teaLeaf");
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}