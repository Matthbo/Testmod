package matthbo.mods.testmod.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
