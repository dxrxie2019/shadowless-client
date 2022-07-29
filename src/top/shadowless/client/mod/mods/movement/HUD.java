package top.shadowless.client.mod.mods.movement;

import net.minecraft.client.Minecraft;
import top.shadowless.client.mod.Mod;

import java.awt.*;

public class HUD extends Mod {
    public HUD() {
        super("HUD", true);
    }

    @Override
    public void render() {
        super.render();
        int fps = Minecraft.getDebugFPS();
        Minecraft.getMinecraft().fontRendererObj.drawString("Shadowless Client B3",0,0,new Color(51, 62,255).getRGB());
        Minecraft.getMinecraft().fontRendererObj.drawString("FPS:" + fps,0,10,new Color(51, 62,255).getRGB());
        Minecraft.getMinecraft().fontRendererObj.drawString("MCP Version:9.18",0,20,new Color(51, 62,255).getRGB());
    }
}
