package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.world.WorldSettings;

import com.philip003.newores.NewOres;

public class ItemObsidianSword extends ItemSword {

	public ItemObsidianSword(ToolMaterial OBSIDIAN) {
		super(OBSIDIAN);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(NewOres.MODID + ":obsidiansword");
		this.setUnlocalizedName("obsidianSword");
		if (WorldSettings.GameType.CREATIVE == null) {
			this.setDamage(null, 0);
		}
	}
}