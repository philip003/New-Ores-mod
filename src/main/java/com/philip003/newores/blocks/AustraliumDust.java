package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.philip003.newores.NewOres;

public class AustraliumDust extends Block {

	public AustraliumDust(Material mat) {
		super(Material.ground);
		setBlockName("australiumDust");
		setBlockTextureName(NewOres.MODID + ":australiumdust");
		setHardness(0.6F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("shovel", 3);
		setStepSound(Block.soundTypeGravel);
	}
}