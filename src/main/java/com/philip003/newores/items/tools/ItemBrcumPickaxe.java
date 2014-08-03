package com.philip003.newores.items.tools;

import com.philip003.newores.NewOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemBrcumPickaxe extends ItemPickaxe {

	public ItemBrcumPickaxe(ToolMaterial benedictum) {
		super(benedictum);
		setUnlocalizedName("brcumPickaxe");
		setTextureName(NewOres.MODID + ":" + "brcumpickaxe");
		setCreativeTab(CreativeTabs.tabTools);
	}	
}