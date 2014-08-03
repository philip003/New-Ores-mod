package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBrcum extends ItemFood {

	public ItemBrcum(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setCreativeTab(CreativeTabs.tabMaterials);
	}

	protected void onFoodEaten(ItemStack itemstack, World world,
			EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1200, 0));
		player.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 0));
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 420, 1));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 100, 1));
	}
}