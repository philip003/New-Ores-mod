package com.philip003.newores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class ItemDefSpeedOrb extends Item {
	private final float defFlyingSpeed = 0.05F;

	public ItemDefSpeedOrb() {
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(NewOres.MODID + ":creativedefspeedorb");
		setUnlocalizedName("creativeDefSpeedOrb");
		setMaxStackSize(1);
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		if (par3EntityPlayer.inventory.hasItem(NewOres.creativeDefSpeedOrb) == true
				&& par3EntityPlayer.capabilities.isCreativeMode == true) {
			if (par3EntityPlayer.getCurrentEquippedItem() != null) {
				if (par3EntityPlayer.getCurrentEquippedItem() == par1ItemStack)
					par3EntityPlayer.capabilities.setFlySpeed(defFlyingSpeed);
				par3EntityPlayer
						.addChatMessage(new ChatComponentText(
								"set EntityPlayer.capabilites.flySpeed to default (0.05F)"));
			}
		}
		return par1ItemStack;
	}
}