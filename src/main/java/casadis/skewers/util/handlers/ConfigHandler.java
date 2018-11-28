package casadis.skewers.util.handlers;

import java.io.File;

import org.apache.logging.log4j.Level;

import casadis.skewers.Main;
import casadis.skewers.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
	public static Configuration config;
	
	private static final String CATEGORY_ENABLED = "enabled";
	private static final String CATEGORY_GENERAL = "general";
	
	public static boolean ENABLE_SKEWER_BEEF;
	public static boolean ENABLE_SKEWER_PORK;
	public static boolean ENABLE_SKEWER_COD;
	public static boolean ENABLE_SKEWER_SALMON;
	public static boolean ENABLE_SKEWER_VEGGIE;
	public static boolean ENABLE_SKEWER_CHICKEN;
	public static boolean ENABLE_SKEWER_RABBIT;
	public static boolean ENABLE_SKEWER_MUTTON;
	public static boolean ENABLE_SKEWER_COOKIE;
	public static boolean ENABLE_SKEWER_APPLE;
	public static boolean ENABLE_CARAMEL;
	
	public static int SKEWER_HUNGER_MULTIPLIER;
	public static float SKEWER_SATURATION_MULTIPLIER;
	public static int SICK_CHANCE;
	
    public ConfigHandler(Configuration config) {
        this.config = config;

        try {
			config.load();
			
			initEnabled();
			initGeneral();
        } catch (Exception e) {
        	Main.logger.log(Level.ERROR, "There was a problem loading the config file.", e);
        } finally {
        	if (this.config.hasChanged()) {
        		this.config.save();
        	}
        }
    }
    
    private static void initEnabled() {
    	config.addCustomCategoryComment(CATEGORY_ENABLED, "Enabled Features");
    	
		ENABLE_SKEWER_BEEF = config.getBoolean("BeefEnabled", CATEGORY_ENABLED, true, "Should the Beef Skewer be craftable?");
		ENABLE_SKEWER_PORK = config.getBoolean("PorkEnabled", CATEGORY_ENABLED, true, "Should the Pork Skewer be craftable?");
		ENABLE_SKEWER_COD = config.getBoolean("CodEnabled", CATEGORY_ENABLED, true, "Should the Cod Skewer be craftable?");
		ENABLE_SKEWER_SALMON = config.getBoolean("SalmonEnabled", CATEGORY_ENABLED, true, "Should the Salmon Skewer be craftable?");
		ENABLE_SKEWER_VEGGIE = config.getBoolean("VeggieEnabled", CATEGORY_ENABLED, true, "Should the Veggie Skewer be craftable?");
		ENABLE_SKEWER_CHICKEN = config.getBoolean("ChickenEnabled", CATEGORY_ENABLED, true, "Should the Chicken Skewer be craftable?");
		ENABLE_SKEWER_RABBIT = config.getBoolean("RabbitEnabled", CATEGORY_ENABLED, true, "Should the Rabbit Skewer be craftable?");
		ENABLE_SKEWER_MUTTON = config.getBoolean("MuttonEnabled", CATEGORY_ENABLED, true, "Should the Mutton Skewer be craftable?");
		ENABLE_SKEWER_COOKIE = config.getBoolean("CookieEnabled", CATEGORY_ENABLED, true, "Should the Cookie Skewer be craftable?");
		ENABLE_SKEWER_APPLE = config.getBoolean("AppleEnabled", CATEGORY_ENABLED, true, "Should the Caramel Apple be craftable?");
		ENABLE_CARAMEL = config.getBoolean("CaramelEnabled", CATEGORY_ENABLED, true, "Should Caramel be craftable?");
    }
	
	private static void initGeneral() {
		config.addCustomCategoryComment(CATEGORY_GENERAL, "General Settings");
		
		SKEWER_HUNGER_MULTIPLIER = config.getInt("HungerMultiplier", CATEGORY_GENERAL, 3, 1, 6, "How much will the normal hunger satisfaction be multiplied?");
		SKEWER_SATURATION_MULTIPLIER = config.getFloat("SaturationMultiplier", CATEGORY_GENERAL, 1.0f, 1.0f, 2.0f, "How much will the normal saturation satisfaction be multiplied?");
		SICK_CHANCE = config.getInt("SickChance", CATEGORY_GENERAL, 80, 0, 100, "How often should eating a raw skewer make the player sick?");
		
		config.save();
	}
}
