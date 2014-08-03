package com.philip003.newores.blocks;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.philip003.newores.NewOres;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TomatoCrop extends BlockCrops {

	private IIcon[] IconRegister;

	public TomatoCrop() {
		this.setBlockName("tomatoCrop");
		this.setBlockTextureName(NewOres.MODID + "tomato_stage" + "_0");
	}

	protected Item func_149866_i() {
		return NewOres.tomatoSeed;
	}

	protected Item func_149865_P() {
		return NewOres.itemTomato;
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random rand) {
		return 1;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.IconRegister = new IIcon[8];
		this.IconRegister[0] = p_149651_1_.registerIcon(NewOres.MODID
				+ ":tomatoes_stage_0");
		this.IconRegister[1] = p_149651_1_.registerIcon(NewOres.MODID
				+ ":tomatoes_stage_0");
		this.IconRegister[2] = p_149651_1_.registerIcon(NewOres.MODID
				+ ":tomatoes_stage_1");
		this.IconRegister[3] = p_149651_1_.registerIcon(NewOres.MODID
				+ ":tomatoes_stage_1");
		this.IconRegister[4] = p_149651_1_.registerIcon(NewOres.MODID
				+ ":tomatoes_stage_2");
		this.IconRegister[5] = p_149651_1_.registerIcon(NewOres.MODID
				+ ":tomatoes_stage_2");
		this.IconRegister[6] = p_149651_1_.registerIcon(NewOres.MODID
				+ ":tomatoes_stage_2");
		this.IconRegister[7] = p_149651_1_.registerIcon(NewOres.MODID
				+ ":tomatoes_stage_3");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		if (p_149691_2_ < 0 || p_149691_2_ > 7) {
			p_149691_2_ = 7;
		}

		return this.IconRegister[p_149691_2_];
	}
}