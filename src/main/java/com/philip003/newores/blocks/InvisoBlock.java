package com.philip003.newores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class InvisoBlock extends Block {

	public InvisoBlock(Material mat) {
		super(mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockUnbreakable();
		this.blockResistance = 100000000;
	}

	public boolean onBlockActivated(World par1World, int par2, int par3,
			int par4, EntityPlayer par5EntityPlayer, int par6, float par7,
			float par8, float par9) {
		if (par5EntityPlayer.getHeldItem() == null) {
			return super.onBlockActivated(par1World, par2, par3, par4,
					par5EntityPlayer, par6, par7, par8, par9);
		}

		if (par5EntityPlayer.inventory.hasItem(NewOres.brcumCrystal)) {
			par5EntityPlayer.inventory
					.consumeInventoryItem(NewOres.brcumCrystal);
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(
					NewOres.invisoBlock, 1));
			if (par1World.isRemote) {
				return true;
			} else {
				par1World.setBlock(par2, par3, par4, Blocks.air);
				return true;
			}
		}
		return super.onBlockActivated(par1World, par2, par3, par4,
				par5EntityPlayer, par6, par7, par8, par9);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1) {
		this.blockIcon = par1.registerIcon(NewOres.MODID + ":invisoblock");
	}

	public boolean isOpaqueCube() {
		return false;
	}
}
