package com.philip003.newores;

import net.minecraftforge.common.MinecraftForge;

import com.philip003.newores.events.AchievementEvents;

import cpw.mods.fml.common.FMLCommonHandler;

public class ModEventRegistry {
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new myEvents());
		FMLCommonHandler.instance().bus().register(new AchievementEvents());
	}
}