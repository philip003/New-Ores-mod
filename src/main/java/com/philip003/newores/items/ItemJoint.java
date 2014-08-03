package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemJoint extends ItemFood {

	public ItemJoint(int hunger, boolean isWolfFood) {
		super(hunger, isWolfFood);
		setTextureName(NewOres.MODID + ":joint");
		setUnlocalizedName("joint");
		setAlwaysEdible();
		setCreativeTab(CreativeTabs.tabFood);
	}

	protected void onFoodEaten(ItemStack par1, World par2, EntityPlayer par3) {
		par3.addPotionEffect(new PotionEffect(Potion.confusion.id, 420, 0));
		par3.addPotionEffect(new PotionEffect(Potion.jump.id, 420, 10));
		par3.addPotionEffect(new PotionEffect(Potion.resistance.id, 420, 4));
		par3.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 420, 10));
		par3.addPotionEffect(new PotionEffect(Potion.blindness.id, 420, 0));
		par3.addPotionEffect(new PotionEffect(Potion.weakness.id, 420, 1));
		par2.playSoundAtEntity(par3, "newores:smokeweed", 2F, 1F);
		par3.addChatMessage(new ChatComponentText("420blazeit!"));
	}
}