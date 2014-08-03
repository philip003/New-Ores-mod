package com.philip003.newores;

import com.philip003.newores.items.tools.ItemBrcosidianAxe;
import com.philip003.newores.items.tools.ItemBrcosidianHoe;
import com.philip003.newores.items.tools.ItemBrcosidianPickaxe;
import com.philip003.newores.items.tools.ItemBrcosidianShovel;
import com.philip003.newores.items.tools.ItemBrcosidianSword;
import com.philip003.newores.items.tools.ItemBrcumAxe;
import com.philip003.newores.items.tools.ItemBrcumHoe;
import com.philip003.newores.items.tools.ItemBrcumPickaxe;
import com.philip003.newores.items.tools.ItemBrcumShovel;
import com.philip003.newores.items.tools.ItemBrcumSword;
import com.philip003.newores.items.tools.ItemObsidianAxe;
import com.philip003.newores.items.tools.ItemObsidianHoe;
import com.philip003.newores.items.tools.ItemObsidianPickaxe;
import com.philip003.newores.items.tools.ItemObsidianShovel;
import com.philip003.newores.items.tools.ItemObsidianSword;

public class ModToolRegistry {
	public static void init() {
		NewOres.brcumPickaxe = new ItemBrcumPickaxe(NewOres.benedictum);
		NewOres.brcumSword = new ItemBrcumSword(NewOres.benedictum);
		NewOres.brcumShovel = new ItemBrcumShovel(NewOres.benedictum);
		NewOres.brcumAxe = new ItemBrcumAxe(NewOres.benedictum);
		NewOres.brcumHoe = new ItemBrcumHoe(NewOres.benedictum);
		NewOres.obsidianPickaxe = new ItemObsidianPickaxe(NewOres.OBSIDIAN);
		NewOres.obsidianAxe = new ItemObsidianAxe(NewOres.OBSIDIAN);
		NewOres.obsidianSword = new ItemObsidianSword(NewOres.OBSIDIAN);
		NewOres.obsidianShovel = new ItemObsidianShovel(NewOres.OBSIDIAN);
		NewOres.obsidianHoe = new ItemObsidianHoe(NewOres.OBSIDIAN);
		NewOres.brcosidianHoe = new ItemBrcosidianHoe(NewOres.BRCOSIDIAN);
		NewOres.brcosidianAxe = new ItemBrcosidianAxe(NewOres.BRCOSIDIAN);
		NewOres.brcosidianShovel = new ItemBrcosidianShovel(NewOres.BRCOSIDIAN);
		NewOres.brcosidianSword = new ItemBrcosidianSword(NewOres.BRCOSIDIAN);
		NewOres.brcosidianPickaxe = new ItemBrcosidianPickaxe(
				NewOres.BRCOSIDIAN);
	}
}