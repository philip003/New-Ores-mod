package com.philip003.newores;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class myEvents {
	public static double rand;

	@SubscribeEvent
	public void spawnerEggDrops(LivingDropsEvent drop) {
		Entity mob = drop.entity;
		rand = Math.random();
		if (mob instanceof EntityZombie) {
			if (rand <= 0.10D) {
				mob.entityDropItem(new ItemStack(Items.spawn_egg, 1, 54), 1);
			} else if (rand >= 0.25D) {
				mob.entityDropItem(new ItemStack(NewOres.onionSeed, 1), 1);
			} else if (rand >= 0.5D) {
				mob.entityDropItem(new ItemStack(NewOres.tomatoSeed, 1), 1);
			}
		} else if (mob instanceof EntitySpider) {
			if (rand <= 0.10D) {
				mob.entityDropItem(new ItemStack(Items.spawn_egg, 1, 52), 1);
			} else if (mob instanceof EntitySkeleton) {
				if (rand <= 0.10D) {
					mob.entityDropItem(new ItemStack(Items.spawn_egg, 1, 51), 1);
				} else if (mob instanceof EntityCreeper) {
					if (rand <= 0.10D) {
						mob.entityDropItem(
								new ItemStack(Items.spawn_egg, 1, 50), 1);
					} else if (mob instanceof EntityEnderman) {
						if (rand <= 0.10D) {
							mob.entityDropItem(new ItemStack(Items.spawn_egg,
									1, 58), 1);
						} else if (mob instanceof EntitySlime) {
							if (rand <= 0.10D) {
								mob.entityDropItem(new ItemStack(
										Items.spawn_egg, 1, 55), 1);
							} else if (mob instanceof EntityGhast) {
								if (rand <= 0.10D) {
									mob.entityDropItem(new ItemStack(
											Items.spawn_egg, 1, 56), 1);
								} else if (mob instanceof EntityPigZombie) {
									if (rand <= 0.10D) {
										mob.entityDropItem(new ItemStack(
												Items.spawn_egg, 1, 57), 1);
									} else if (mob instanceof EntityCaveSpider) {
										if (rand <= 0.10D) {
											mob.entityDropItem(new ItemStack(
													Items.spawn_egg, 1, 59), 1);
										} else if (mob instanceof EntitySheep) {
											if (rand <= 0.10D) {
												mob.entityDropItem(
														new ItemStack(
																Items.spawn_egg,
																1, 91), 1);
											} else if (mob instanceof EntityPig) {
												if (rand <= 0.10D) {
													mob.entityDropItem(
															new ItemStack(
																	Items.spawn_egg,
																	1, 90), 1);
												} else if (mob instanceof EntityCow) {
													if (rand <= 0.10D) {
														mob.entityDropItem(
																new ItemStack(
																		Items.spawn_egg,
																		1, 92),
																1);
													} else if (mob instanceof EntityChicken) {
														if (rand <= 0.10D) {
															mob.entityDropItem(
																	new ItemStack(
																			Items.spawn_egg,
																			1,
																			93),
																	1);
														} else if (mob instanceof EntityHorse) {
															if (rand <= 0.10D) {
																mob.entityDropItem(
																		new ItemStack(
																				Items.spawn_egg,
																				1,
																				100),
																		1);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}