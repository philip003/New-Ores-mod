package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemSurvivalKit extends Item {
	public ItemSurvivalKit() {
		setTextureName(NewOres.MODID + ":survivalkit");
		setUnlocalizedName("survivalKit");
		setCreativeTab(CreativeTabs.tabMisc);
		setMaxStackSize(1);
	}

	public ItemStack onItemRightClick(ItemStack par1, World par2,
			EntityPlayer par3) {
		par3.inventory.addItemStackToInventory(new ItemStack(Items.cooked_beef,
				10));
		par3.inventory.addItemStackToInventory(new ItemStack(Blocks.planks, 32,
				0));
		par3.inventory.addItemStackToInventory(new ItemStack(
				Blocks.cobblestone, 16));
		par3.inventory.addItemStackToInventory(new ItemStack(Items.gold_ingot,
				1));
		par3.inventory.addItemStackToInventory(new ItemStack(Items.wheat_seeds,
				1));
		par3.inventory.addItemStackToInventory(new ItemStack(Items.carrot, 1));
		par3.inventory.addItemStackToInventory(new ItemStack(
				NewOres.bottleWodka, 64));
		par3.inventory.consumeInventoryItem(NewOres.survivalKit);
		par3.getFoodStats().addStats(20, 1.0F);
		par3.setHealth(20.0F);
		par3.addChatMessage(new ChatComponentText("Good luck surviving!"));
		return par1;
	}
}