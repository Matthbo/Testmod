package matthbo.mods.testmod.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import matthbo.mods.testmod.block.BlockFlag;
import matthbo.mods.testmod.block.BlockTestmod;
import matthbo.mods.testmod.reference.Refs;

@ObjectHolder(Refs.MOD_ID)
public class ModBlocks {
	
	public static final BlockTestmod flag = new BlockFlag();
	
	public static void init(){
		GameRegistry.registerBlock(flag, "flag");
	}

}
