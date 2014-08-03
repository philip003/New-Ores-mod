package com.philip003.newores;

import net.minecraftforge.common.BiomeManager;

public class ModBiomeRegistry {
	public static void init() {
		BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(
				NewOres.biomeAustralia, 10));
		BiomeManager.addSpawnBiome(NewOres.biomeAustralia);
	}
}