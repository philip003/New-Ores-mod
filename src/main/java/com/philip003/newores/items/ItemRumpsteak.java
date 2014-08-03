package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

import com.philip003.newores.NewOres;

public class ItemRumpsteak extends ItemFood {

	public ItemRumpsteak(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setTextureName(NewOres.MODID + ":rumpsteak");
		setCreativeTab(CreativeTabs.tabFood);
		setUnlocalizedName("rumpsteakAusArgentinien");
		setPotionEffect(Potion.damageBoost.id, 30, 1, 0.6F);
	}
}