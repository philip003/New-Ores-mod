package com.philip003.newores.items.tools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemMiningDrill extends Item {
	public ItemMiningDrill() {
		setCreativeTab(CreativeTabs.tabTools);
		setMaxDamage(200);
		setMaxStackSize(1);
		setUnlocalizedName("miningDrill");
		setTextureName(NewOres.MODID + ":miningdrill");
	}

	@Override
	public float func_150893_a(ItemStack par1, Block par2) {
		return 14.0F;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack par1, World par2,
			Block blockDestroyed, int x, int y, int z, EntityLivingBase entity) {
		int itemDamage = getDamage(par1);
		if (par1.getItem() == NewOres.miningDrill
				&& blockDestroyed.getMaterial() == Material.rock
				&& entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack stackBlockDestroyed = new ItemStack(blockDestroyed, 1);
			par1.damageItem(1, player);
			player.inventory.addItemStackToInventory(stackBlockDestroyed);
			if (itemDamage > 190) {
				player.addChatMessage(new ChatComponentText(
						"Your drill is almost drained! If you don't refill it with German coal by right clicking it, it'll get destroyed!"));
			}
		}

		if (par1.getItem() == NewOres.miningDrill
				&& blockDestroyed.getMaterial() == Material.wood
				|| blockDestroyed.getMaterial() == Material.glass
				|| blockDestroyed.getMaterial() == Material.sand
				|| blockDestroyed.getMaterial() == Material.web
				|| blockDestroyed.getMaterial() == Material.piston
				|| blockDestroyed.getMaterial() == Material.clay
				|| blockDestroyed.getMaterial() == Material.gourd
				|| blockDestroyed.getMaterial() == Material.cactus
				|| blockDestroyed.getMaterial() == Material.grass
				|| blockDestroyed.getMaterial() == Material.ground
				&& entity instanceof EntityPlayer) {
			EntityPlayer player2 = (EntityPlayer) entity;
			par1.damageItem(1, player2);
			if (itemDamage > 190) {
				player2.addChatMessage(new ChatComponentText(
						"Your drill is almost drained! If you don't refill it with German coal by right clicking it, it'll get destroyed!"));
			}
		}
		return super.onBlockDestroyed(par1, par2, blockDestroyed, x, y, z,
				entity);
	}

	public ItemStack onItemRightClick(ItemStack par1, World par2,
			EntityPlayer par3) {
		int itemDamage = par1.getItemDamage();
		ItemStack coalRefill = new ItemStack(Items.coal, 1);
		if (itemDamage != 0) {
			if (par3.inventory.hasItemStack(coalRefill)) {
				par1.setItemDamage(-250);
				par3.inventory.consumeInventoryItem(Items.coal);
			}
		}

		if (itemDamage <= 189) {
			par3.addChatMessage(new ChatComponentText(
					"Your drill's fuel meter shows:" + " " + itemDamage + " "
							+ "uses on blocks by now."));
		} else {
			par3.addChatMessage(new ChatComponentText(
					"Your drill's fuel meter shows" + " " + itemDamage + "!"
							+ " " + "If you don't refill it, it'll explode!"));
		}
		return par1;
	}
}