package top.shadowless.client.mod.mods.movement;

import net.minecraft.client.Minecraft;
import top.shadowless.client.mod.Mod;

public class SprintMod extends Mod {
    public SprintMod() {
        super("Sprint", true);
    }

    @Override
    public void update(){
        if (Minecraft.getMinecraft().gameSettings.keyBindForward.isPressed() ||
                Minecraft.getMinecraft().gameSettings.keyBindLeft.isPressed()||
        Minecraft.getMinecraft().gameSettings.keyBindRight.isPressed()) {
            if (!Minecraft.getMinecraft().thePlayer.isInWater()) {
                Minecraft.getMinecraft().thePlayer.setSprinting(true);
            }
        }
    }
}
