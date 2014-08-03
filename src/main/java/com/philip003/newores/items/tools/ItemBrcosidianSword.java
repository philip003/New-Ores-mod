package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.world.WorldSettings;

import com.philip003.newores.NewOres;

public class ItemBrcosidianSword extends ItemSword {
	public ItemBrcosidianSword(ToolMaterial mat) {
		super(mat);
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(NewOres.MODID + ":brcosidiansword");
		setUnlocalizedName("brcosidianSword");
		if (WorldSettings.GameType.CREATIVE == null) {
			this.setDamage(null, 0);
		}
	}
}