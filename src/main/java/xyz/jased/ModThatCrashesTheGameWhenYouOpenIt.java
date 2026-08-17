package xyz.jased;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModThatCrashesTheGameWhenYouOpenIt implements ModInitializer {
	public static final String MOD_ID = "mod-that-crashes-the-game-when-you-open-it";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello welcome to the mod that crashes the game when you open it");
		throw new RuntimeException("Oops");
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
