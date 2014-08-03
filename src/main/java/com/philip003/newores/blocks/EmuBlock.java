package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.philip003.newores.NewOres;

public class EmuBlock extends Block {

	public EmuBlock(Material mat) {
		super(mat);
		setBlockName("emuBlock");
		setBlockTextureName(NewOres.MODID + ":emublock");
		setCreativeTab(CreativeTabs.tabDecorations);
	}
}