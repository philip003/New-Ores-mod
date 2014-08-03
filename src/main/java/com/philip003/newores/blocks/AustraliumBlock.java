package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.philip003.newores.NewOres;

public class AustraliumBlock extends Block {
	public AustraliumBlock(Material mat) {
		super(mat);
		setBlockTextureName(NewOres.MODID + ":australiumblock");
		setBlockName("australiumBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(5.0F);
		setResistance(420);
		setHarvestLevel("pickaxe", 3);
	}
}