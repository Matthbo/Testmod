package matthbo.mods.testmod.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import matthbo.mods.testmod.item.ItemDevTool;
import matthbo.mods.testmod.item.ItemMapleLeaf;
import matthbo.mods.testmod.item.ItemTestmod;
import matthbo.mods.testmod.reference.Refs;

@GameRegistry.ObjectHolder(Refs.MOD_ID)
public class ModItems {
	
	public static final ItemTestmod mapleLeaf = new ItemMapleLeaf();
	public static final ItemTestmod devTool = new ItemDevTool();
	
	public static void init(){
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
	
	public static void devmodeInit(){
		GameRegistry.registerItem(devTool, "devTool");
	}
	
	

}
