package matthbo.mods.testmod.handler;

import java.io.File;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import matthbo.mods.testmod.reference.Refs;
import matthbo.mods.testmod.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	
	public static final String CATEGORY_DEVELOPMENT = "dev";
	
	public static boolean configTest = false;
	public static boolean dev = false;
	
	public static void init(File configFile){
		
		if(config == null){
			config = new Configuration(configFile);
			loadConfig();
		}
		
	}
	
	private static void loadConfig(){
		configTest = config.getBoolean("TestingConfig", config.CATEGORY_GENERAL, false, "just for testing purposes.");
		dev = config.getBoolean("DevMode", CATEGORY_DEVELOPMENT, false, "For devs ONLY!");
		
		if(dev == true) LogHelper.warn("Devmode is ON! if you are NOT a developer, turn devmode off in the config!");
		
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
