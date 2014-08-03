package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

import com.philip003.newores.NewOres;

public class ItemOnion extends ItemFood {

	public ItemOnion(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setTextureName(NewOres.MODID + ":onion");
		setCreativeTab(CreativeTabs.tabFood);
		setUnlocalizedName("itemOnion");
	}
}