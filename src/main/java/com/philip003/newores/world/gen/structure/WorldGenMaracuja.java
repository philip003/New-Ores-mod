package com.philip003.newores.world.gen.structure;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenJungle;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.philip003.newores.NewOres;

public class WorldGenMaracuja extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);
		if (biome instanceof BiomeGenJungle || biome instanceof BiomeGenSwamp) {
			if (world.getBlock(x, y - 1, z) != Blocks.grass) {
				return false;
			}

			for (int l = 0; l < 5; ++l) {
				int x1 = x + rand.nextInt(8) - rand.nextInt(8);
				int y1 = y + rand.nextInt(4) - rand.nextInt(4);
				int z1 = z + rand.nextInt(8) - rand.nextInt(8);

				world.setBlock(x1, y1, z1, NewOres.maracujaBlock);
			}
		}

		return true;
	}
}