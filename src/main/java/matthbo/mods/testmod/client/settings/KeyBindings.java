package matthbo.mods.testmod.client.settings;

import org.lwjgl.input.Keyboard;

import matthbo.mods.testmod.reference.Refs;
import net.minecraft.client.settings.KeyBinding;

public class KeyBindings {
	
	public static KeyBinding charge = new KeyBinding(Refs.KEY_CHARGE, Keyboard.KEY_C, Refs.KEY_CATEGORY);
	public static KeyBinding release = new KeyBinding(Refs.KEY_RELEASE, Keyboard.KEY_R, Refs.KEY_CATEGORY);

	
}
