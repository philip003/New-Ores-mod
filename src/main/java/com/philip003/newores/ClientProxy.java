package com.philip003.newores;

import com.philip003.newores.entities.EntityJungleSpider;
import com.philip003.newores.render.entities.RenderJungleSpider;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		if (ModEntityRegistry.jungleSpiderID > 0) {
			RenderingRegistry.registerEntityRenderingHandler(
					EntityJungleSpider.class, new RenderJungleSpider());
		}
	}
}
