package com.philip003.newores.biomes;

import net.minecraft.world.biome.BiomeGenBase;

import com.philip003.newores.NewOres;
import com.philip003.newores.entities.EntityJungleSpider;

public class BiomeAustralia extends BiomeGenBase {

	public BiomeAustralia(int id) {
		super(id);
		setBiomeName("Australia");
		fillerBlock = NewOres.diamondOreDisguise;
		topBlock = NewOres.australiumDust;
		setDisableRain();
		setHeight(height_LowPlains);
		theBiomeDecorator.treesPerChunk = -999;
		spawnableCreatureList.clear();
		spawnableCreatureList.add(new SpawnListEntry(EntityJungleSpider.class,
				4, 2, 4));
		theBiomeDecorator.generateLakes = false;
	}
}