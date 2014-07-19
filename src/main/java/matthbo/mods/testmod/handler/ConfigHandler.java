package matthbo.mods.testmod.handler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import matthbo.mods.testmod.reference.Refs;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	
	public static final String CATEGORY_DEVELOPMENT = "dev";
	
	public static boolean configTest = false;
	public static boolean debug = false;
	
	public static void init(File configFile){
		
		if(config == null){
			config = new Configuration(configFile);
			loadConfig();
		}
		
	}
	
	private static void loadConfig(){
		configTest = config.getBoolean("TestingConfig", config.CATEGORY_GENERAL, false, "just for testing purposes.");
		debug = config.getBoolean("DebugMode", CATEGORY_DEVELOPMENT, false, "For devs ONLY!");
		if (config.hasChanged()){
			config.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equalsIgnoreCase(Refs.MOD_ID)){
			loadConfig();
		}
	}

}
