package matthbo.mods.testmod.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDevTool extends ItemTestmod {

	public ItemDevTool(){
		super();
		this.setUnlocalizedName("devTool");
		this.maxStackSize = 1;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}
	
}
