package com.philip003.newores.blocks;

import net.minecraft.block.BlockButton;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GoldenButton extends BlockButton {

	public GoldenButton() {
		super(true);
		setBlockName("goldenButton");
		setHardness(1.0F);
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return Blocks.gold_block.getBlockTextureFromSide(1);
	}
}