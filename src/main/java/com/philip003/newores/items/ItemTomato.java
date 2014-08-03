package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

import com.philip003.newores.NewOres;

public class ItemTomato extends ItemFood {

	public ItemTomato(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setCreativeTab(CreativeTabs.tabFood);
		setUnlocalizedName("itemTomato");
		setTextureName(NewOres.MODID + ":tomato");
	}

}