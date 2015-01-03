package matthbo.mods.testmod.handler;

import matthbo.mods.testmod.reference.Refs;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventHandler {
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event){
		if(ConfigHandler.dev){
			event.player.addChatMessage(new ChatComponentTranslation(Refs.CHAT_LANGKEY_DEVMODE));
		}
	}

}
