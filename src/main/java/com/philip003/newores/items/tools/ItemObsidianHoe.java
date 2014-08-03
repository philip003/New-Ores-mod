package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import com.philip003.newores.NewOres;

public class ItemObsidianHoe extends ItemHoe {

	public ItemObsidianHoe(ToolMaterial OBSIDIAN) {
		super(OBSIDIAN);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(NewOres.MODID + ":obsidianhoe");
		this.setUnlocalizedName("obsidianHoe");
	}
}