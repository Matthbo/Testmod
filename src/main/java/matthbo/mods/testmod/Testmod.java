package matthbo.mods.testmod;

import matthbo.mods.testmod.proxy.IProxy;
import matthbo.mods.testmod.reference.Refs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refs.MOD_ID, name = Refs.MOD_NAME, version = Refs.VERSION)
public class Testmod {
	
	@Instance("Testmod")
	public static Testmod instance;
	
	@SidedProxy(clientSide = Refs.CLIENT_PROXY_CLASS, serverSide = Refs.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}

}
