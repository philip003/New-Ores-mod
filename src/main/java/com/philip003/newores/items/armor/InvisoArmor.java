package com.philip003.newores.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.philip003.newores.NewOres;

public class InvisoArmor extends ItemArmor {

	public InvisoArmor(ArmorMaterial mat, int id, int placing) {
		super(mat, id, placing);
		setCreativeTab(CreativeTabs.tabCombat);

		switch (placing) {
		case 0:
			this.setTextureName(NewOres.MODID + ":invisohelmet");
			break;
		case 1:
			this.setTextureName(NewOres.MODID + ":invisochestplate");
			break;
		case 2:
			this.setTextureName(NewOres.MODID + ":invisoleggings");
			break;
		case 3:
			this.setTextureName(NewOres.MODID + ":invisoboots");
		}
	}

	public String getArmorTexture(ItemStack stack, Entity ent, int slot,
			String type) {
		if (stack.getItem() == NewOres.InvisoHelmet
				|| stack.getItem() == NewOres.InvisoChestplate
				|| stack.getItem() == NewOres.InvisoBoots) {
			return NewOres.MODID + ":textures/models/armor/InvisoArmor1.png";
		}
		if (stack.getItem() == NewOres.InvisoLeggings) {
			return NewOres.MODID + ":textures/models/armor/InvisoArmor2.png";
		} else {
			return null;
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (player.getCurrentArmor(3) != null
				&& player.getCurrentArmor(2) != null
				&& player.getCurrentArmor(1) != null
				&& player.getCurrentArmor(0) != null) {
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack chestplate = player.getCurrentArmor(2);
			ItemStack leggings = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);
			if (helmet.getItem() == NewOres.InvisoHelmet
					&& chestplate.getItem() == NewOres.InvisoChestplate
					&& leggings.getItem() == NewOres.InvisoLeggings
					&& boots.getItem() == NewOres.InvisoBoots) {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id,
						300));
			}
			if (player.getCurrentArmor(3) != null) {
				ItemStack invHelmet = player.getCurrentArmor(3);
				if (invHelmet.getItem() == NewOres.InvisoHelmet) {
					player.addPotionEffect(new PotionEffect(
							Potion.nightVision.id, 300));
				}
			}
		}
	}
}