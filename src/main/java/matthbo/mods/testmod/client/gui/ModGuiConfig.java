package matthbo.mods.testmod.client.gui;

import java.util.ArrayList;
import java.util.List;

import matthbo.mods.testmod.handler.ConfigHandler;
import matthbo.mods.testmod.reference.Refs;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.IConfigElement;

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
		list.add(new DummyConfigElement.DummyCategoryElement("General", Refs.CONFIG_LANGKEY_GENERAL, ModGeneralEntry.class));
		//list.addAll((new ConfigElement(ConfigHandler.config.getCategory(ConfigHandler.CATEGORY_DEVELOPMENT))).getChildElements());
		list.add(new DummyConfigElement.DummyCategoryElement("Dev", Refs.CONFIG_LANGKEY_DEV, ModDevelopmentEntry.class));
		return list;
	}
	
	public static class ModGeneralEntry extends GuiConfigEntries.CategoryEntry {

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
					I18n.format(Refs.CONFIG_LANGKEY_GENERAL));
		}
		
	}
	
	public static class ModDevelopmentEntry extends GuiConfigEntries.CategoryEntry{

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
					I18n.format(Refs.CONFIG_LANGKEY_DEV));
		}
		
	}

}
