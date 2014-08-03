package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.philip003.newores.NewOres;

public class ItemBrcumShovel extends ItemSpade {

	public ItemBrcumShovel(ToolMaterial benedictum) {
		super(benedictum);
		setUnlocalizedName("brcumShovel");
		setTextureName(NewOres.MODID + ":" + "brcumshovel");
		setCreativeTab(CreativeTabs.tabTools);
	}
}