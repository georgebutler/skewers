package casadis.skewers.util.handlers;

import java.io.File;

import casadis.skewers.Main;
import casadis.skewers.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
	public static Configuration config;
	
	private static final String CATEGORY_GENERAL = "general";
	
	public static int SKEWER_HUNGER_MULTIPLIER = 3;
	public static int SKEWER_SATURATION_MULTIPLIER = 3;
	public static int SICK_CHANCE = 80;
	
    public ConfigHandler(Configuration config) {
        this.config = config;

        init();
    }
	
	public static void init() {
		config.load();
		
		config.addCustomCategoryComment(CATEGORY_GENERAL, "General Settings");
		
		SKEWER_HUNGER_MULTIPLIER = config.getInt("HungerMultiplier", CATEGORY_GENERAL, 3, 1, 6, "How much will the normal hunger satisfaction be multiplied?");
		SKEWER_SATURATION_MULTIPLIER = config.getInt("SaturationMultiplier", CATEGORY_GENERAL, 3, 1, 6, "How much will the normal saturation satisfaction be multiplied?");
		SICK_CHANCE = config.getInt("SickChance", CATEGORY_GENERAL, 80, 0, 100, "How often should eating a raw skewer make the player sick?");
		
		config.save();
	}
}
