package com.philip003.newores;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.philip003.newores.entities.EntityJungleSpider;

import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntityRegistry {
	public static int jungleSpiderID = 101;
	public static int eggIdCounter = 300;

	public static int getUniqueEntityEggId() {
		do {
			eggIdCounter++;
		} while (EntityList.getStringFromID(eggIdCounter) != null);

		return eggIdCounter;
	}

	public static void registerEntityEgg(Class<? extends Entity> entity,
			int primaryColor, int secondaryColor) {
		int id = getUniqueEntityEggId();

		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor,
				secondaryColor));
	}

	public static void init() {
		EntityRegistry.registerModEntity(EntityJungleSpider.class,
				"JungleSpider", jungleSpiderID, NewOres.instance, 80, 3, true);

		registerEntityEgg(EntityJungleSpider.class, 5147192, 11013646);

		EntityRegistry.addSpawn(EntityJungleSpider.class, 8, 1, 3,
				EnumCreatureType.monster, NewOres.biomeAustralia,
				BiomeGenBase.swampland, BiomeGenBase.jungle);
	}
}