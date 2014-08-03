package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.philip003.newores.NewOres;

public class ItemDriedWeed extends Item {

	public ItemDriedWeed() {
		super();
		setTextureName(NewOres.MODID + ":weed");
		setUnlocalizedName("driedWeed");
		setCreativeTab(CreativeTabs.tabFood);
	}
}