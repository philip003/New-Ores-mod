package com.philip003.newores;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;

import com.philip003.newores.achievements.oreAchievements;
import com.philip003.newores.biomes.BiomeAustralia;
import com.philip003.newores.blocks.AustraliumBlock;
import com.philip003.newores.blocks.AustraliumDust;
import com.philip003.newores.blocks.AustraliumOre;
import com.philip003.newores.blocks.BenedictumBilobrcum;
import com.philip003.newores.blocks.BenedictumBilobrcumBlock;
import com.philip003.newores.blocks.BlockCannabis;
import com.philip003.newores.blocks.BlockWeed;
import com.philip003.newores.blocks.DiamondOreDisguise;
import com.philip003.newores.blocks.EmuBlock;
import com.philip003.newores.blocks.GoldOreDisguise;
import com.philip003.newores.blocks.GoldenButton;
import com.philip003.newores.blocks.HardenedObsidian;
import com.philip003.newores.blocks.MaracujaBlock;
import com.philip003.newores.blocks.MaracujaCrop;
import com.philip003.newores.blocks.OnionCrop;
import com.philip003.newores.blocks.TeaBlock;
import com.philip003.newores.blocks.TeaCrop;
import com.philip003.newores.blocks.TomatoCrop;
import com.philip003.newores.items.ItemAustraliumShard;
import com.philip003.newores.items.ItemBottleWodka;
import com.philip003.newores.items.ItemBrcum;
import com.philip003.newores.items.ItemBrcumCrystal;
import com.philip003.newores.items.ItemDefSpeedOrb;
import com.philip003.newores.items.ItemDriedWeed;
import com.philip003.newores.items.ItemFlerCarrot;
import com.philip003.newores.items.ItemFlyingStaff;
import com.philip003.newores.items.ItemIceTea;
import com.philip003.newores.items.ItemJarate;
import com.philip003.newores.items.ItemJoint;
import com.philip003.newores.items.ItemMaracuja;
import com.philip003.newores.items.ItemMaracujaSeed;
import com.philip003.newores.items.ItemOnion;
import com.philip003.newores.items.ItemOnionSeed;
import com.philip003.newores.items.ItemRumpsteak;
import com.philip003.newores.items.ItemSpeedOrb;
import com.philip003.newores.items.ItemSurvivalKit;
import com.philip003.newores.items.ItemTea;
import com.philip003.newores.items.ItemTeaLeaf;
import com.philip003.newores.items.ItemTomato;
import com.philip003.newores.items.ItemTomatoSeed;
import com.philip003.newores.items.ItemWeed;
import com.philip003.newores.items.ItemWheatDistillate;
import com.philip003.newores.items.ingotAustralium;
import com.philip003.newores.items.armor.InvisoArmor;
import com.philip003.newores.items.tools.ItemMiningDrill;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NewOres.MODID, name = NewOres.NAME, version = NewOres.VERSION)
public class NewOres {

	@SidedProxy(clientSide = "com.philip003.newores.ClientProxy", serverSide = "com.philip003.newores.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "newores";
	public static final String VERSION = "3.14159";
	public static final String NAME = "New Ores";

	@Instance(MODID)
	public static NewOres instance;

	// Blocks
	public static Block BenedictumBilobrcum = new BenedictumBilobrcum(
			Material.rock);
	public static Block invisoBlock = new com.philip003.newores.blocks.InvisoBlock(
			Material.rock).setBlockName("invisoBlock").setBlockTextureName(
			NewOres.MODID + ":invisoblock");
	public static Block spawnerBars = new com.philip003.newores.blocks.SpawnerBars(
			Material.rock);
	public static Block hardenedObsidian = new HardenedObsidian(Material.rock);
	public static BlockCrops tomatoCrop = new TomatoCrop();
	public static BlockCrops onionCrop = new OnionCrop();
	public static Block australiumOre = new AustraliumOre(Material.rock);
	public static Block benedictumBilobrcumBlock = new BenedictumBilobrcumBlock(
			Material.rock);
	public static Block australiumBlock = new AustraliumBlock(Material.rock);
	public static BlockButton goldenButton = new GoldenButton();
	public static Block australiumDust = new AustraliumDust(Material.ground);
	public static Block diamondOreDisguise = new DiamondOreDisguise(
			Material.ground);
	public static Block emuBlock = new EmuBlock(Material.cloth);
	public static Block maracujaCrop = new MaracujaCrop();
	public static Block teaCrop = new TeaCrop();
	public static Block maracujaBlock = new MaracujaBlock(Material.plants);
	public static Block teaBlock = new TeaBlock(Material.plants);
	public static Block goldOreDisguise = new GoldOreDisguise(Material.rock);
	public static Block cannabis = new BlockCannabis();
	public static Block weedBlock = new BlockWeed(Material.plants);
	// public static Block powerFurnaceIdle = new PowerFurnaceClass(false);
	// public static Block powerFurnaceActive = new PowerFurnaceClass(true);

	// Biomes
	public static BiomeGenBase biomeAustralia = new BiomeAustralia(42);

	// Armor ID's
	public static int invisohelmetID;
	public static int invisochestplateID;
	public static int invisoleggingsID;
	public static int invisobootsID;

	// Armor
	public static ArmorMaterial INVISO = EnumHelper.addArmorMaterial(
			"MaterialInviso", 20, new int[] { 4, 8, 7, 4 }, 9);
	public static Item InvisoHelmet = new InvisoArmor(INVISO, invisohelmetID, 0)
			.setUnlocalizedName("invisoHelmet");
	public static Item InvisoChestplate = new InvisoArmor(INVISO,
			invisochestplateID, 1).setUnlocalizedName("invisoChestplate");
	public static Item InvisoLeggings = new InvisoArmor(INVISO,
			invisoleggingsID, 2).setUnlocalizedName("invisoLeggings");
	public static Item InvisoBoots = new InvisoArmor(INVISO, invisobootsID, 3)
			.setUnlocalizedName("invisoBoots");

	// Tools
	// Benedictum Tools
	public static Item brcumSword;
	public static Item brcumHoe;
	public static Item brcumPickaxe;
	public static Item brcumShovel;
	public static Item brcumAxe;
	// Obsidian Tools
	public static Item obsidianSword;
	public static Item obsidianHoe;
	public static Item obsidianPickaxe;
	public static Item obsidianShovel;
	public static Item obsidianAxe;
	// Brcosidian Tools
	public static Item brcosidianSword;
	public static Item brcosidianHoe;
	public static Item brcosidianPickaxe;
	public static Item brcosidianShovel;
	public static Item brcosidianAxe;
	// Mining Drill
	public static Item miningDrill = new ItemMiningDrill();

	// Items
	public static Item brcumCrystal = new ItemBrcumCrystal()
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName(NewOres.MODID + ":" + "brcumcrystal")
			.setUnlocalizedName("brcumCrystal");
	public static Item Brcum = new ItemBrcum(1, 1.5F, false)
			.setUnlocalizedName("Brcum").setTextureName(
					NewOres.MODID + ":" + "brcum");
	public static Item rumpsteakAusArgentinien = new ItemRumpsteak(10, 2.5F,
			true);
	public static Item flerCarrot = new ItemFlerCarrot(0, 0.0F, false);
	public static Item flyingStaff = new ItemFlyingStaff();
	public static Item bottleWodka = new ItemBottleWodka(0, 0.0F, false);
	public static Item wheatDistillate = new ItemWheatDistillate();
	public static Item survivalKit = new ItemSurvivalKit();
	public static ItemSeedFood tomatoSeed = new ItemTomatoSeed(1, 0.3F,
			NewOres.tomatoCrop, Blocks.farmland);
	public static Item itemTomato = new ItemTomato(1, 0.5F, false);
	public static Item itemOnion = new ItemOnion(1, 0.5F, false);
	public static ItemSeedFood onionSeed = new ItemOnionSeed(1, 0.3F,
			NewOres.onionCrop, Blocks.farmland);
	public static Item australiumIngot = new ingotAustralium();
	public static Item creativeSpeedOrb = new ItemSpeedOrb();
	public static Item creativeDefSpeedOrb = new ItemDefSpeedOrb();
	public static Item australiumShard = new ItemAustraliumShard();
	public static Item jarate = new ItemJarate(0, 0.0F, false);
	public static Item iceTea = new ItemIceTea(8, 1.0F, true);
	public static Item maracuja = new ItemMaracuja(4, 0.75F, true);
	public static Item tea = new ItemTea(3, 0.75F, false);
	public static Item teaLeaf = new ItemTeaLeaf(2, 0.25F, NewOres.teaCrop,
			Blocks.farmland);
	public static ItemSeedFood maracujaSeed = new ItemMaracujaSeed(2, 0.4F,
			NewOres.maracujaCrop, Blocks.farmland);
	public static Item joint = new ItemJoint(3, false);
	public static Item driedWeed = new ItemDriedWeed();
	public static Item weed = new ItemWeed(1, 0.15F, NewOres.cannabis,
			Blocks.farmland);

	// Tool Material
	static ToolMaterial benedictum = EnumHelper.addToolMaterial("benedictum",
			3, 420, 7.0F, 2.5F, 23);
	static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3,
			3000, 10.0F, 4.5F, 27);
	static ToolMaterial BRCOSIDIAN = EnumHelper.addToolMaterial("BRCOSIDIAN",
			3, 4000, 12.0F, 6.0F, 30);

	public static final int guiIDPowerFurnace = 0;

	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		// Entity Registry
		ModEntityRegistry.init();

		// Register Renderer
		proxy.registerRenderers();

		// Registering Tile Entities
		proxy.registerTileEntities();

		// Initializing Achievements
		oreAchievements.init();

		// Biome Registry
		ModBiomeRegistry.init();

		// Tool Registry
		ModToolRegistry.init();

		// Event Registry
		ModEventRegistry.init();

		// Item Registry
		ModItemRegistry.init();

		// Block Registry
		ModBlockRegistry.init();

		// Smelting Recipe Registry
		ModRecipeRegistry.initSmelting();

		// World Generator Registry
		ModGenerationRegistry.init();

		// Shapeless Crafting Recipe Registry
		ModRecipeRegistry.initShapeless();

		// Shaped Crafting Recipe Registry
		ModRecipeRegistry.initShaped();

		// Armor Crafting Recipe Registry
		ModRecipeRegistry.initArmor();

		// Tools Crafting Recipe Registry
		// Brcum Tools
		ModRecipeRegistry.initBrcumTools();

		// Obsidian Tools
		ModRecipeRegistry.initObsidianTools();

		// Brcosidian Tools
		ModRecipeRegistry.initBrcosidianTools();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {

	}
}
