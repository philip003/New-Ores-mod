package com.philip003.newores;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipeRegistry {
	public static void initShapeless() {
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.bottleWodka, 1),
				new Object[] { new ItemStack(NewOres.wheatDistillate, 1),
						new ItemStack(Items.glass_bottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.tomatoSeed, 2),
				new Object[] { NewOres.itemTomato });
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.onionSeed, 2),
				new Object[] { NewOres.itemOnion });
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.Brcum, 9),
				new Object[] { NewOres.benedictumBilobrcumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.australiumIngot,
				9), new Object[] { NewOres.australiumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.goldenButton, 2),
				new Object[] { Items.gold_ingot, Blocks.wooden_button });
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.maracujaSeed, 2),
				new Object[] { NewOres.maracuja });
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.iceTea, 1),
				new Object[] { NewOres.maracuja, Items.sugar, NewOres.tea,
						Items.water_bucket });
		GameRegistry.addShapelessRecipe(new ItemStack(NewOres.tea, 1),
				new Object[] { NewOres.teaLeaf, Items.paper,
						Items.glass_bottle, Items.sugar });
	}

	public static void initShaped() {
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.spawnerBars, 1),
				new Object[] { "BBB", "BDB", "BBB", 'B', Blocks.iron_bars, 'D',
						Blocks.diamond_block });
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.ender_chest, 1),
				new Object[] { "DDD", "DCD", "DDD", 'C', Blocks.chest, 'D',
						Blocks.dirt });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.australiumBlock, 1),
				new Object[] { "AAA", "AAA", "AAA", 'A',
						NewOres.australiumIngot });
		GameRegistry.addShapedRecipe(new ItemStack(
				NewOres.benedictumBilobrcumBlock, 1), new Object[] { "BBB",
				"BBB", "BBB", 'B', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.survivalKit, 1),
				new Object[] { "RIW", "IBI", "FIC", 'R',
						NewOres.rumpsteakAusArgentinien, 'I', Items.iron_ingot,
						'W', NewOres.bottleWodka, 'B', NewOres.Brcum, 'F',
						NewOres.flyingStaff, 'C', NewOres.flerCarrot });
		GameRegistry.addShapedRecipe(new ItemStack(
				NewOres.rumpsteakAusArgentinien, 2), new Object[] { "KKK",
				"KPK", "KKK", 'P', Items.cooked_porkchop, 'K', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(
				NewOres.rumpsteakAusArgentinien, 2), new Object[] { "KKK",
				"KBK", "KKK", 'K', NewOres.Brcum, 'B', Items.cooked_beef });
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.mob_spawner, 1, 54),
				"SSS", "SZS", "SSS", 'S',
				new ItemStack(NewOres.spawnerBars, 1), 'Z', new ItemStack(
						Items.spawn_egg, 1, 90));
		GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 54),
				new Object[] { "RRR", "RDR", "RRR", 'R', Items.rotten_flesh,
						'D', Items.diamond });
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot, 1),
				new Object[] { "KKK", "   ", "   ", 'K', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(Items.diamond, 1),
				new Object[] { "KKK", "KKK", "KKK", 'K', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(Items.redstone, 4),
				new Object[] { "K K", "   ", "   ", 'K', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(Items.emerald, 1),
				new Object[] { "KKK", " K ", "KKK", 'K', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(Items.experience_bottle, 1),
				new Object[] { "   ", "KKK", "   ", 'K', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcumCrystal, 8),
				new Object[] { "KKK", "RDR", "KKK", 'K', NewOres.Brcum, 'R',
						Items.redstone, 'D', Items.emerald });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.flerCarrot, 8),
				new Object[] { "CCC", "CRC", "CCC", 'C', Items.carrot, 'R',
						NewOres.rumpsteakAusArgentinien });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.flyingStaff, 1),
				new Object[] { "KKK", "KFK", "KKK", 'K', NewOres.Brcum, 'F',
						Items.feather });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.invisoBlock, 1),
				new Object[] { "HHH", "HBH", "HHH", 'H',
						NewOres.hardenedObsidian, 'B', NewOres.brcumCrystal });
		GameRegistry
				.addShapedRecipe(new ItemStack(NewOres.australiumShard, 1),
						new Object[] { "AAA", "AAA", "AAA", 'A',
								NewOres.australiumDust });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.australiumIngot, 1),
				new Object[] { "SSS", "SSS", "SSS", 'S',
						NewOres.australiumShard });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.miningDrill, 1),
				new Object[] { "IDI", "IAI", "IRI", 'I', Blocks.iron_block,
						'D', Items.diamond_pickaxe, 'A',
						NewOres.australiumBlock, 'R', Blocks.redstone_block });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.joint, 1),
				new Object[] { "PPP", "PWP", "PPP", 'P', Items.paper, 'W',
						NewOres.driedWeed });
	}

	public static void initSmelting() {
		GameRegistry.addSmelting(NewOres.BenedictumBilobrcum, new ItemStack(
				NewOres.Brcum, 1), 1.5F);
		GameRegistry.addSmelting(Items.wheat, new ItemStack(
				NewOres.wheatDistillate, 1), 1.0F);
		GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(
				NewOres.hardenedObsidian, 1), 1.0F);
		GameRegistry.addSmelting(NewOres.australiumOre, new ItemStack(
				NewOres.australiumIngot, 1), 1.0F);
		GameRegistry.addSmelting(NewOres.weed,
				new ItemStack(NewOres.driedWeed), 1.5F);
	}

	public static void initArmor() {
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.InvisoHelmet, 1),
				new Object[] { "III", "I I", "   ", 'I', NewOres.invisoBlock });
		GameRegistry.addShapedRecipe(
				new ItemStack(NewOres.InvisoChestplate, 1), new Object[] {
						"I I", "III", "III", 'I', NewOres.invisoBlock });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.InvisoLeggings, 1),
				new Object[] { "III", "I I", "I I", 'I', NewOres.invisoBlock });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.InvisoBoots, 1),
				new Object[] { "I I", "I I", "   ", 'I', NewOres.invisoBlock });
	}

	public static void initBrcumTools() {
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcumSword, 1),
				new Object[] { " K ", " K ", " S ", 'K', NewOres.Brcum, 'S',
						Items.gold_ingot });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcumPickaxe, 1),
				new Object[] { "KKK", " S ", " S ", 'K', NewOres.Brcum, 'S',
						Items.gold_ingot });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcumAxe, 1),
				new Object[] { "KK ", "KS ", " S ", 'K', NewOres.Brcum, 'S',
						Items.gold_ingot });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcumHoe, 1),
				new Object[] { "KK ", " S ", " S ", 'K', NewOres.Brcum, 'S',
						Items.gold_ingot });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcumShovel, 1),
				new Object[] { " K ", " S ", " S ", 'K', NewOres.Brcum, 'S',
						Items.gold_ingot });
	}

	public static void initObsidianTools() {
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.obsidianPickaxe, 1),
				new Object[] { "OOO", " S ", " S ", 'O',
						NewOres.hardenedObsidian, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.obsidianAxe, 1),
				new Object[] { " OO", " SO", " S ", 'O',
						NewOres.hardenedObsidian, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.obsidianShovel, 1),
				new Object[] { " O ", " S ", " S ", 'O',
						NewOres.hardenedObsidian, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.obsidianSword, 1),
				new Object[] { " O ", " O ", " S ", 'O',
						NewOres.hardenedObsidian, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.obsidianHoe, 1),
				new Object[] { "OO ", " S ", " S ", 'O',
						NewOres.hardenedObsidian, 'S', Items.stick });
	}

	public static void initBrcosidianTools() {
		GameRegistry.addShapedRecipe(
				new ItemStack(NewOres.brcosidianPickaxe, 1), new Object[] {
						"HOH", " B ", " B ", 'H', NewOres.hardenedObsidian,
						'O', NewOres.obsidianPickaxe, 'B', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcosidianAxe),
				new Object[] { "OO ", "OB ", " B ", 'O', NewOres.obsidianAxe,
						'B', NewOres.Brcum });
		GameRegistry.addShapedRecipe(
				new ItemStack(NewOres.brcosidianShovel, 1), new Object[] {
						" O ", " B ", " B ", 'O', NewOres.obsidianShovel, 'B',
						NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcosidianSword, 1),
				new Object[] { " O ", " O ", " B ", 'O', NewOres.obsidianSword,
						'B', NewOres.Brcum });
		GameRegistry.addShapedRecipe(new ItemStack(NewOres.brcosidianHoe, 1),
				new Object[] { "OO ", " B ", " B ", 'O', NewOres.obsidianHoe,
						'B', NewOres.Brcum });
	}
}