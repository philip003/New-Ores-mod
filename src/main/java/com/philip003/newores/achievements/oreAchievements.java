package com.philip003.newores.achievements;

import net.minecraft.init.Blocks;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

import com.philip003.newores.NewOres;

public class oreAchievements {
	public static Achievement achievementPickupBrcum;
	public static Achievement achievementSmeltAustralium;
	public static Achievement achievementMakeTobiasHappy;
	public static Achievement achievementMakeTobiasVeryHappy;
	public static Achievement achievementMineGold;
	public static Achievement achievementKnowTheDrill;

	public static void init() {
		achievementMineGold = new Achievement("achievement.minegold",
				"minegold", 0, 6, Blocks.gold_ore, AchievementList.acquireIron)
				.registerStat();
		achievementMakeTobiasHappy = new Achievement(
				"achievement.makehimhappy", "makehimhappy", 0, 3,
				Blocks.gold_block, achievementMineGold).registerStat();
		achievementMakeTobiasVeryHappy = new Achievement(
				"achievement.makeveryhappy", "makeveryhappy", 0, 1,
				Blocks.gold_block, achievementMakeTobiasHappy).registerStat();
		achievementSmeltAustralium = new Achievement(
				"achievement.australiumingot", "australiumingot", -2, 3,
				NewOres.australiumIngot, AchievementList.diamonds)
				.registerStat().setSpecial();
		achievementPickupBrcum = new Achievement("achievement.pickupbrcum",
				"pickupbrcum", -2, 1, NewOres.Brcum, AchievementList.diamonds)
				.registerStat();
		achievementKnowTheDrill = new Achievement("achievement.knowTheDrill",
				"knowTheDrill", -3, 5, NewOres.miningDrill,
				achievementSmeltAustralium).registerStat();
	}
}