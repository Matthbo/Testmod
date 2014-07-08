package matthbo.mods.testmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import matthbo.mods.testmod.item.ItemMapleLeaf;
import matthbo.mods.testmod.item.ItemTestmod;
import matthbo.mods.testmod.reference.Refs;

@GameRegistry.ObjectHolder(Refs.MOD_ID)
public class ModItems {
	
	public static final ItemTestmod mapleLeaf = new ItemMapleLeaf();
	
	public static void init(){
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
	
	

}
