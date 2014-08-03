package com.philip003.newores.world.gen.structure;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.philip003.newores.NewOres;

public class WorldGenSniper extends WorldGenerator {
	public static final WeightedRandomChestContent[] snipersChestContent = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(NewOres.jarate, 0, 5, 10, 10),
			new WeightedRandomChestContent(Items.bow, 150, 1, 1, 10),
			new WeightedRandomChestContent(Items.arrow, 0, 10, 15, 15),
			new WeightedRandomChestContent(NewOres.flyingStaff, 0, 1, 1, 4),
			new WeightedRandomChestContent(NewOres.australiumIngot, 0, 1, 5, 12),
			new WeightedRandomChestContent(new ItemStack(
					NewOres.hardenedObsidian), 2, 4, 15) };

	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (world.getBlock(x, y, z) != NewOres.australiumDust
				|| world.getBlock(x, y + 1, z) != Blocks.air
				|| world.getBlock(x + 5, y, z) != NewOres.australiumDust
				|| world.getBlock(x + 5, y, z + 6) != NewOres.australiumDust
				|| world.getBlock(x, y, z + 6) != NewOres.australiumDust
				|| world.getBlock(x + 5, y + 1, z) != Blocks.air
				|| world.getBlock(x + 5, y + 1, z + 6) != Blocks.air
				|| world.getBlock(x, y + 1, z + 6) != Blocks.air) {
			return false;
		}
		for (int x1 = 0; x1 < 5; x1++) {
			for (int y1 = 0; y1 < 5; y1++) {
				for (int z1 = 0; z1 < 6; z1++) {
					if ((x1 >= 1 && x1 <= 4) && (y1 >= 1 && y1 <= 4)
							&& (z1 >= 1 && z1 <= 5)) {
						continue;
					}

					world.setBlock(x, y + y1 + 1, z, Blocks.planks);

					world.setBlock(x + x1, y + 1, z, Blocks.planks);
					world.setBlock(x + x1, y + 2, z, Blocks.planks);
					world.setBlock(x + x1, y + 3, z, Blocks.planks);
					world.setBlock(x + x1, y + 4, z, Blocks.planks);
					world.setBlock(x + x1, y + 5, z, Blocks.planks);

					world.setBlock(x, y + 1, z + z1, Blocks.planks);
					world.setBlock(x, y + 2, z + z1, Blocks.planks);
					world.setBlock(x, y + 3, z + z1, Blocks.planks);
					world.setBlock(x, y + 4, z + z1, Blocks.planks);
					world.setBlock(x, y + 5, z + z1, Blocks.planks);

					world.setBlock(x + 4, y + y1 + 1, z, Blocks.planks);
					world.setBlock(x + 4, y + y1 + 1, z + 1, Blocks.planks);
					world.setBlock(x + 4, y + y1 + 1, z + 2, Blocks.planks);
					world.setBlock(x + 4, y + y1 + 1, z + 3, Blocks.planks);
					world.setBlock(x + 4, y + y1 + 1, z + 4, Blocks.planks);

					world.setBlock(x + 4, y + y1 + 1, z + 5, Blocks.planks);
					world.setBlock(x + 3, y + y1 + 1, z + 5, Blocks.planks);
					world.setBlock(x + 1, y + y1 + 1, z + 5, Blocks.planks);

					world.setBlock(x + 2, y + 3, z + 5, Blocks.planks);
					world.setBlock(x + 2, y + 4, z + 5, Blocks.planks);
					world.setBlock(x + 2, y + 5, z + 5, Blocks.planks);

					for (int xx = 0; xx < 4; xx++) {
						for (int zz = 0; zz < 4; zz++) {
							world.setBlock(x + xx + 1, y + 5, z + zz + 1,
									Blocks.planks);
						}
					}

					world.setBlock(x + x1, y, z + z1, NewOres.australiumDust);

					for (int z5 = 0; z5 < 5; z5++) {
						world.setBlock(x, y, z + z5, NewOres.australiumDust);
					}

					for (int x5 = 0; x5 < 5; x5++) {
						world.setBlock(x + x5, y, z, NewOres.australiumDust);
					}

					world.setBlock(x + 2, y + 2, z, Blocks.air);
					world.setBlock(x + 2, y, z + 2, NewOres.australiumBlock);
					world.setBlock(x + 1, y + 3, z + 2, Blocks.torch);
					world.setBlock(x + 3, y + 3, z + 2, Blocks.torch);

					world.setBlock(x + 1, y + 1, z + 1, Blocks.chest);
					TileEntityChest entityChest = (TileEntityChest) world
							.getTileEntity(x + 1, y + 1, z + 1);
					if (entityChest != null) {
						if (!world.isRemote) {
							WeightedRandomChestContent.generateChestContents(
									rand, snipersChestContent, entityChest, 6);
						}
					}
				}
			}
		}
		return true;
	}
}