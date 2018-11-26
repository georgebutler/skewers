package casadis.skewers;

import casadis.skewers.util.Reference;
import casadis.skewers.util.handlers.ConfigHandler;
import casadis.skewers.util.handlers.OreDictHandler;

import java.io.File;
import org.apache.logging.log4j.Logger;

import casadis.skewers.init.ModRecipes;
import casadis.skewers.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	public static ConfigHandler config;
	
	@Instance
	public static Main instance;
	public static Logger logger;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		config = new ConfigHandler(new Configuration(event.getSuggestedConfigurationFile()));
		
		OreDictHandler.init();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
