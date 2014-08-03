package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.world.WorldSettings;

import com.philip003.newores.NewOres;

public class ItemBrcumSword extends ItemSword {

	public ItemBrcumSword(ToolMaterial benedictum) {
		super(benedictum);
		setUnlocalizedName("brcumSword");
		setTextureName(NewOres.MODID + ":" + "brcumsword");
		setCreativeTab(CreativeTabs.tabCombat);
		if (WorldSettings.GameType.CREATIVE == null) {
			this.setDamage(null, 0);
		}
	}
}