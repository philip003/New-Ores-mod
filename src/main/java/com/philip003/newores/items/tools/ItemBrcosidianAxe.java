package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.philip003.newores.NewOres;

public class ItemBrcosidianAxe extends ItemAxe {
	public ItemBrcosidianAxe(ToolMaterial mat) {
		super(mat);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(NewOres.MODID + ":brcosidianaxe");
		setUnlocalizedName("brcosidianAxe");
	}
}