package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.philip003.newores.NewOres;

public class DiamondOreDisguise extends Block {

	public DiamondOreDisguise(Material mat) {
		super(mat);
		setBlockName("diamondOreDisguise");
		setBlockTextureName(NewOres.MODID + ":diamondoredisguise");
		setHardness(3.0F);
		setCreativeTab(null);
		setHarvestLevel("pickaxe", 2);
	}
}