package matthbo.mods.testmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import matthbo.mods.testmod.block.BlockFlag;
import matthbo.mods.testmod.block.BlockTestmod;
import matthbo.mods.testmod.reference.Refs;

@GameRegistry.ObjectHolder(Refs.MOD_ID)
public class ModBlocks {
	
	public static final BlockTestmod flag = new BlockFlag();
	
	public static void init(){
		GameRegistry.registerBlock(flag, "flag");
	}

}
