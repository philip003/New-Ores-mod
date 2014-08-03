package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemSpeedOrb extends Item {
	public ItemSpeedOrb() {
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(NewOres.MODID + ":creativespeedorb");
		setUnlocalizedName("creativeSpeedOrb");
		setMaxStackSize(1);
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		if (par3EntityPlayer.inventory.hasItem(NewOres.creativeSpeedOrb) == true
				&& par3EntityPlayer.capabilities.isCreativeMode == true) {
			if (par3EntityPlayer.getCurrentEquippedItem() != null) {
				if (par3EntityPlayer.getCurrentEquippedItem() == par1ItemStack)
					par3EntityPlayer.capabilities.setFlySpeed(0.25F);
				par3EntityPlayer.addChatMessage(new ChatComponentText(
						"set EntityPlayer.capabilites.flySpeed to 0.25F"));
			}
		}
		return par1ItemStack;
	}
}