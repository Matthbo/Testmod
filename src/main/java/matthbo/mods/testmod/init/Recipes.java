package matthbo.mods.testmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init(){
		
		//Items
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood")); //works with BiomesOPlenty sticks :D
		
		//Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.flag, 2), "fff", "6b6", "111", 'f', new ItemStack(Blocks.red_flower), '1', new ItemStack(Blocks.red_flower, 1, 1), '6', new ItemStack(Blocks.red_flower, 1, 6), 'b', new ItemStack(Items.bread));

	}

}
