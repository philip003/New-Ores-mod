package com.philip003.newores;

import com.philip003.newores.blocks.AustraliumOreGeneration;
import com.philip003.newores.blocks.BenedictusOreGeneration;
import com.philip003.newores.world.gen.WorldGeneratorMaracuja;
import com.philip003.newores.world.gen.WorldGeneratorSniper;
import com.philip003.newores.world.gen.WorldGeneratorTea;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModGenerationRegistry {
	public static void init() {
		GameRegistry.registerWorldGenerator(new BenedictusOreGeneration(), 1);
		GameRegistry.registerWorldGenerator(new AustraliumOreGeneration(), 1);
		GameRegistry.registerWorldGenerator(new WorldGeneratorSniper(), 1);
		GameRegistry.registerWorldGenerator(new WorldGeneratorTea(), 1);
		GameRegistry.registerWorldGenerator(new WorldGeneratorMaracuja(), 1);
	}
}