package matthbo.mods.testmod;

import matthbo.mods.testmod.handler.ConfigHandler;
import matthbo.mods.testmod.proxy.IProxy;
import matthbo.mods.testmod.reference.Refs;
import matthbo.mods.testmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refs.MOD_ID, name = Refs.MOD_NAME, version = Refs.VERSION, guiFactory = Refs.GUI_FACTORY_CLASS)
public class Testmod {
	
	@Instance("Testmod")
	public static Testmod instance;
	
	@SidedProxy(clientSide = Refs.CLIENT_PROXY_CLASS, serverSide = Refs.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		
		LogHelper.info("Pre Initialization Complete");
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
		LogHelper.info("Initialization Complete");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		LogHelper.info("Post Initialization Complete");
	}

}
