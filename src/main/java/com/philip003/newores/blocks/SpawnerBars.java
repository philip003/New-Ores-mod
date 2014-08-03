package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.philip003.newores.NewOres;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpawnerBars extends Block {

	public SpawnerBars(Material mat) {
		super(mat);
		setStepSound(soundTypeMetal);
		setBlockName("spawnerBars");
		setBlockTextureName(NewOres.MODID + ":spawnerbars");
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(5.0F);
		setHarvestLevel("pickaxe", 3);
	}

	public boolean isOpaqueCube() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1) {
		this.blockIcon = par1.registerIcon(NewOres.MODID + ":spawnerbars");
	}
}
