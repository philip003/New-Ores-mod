package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemFlyingStaff extends Item {
	public ItemFlyingStaff() {
		setTextureName(NewOres.MODID + ":flyingstaff");
		setUnlocalizedName("flyingStaff");
		setCreativeTab(CreativeTabs.tabTools);
		setMaxDamage(100);
		maxStackSize = 1;
	}

	public ItemStack onItemRightClick(ItemStack par1, World par2,
			EntityPlayer par3) {
		par3.jump();
		par3.fallDistance = 0F;
		par1.damageItem(1, par3);
		return par1;
	}
}