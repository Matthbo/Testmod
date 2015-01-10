package matthbo.mods.testmod.client.handler;

import matthbo.mods.testmod.client.settings.KeyBindings;
import matthbo.mods.testmod.reference.Key;
import matthbo.mods.testmod.utility.LogHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputHandler {
	
	private static Key getPressedKeybinding(){
		if(KeyBindings.charge.isPressed()) return Key.CHARGE;
		else if(KeyBindings.release.isPressed()) return Key.RELEASE;
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event){
		//LogHelper.info(getPressedKeybinding());
	}
	
}
