package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemFlerCarrot extends ItemFood {

	public ItemFlerCarrot(int p_i45339_1_, float p_i45339_2_,
			boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		setCreativeTab(CreativeTabs.tabFood);
		setUnlocalizedName("flerCarrot");
		setTextureName(NewOres.MODID + ":flercarrot");
	}

	public void onFoodEaten(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		par3EntityPlayer
				.addChatMessage(new ChatComponentTranslation(
						"You have inserted a carrot into your anus. Have fun with the side effects."));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id,
				8400, 0));
	}
}