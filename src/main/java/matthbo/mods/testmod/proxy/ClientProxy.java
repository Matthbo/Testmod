package matthbo.mods.testmod.proxy;

import matthbo.mods.testmod.client.settings.KeyBindings;
import matthbo.mods.testmod.init.ModBlocks;
import matthbo.mods.testmod.reference.Refs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerKeyBindings() {
		
		ClientRegistry.registerKeyBinding(KeyBindings.charge);
		ClientRegistry.registerKeyBinding(KeyBindings.release);
		
	}

	/**
	 * Following TheGreyGhost (http://www.minecraftforge.net/forum/index.php/topic,26265.0.html)
	 * This will likely change very soon!
	 */
	public void textureFix(){
		final int DEFAULT_ITEM_SUBTYPE = 0;

		Item itemBlockFlag = GameRegistry.findItem("testmod", "flag");
		ModelResourceLocation modelBlockFlag = new ModelResourceLocation("testmod:flag", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockFlag, DEFAULT_ITEM_SUBTYPE, modelBlockFlag);

		Item itemMapleLeaf = GameRegistry.findItem("testmod", "mapleLeaf");
		ModelResourceLocation modelMapleLeaf = new ModelResourceLocation("testmod:mapleLeaf", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemMapleLeaf, DEFAULT_ITEM_SUBTYPE, modelMapleLeaf);
	}

}
