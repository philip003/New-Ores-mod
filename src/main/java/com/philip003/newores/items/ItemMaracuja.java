package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

import com.philip003.newores.NewOres;

public class ItemMaracuja extends ItemFood {

	public ItemMaracuja(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setTextureName(NewOres.MODID + ":maracuja");
		setUnlocalizedName("maracuja");
		setCreativeTab(CreativeTabs.tabFood);
	}
}