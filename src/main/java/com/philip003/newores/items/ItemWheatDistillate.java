package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.philip003.newores.NewOres;

public class ItemWheatDistillate extends Item {
	public ItemWheatDistillate() {
		setTextureName(NewOres.MODID + ":wheatdistillate");
		setUnlocalizedName("wheatDistillate");
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
