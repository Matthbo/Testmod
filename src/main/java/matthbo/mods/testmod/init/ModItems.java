package matthbo.mods.testmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import matthbo.mods.testmod.item.ItemMapleLeaf;
import matthbo.mods.testmod.item.ItemTestmod;

public class ModItems {
	
	public static final ItemTestmod mapleLeaf = new ItemMapleLeaf();
	
	public static void init(){
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
	
	

}
