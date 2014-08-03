package com.philip003.newores.world.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import com.philip003.newores.world.gen.structure.WorldGenMaracuja;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorMaracuja implements IWorldGenerator {
	private static int rarity = 10;

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.dimensionId == 0) {
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int blockX,
			int blockZ) {
		for (int k = 0; k < rarity; k++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(128);
			int Zcoord = blockZ + random.nextInt(16);

			(new WorldGenMaracuja()).generate(world, random, Xcoord, Ycoord,
					Zcoord);
		}
	}
}