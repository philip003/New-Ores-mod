package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.philip003.newores.NewOres;

public class AustraliumOre extends Block {

	public AustraliumOre(Material mat) {
		super(mat);
		setBlockName("australiumOre");
		setBlockTextureName(NewOres.MODID + ":australiumore");
		setHardness(2.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setResistance(100);
		setHarvestLevel("pickaxe", 3);
	}
}