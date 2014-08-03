package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.philip003.newores.NewOres;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BenedictumBilobrcum extends Block {

	public BenedictumBilobrcum(Material mat) {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.blockHardness = 2.0F;
		this.blockResistance = 10;
		this.setLightLevel(0.5F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeStone);
		this.setBlockName("benedictumBilobrcum");
		this.setBlockTextureName(NewOres.MODID + ":benedictumbilobrcum");
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1) {
		this.blockIcon = par1.registerIcon(NewOres.MODID
				+ ":benedictumbilobrcum");
	}
}
