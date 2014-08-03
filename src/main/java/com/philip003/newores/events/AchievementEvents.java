package com.philip003.newores.events;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import com.philip003.newores.NewOres;
import com.philip003.newores.achievements.oreAchievements;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

public class AchievementEvents {

	@SubscribeEvent
	public void onBenedictumPickup(ItemPickupEvent e) {
		if (Block.getBlockFromItem(e.pickedUp.getEntityItem().getItem())
				.equals(NewOres.BenedictumBilobrcum)) {
			e.player.addStat(oreAchievements.achievementPickupBrcum, 1);
		}
		if (e.isCancelable()) {
			e.setCanceled(true);
		}
	}

	@SubscribeEvent
	public void onAustraliumSmelt(ItemSmeltedEvent e) {
		if (e.smelting.getItem() == NewOres.australiumIngot) {
			e.player.addStat(oreAchievements.achievementSmeltAustralium, 1);
		}
	}

	@SubscribeEvent
	public void makeEisteesuchtHappy(ItemCraftedEvent e) {
		if (Block.getBlockFromItem(e.crafting.getItem()) == NewOres.goldenButton) {
			e.player.addStat(oreAchievements.achievementMakeTobiasHappy, 1);
		}
	}

	@SubscribeEvent
	public void mineBestOre(ItemPickupEvent e) {
		if (Block.getBlockFromItem(e.pickedUp.getEntityItem().getItem()) == Blocks.gold_ore) {
			e.player.addStat(oreAchievements.achievementMineGold, 1);
		}
	}

	@SubscribeEvent
	public void craftBestBlock(ItemCraftedEvent e) {
		if (Block.getBlockFromItem(e.crafting.getItem()) == Blocks.gold_block) {
			e.player.addStat(oreAchievements.achievementMakeTobiasVeryHappy, 1);
		}
	}

	@SubscribeEvent
	public void craftTheDrill(ItemCraftedEvent e) {
		if (e.crafting.getItem() == NewOres.miningDrill) {
			e.player.addStat(oreAchievements.achievementKnowTheDrill, 1);
		}
	}
}