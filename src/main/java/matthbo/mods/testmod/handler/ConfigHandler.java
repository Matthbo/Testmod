package matthbo.mods.testmod.handler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import matthbo.mods.testmod.reference.Refs;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	
	public static boolean configTest = false;
	
	public static void init(File configFile){
		
		if(config == null){
			config = new Configuration(configFile);
			loadConfig();
		}
		
	}
	
	public static void loadConfig(){
		configTest = config.getBoolean("TestingConfig", config.CATEGORY_GENERAL, false, "just for testing purposes.");
		
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
