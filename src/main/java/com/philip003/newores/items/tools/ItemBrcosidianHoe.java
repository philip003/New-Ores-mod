package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import com.philip003.newores.NewOres;

public class ItemBrcosidianHoe extends ItemHoe {
	public ItemBrcosidianHoe(ToolMaterial mat) {
		super(mat);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(NewOres.MODID + ":brcosidianhoe");
		setUnlocalizedName("brcosidianHoe");
	}
}