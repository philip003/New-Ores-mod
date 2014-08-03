package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.philip003.newores.NewOres;

public class ItemObsidianAxe extends ItemAxe {

	public ItemObsidianAxe(ToolMaterial OBSIDIAN) {
		super(OBSIDIAN);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(NewOres.MODID + ":obsidianaxe");
		this.setUnlocalizedName("obsidianAxe");
	}
}