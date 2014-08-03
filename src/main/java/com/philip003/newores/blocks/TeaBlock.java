package com.philip003.newores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.philip003.newores.NewOres;

public class TeaBlock extends Block {

	public TeaBlock(Material mat) {
		super(mat);
		setBlockTextureName(NewOres.MODID + ":teablock");
		setBlockName("teaBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(3.0F);
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		return NewOres.teaLeaf;
	}

	public int quantityDropped(Random p_149745_1_) {
		return 3 + p_149745_1_.nextInt(5);
	}
}