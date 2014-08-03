package com.philip003.newores.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

import com.philip003.newores.NewOres;

public class ItemBrcosidianShovel extends ItemSpade {
	public ItemBrcosidianShovel(ToolMaterial mat) {
		super(mat);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(NewOres.MODID + ":brcosidianshovel");
		setUnlocalizedName("brcosidianShovel");
	}
}