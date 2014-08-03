package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.philip003.newores.NewOres;

public class ingotAustralium extends Item {
	public ingotAustralium() {
		super();
		setCreativeTab(CreativeTabs.tabMaterials);
		setTextureName(NewOres.MODID + ":australiumingot");
		setUnlocalizedName("australiumIngot");
	}
}