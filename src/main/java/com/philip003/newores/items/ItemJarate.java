package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemJarate extends ItemFood {
	public ItemJarate(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setTextureName(NewOres.MODID + ":jarate");
		setUnlocalizedName("jarate");
		setCreativeTab(CreativeTabs.tabFood);
		setAlwaysEdible();
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.drink;
	}

	protected void onFoodEaten(ItemStack itemstack, World world,
			EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(Potion.blindness.id, 420, 0));
		player.addPotionEffect(new PotionEffect(Potion.weakness.id, 420, 2));
		if (player.isBurning()) {
			player.extinguish();
		}
	}
}