package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

import com.philip003.newores.NewOres;

public class ItemBrcumAxe extends ItemAxe {

	public ItemBrcumAxe(ToolMaterial benedictum) {
		super(benedictum);
		setUnlocalizedName("brcumAxe");
		setTextureName(NewOres.MODID + ":" + "brcumaxe");
		setCreativeTab(CreativeTabs.tabTools);
	}
}