package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

import com.philip003.newores.NewOres;

public class ItemObsidianPickaxe extends ItemPickaxe {

	public ItemObsidianPickaxe(ToolMaterial OBSIDIAN) {
		super(OBSIDIAN);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(NewOres.MODID + ":obsidianpickaxe");
		this.setUnlocalizedName("obsidianPickaxe");
	}
}