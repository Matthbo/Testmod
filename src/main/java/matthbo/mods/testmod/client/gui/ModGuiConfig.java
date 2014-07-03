package matthbo.mods.testmod.client.gui;

import matthbo.mods.testmod.handler.ConfigHandler;
import matthbo.mods.testmod.reference.Refs;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig {
	
	public ModGuiConfig(GuiScreen guiScreen){
		super(guiScreen, 
				new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), 
				Refs.MOD_ID, 
				false, 
				false, 
				GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
	}

}
