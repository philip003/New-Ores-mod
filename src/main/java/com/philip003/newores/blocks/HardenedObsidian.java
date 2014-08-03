package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.philip003.newores.NewOres;

public class HardenedObsidian extends Block {

	public HardenedObsidian(Material mat) {
		super(mat);
		setBlockName("hardenedObsidian");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(NewOres.MODID + ":hardenedobsidian");
		setHardness(100.0F);
		setHarvestLevel("pickaxe", 3);
		setResistance(3000.0F);
		setStepSound(soundTypePiston);
	}
}