package top.shadowless.client.mod.mods.movement;

import net.minecraft.client.Minecraft;
import top.shadowless.client.mod.Mod;

import java.awt.*;
import java.util.ArrayList;

public class HUD extends Mod {
    public HUD() {
        super("HUD", true);
    }

    @Override
    public void render() {
        super.render();
        int fps = Minecraft.getDebugFPS();
        Minecraft.getMinecraft().fontRendererObj.drawString("Shadowless Client B4",0,0,new Color(51, 62,255).getRGB());
        Minecraft.getMinecraft().fontRendererObj.drawString("FPS:" + fps,0,10,new Color(51, 62,255).getRGB());
        Minecraft.getMinecraft().fontRendererObj.drawString(String.format("X:%s Y:%s Z:%s",Math.round(Minecraft.getMinecraft().thePlayer.posX),Math.round(Minecraft.getMinecraft().thePlayer.posY),Math.round(Minecraft.getMinecraft().thePlayer.posZ)),0,20,new Color(51, 62,255).getRGB());
        String name = Minecraft.getMinecraft().thePlayer.getName();
        Minecraft.getMinecraft().fontRendererObj.drawString("玩家名字:" + name,0,30,new Color(51, 62,255).getRGB());
    }
}
