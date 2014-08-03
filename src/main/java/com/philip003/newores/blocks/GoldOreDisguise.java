package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GoldOreDisguise extends Block {

	public GoldOreDisguise(Material mat) {
		super(mat);
		setBlockTextureName("gold_ore");
		setBlockName("goldOreDisguise");
		setHardness(3.0F);
		setResistance(5.0F);
		setCreativeTab(null);
		setHarvestLevel("pickaxe", 2);
	}
}