package matthbo.mods.testmod.creativetab;

import matthbo.mods.testmod.init.ModItems;
import matthbo.mods.testmod.reference.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTestmod {
	
	public static final CreativeTabs TESTMOD_TAB = new CreativeTabs(Refs.MOD_ID.toLowerCase()){

		@Override
		public Item getTabIconItem() {
			return ModItems.mapleLeaf;
		}
		
	};

}
