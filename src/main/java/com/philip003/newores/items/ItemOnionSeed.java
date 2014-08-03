package com.philip003.newores.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.potion.Potion;

import com.philip003.newores.NewOres;

public class ItemOnionSeed extends ItemSeedFood {

	public ItemOnionSeed(int hunger, float saturation, Block Crop,
			Block plantedOn) {
		super(hunger, saturation, Crop, plantedOn);
		setTextureName(NewOres.MODID + ":onionseed");
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("onionSeed");
		setPotionEffect(Potion.poison.id, 15, 1, 0.25F);
	}
}