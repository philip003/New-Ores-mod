package com.philip003.newores.items;

import net.minecraft.item.ItemFood;

import com.philip003.newores.NewOres;

public class ItemTea extends ItemFood {

	public ItemTea(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setTextureName(NewOres.MODID + ":tea");
		setUnlocalizedName("tea");
	}
}