package com.philip003.newores.items;

import com.philip003.newores.NewOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAustraliumShard extends Item {
	public ItemAustraliumShard() {
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(NewOres.MODID + ":australiumshard");
		setUnlocalizedName("australiumShard");
	}
}