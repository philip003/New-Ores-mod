package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

import com.philip003.newores.NewOres;

public class ItemBrcumHoe extends ItemHoe {

	public ItemBrcumHoe(ToolMaterial benedictum) {
		super(benedictum);
		setUnlocalizedName("brcumHoe");
		setTextureName(NewOres.MODID + ":" + "brcumhoe");
		setCreativeTab(CreativeTabs.tabTools);
	}
}