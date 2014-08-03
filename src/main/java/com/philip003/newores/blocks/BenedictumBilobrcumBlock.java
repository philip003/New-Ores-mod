package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.philip003.newores.NewOres;

public class BenedictumBilobrcumBlock extends Block {

	public BenedictumBilobrcumBlock(Material mat) {
		super(mat);
		setBlockTextureName(NewOres.MODID + ":benedictumbilobrcumblock");
		setBlockName("benedictumBilobrcumBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(4.0F);
		setResistance(100);
		setHarvestLevel("pickaxe", 3);
	}
}