package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.FoodStats;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemBottleWodka extends ItemFood {

	public ItemBottleWodka(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setTextureName(NewOres.MODID + ":bottlewodka");
		setUnlocalizedName("bottleWodka");
		setCreativeTab(CreativeTabs.tabFood);
		super.setAlwaysEdible();
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.drink;
	}

	protected void onFoodEaten(ItemStack itemstack, World world,
			EntityPlayer player) {
		double rand = Math.random();
		FoodStats foodBar = player.getFoodStats();
		if (foodBar.getFoodLevel() == 0) {
			player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200,
					0));
			if (rand <= 0.25) {
				player.addPotionEffect(new PotionEffect(Potion.blindness.id,
						600, 3));
				player.addPotionEffect(new PotionEffect(Potion.weakness.id,
						150, 0));
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 150,
						1));
			}
		} else if (foodBar.getFoodLevel() == 20) {
			player.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 0));
		} else {
			player.addPotionEffect(new PotionEffect(Potion.confusion.id, 700, 0));
		}
	}
}