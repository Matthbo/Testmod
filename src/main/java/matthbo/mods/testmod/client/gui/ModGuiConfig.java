package matthbo.mods.testmod.client.gui;

import java.util.ArrayList;
import java.util.List;

import matthbo.mods.testmod.handler.ConfigHandler;
import matthbo.mods.testmod.reference.Refs;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.GuiConfigEntries.CategoryEntry;
import cpw.mods.fml.client.config.IConfigElement;
import cpw.mods.fml.client.config.DummyConfigElement.DummyCategoryElement;

/**This class is NOT following pahimar's LetModReboot!
 * 
 * @author Matthbo
 *
 */
public class ModGuiConfig extends GuiConfig {
	
	public ModGuiConfig(GuiScreen guiScreen){
		super(guiScreen, 
				getConfigElement(), 
				Refs.MOD_ID, 
				false, 
				false, 
				GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
	}
	
	private static List<IConfigElement> getConfigElement(){
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		//list.addAll((new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL))).getChildElements());
		list.add(new DummyCategoryElement("General", "testmod.configgui.ctgy.configGeneral", ModGeneralEntry.class));
		//list.addAll((new ConfigElement(ConfigHandler.config.getCategory(ConfigHandler.CATEGORY_DEVELOPMENT))).getChildElements());
		list.add(new DummyCategoryElement("Dev", "testmod.configgui.ctgy.configDevelopment", ModDevelopmentEntry.class));
		return list;
	}
	
	public static class ModGeneralEntry extends CategoryEntry{

		public ModGeneralEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}
		
		@Override
		protected GuiScreen buildChildScreen(){
			return new GuiConfig(this.owningScreen, 
					(new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements()), 
					this.owningScreen.modID, 
					false, 
					false, 
					I18n.format("testmod.configgui.ctgy.configGeneral"));
		}
		
	}
	
	public static class ModDevelopmentEntry extends CategoryEntry{

		public ModDevelopmentEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}
		
		@Override
		protected GuiScreen buildChildScreen(){
			return new GuiConfig(this.owningScreen, 
					(new ConfigElement(ConfigHandler.config.getCategory(ConfigHandler.CATEGORY_DEVELOPMENT)).getChildElements()), 
					this.owningScreen.modID, 
					false, 
					false, 
					I18n.format("testmod.configgui.ctgy.configDevelopment"));
		}
		
	}

}
