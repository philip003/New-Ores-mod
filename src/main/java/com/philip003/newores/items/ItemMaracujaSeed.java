package com.philip003.newores.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.potion.Potion;

import com.philip003.newores.NewOres;

public class ItemMaracujaSeed extends ItemSeedFood {
	public ItemMaracujaSeed(int hunger, float saturation, Block Crop,
			Block plantedOn) {
		super(hunger, saturation, Crop, plantedOn);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("maracujaSeed");
		setTextureName(NewOres.MODID + ":maracujaseed");
		setPotionEffect(Potion.poison.id, 10, 1, 0.25F);
	}
}