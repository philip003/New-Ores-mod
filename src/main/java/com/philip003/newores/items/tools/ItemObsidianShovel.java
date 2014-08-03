package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.philip003.newores.NewOres;

public class ItemObsidianShovel extends ItemSpade {

	public ItemObsidianShovel(ToolMaterial OBSIDIAN) {
		super(OBSIDIAN);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(NewOres.MODID + ":obsidianshovel");
		this.setUnlocalizedName("obsidianShovel");
	}
}