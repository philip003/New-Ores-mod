package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

import com.philip003.newores.NewOres;

public class ItemBrcosidianPickaxe extends ItemPickaxe {
	public ItemBrcosidianPickaxe(ToolMaterial mat) {
		super(mat);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(NewOres.MODID + ":brcosidianpickaxe");
		setUnlocalizedName("brcosidianPickaxe");
	}
}