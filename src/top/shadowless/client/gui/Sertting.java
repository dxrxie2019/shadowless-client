package top.shadowless.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.resources.I18n;

import java.awt.*;
import java.io.IOException;

public class Sertting extends GuiScreen {
    @Override
    public void initGui() {
        int j = this.height / 4 + 48;
        this.buttonList.add(new GuiButton(0, width - 310, height - 25,  200, 20, I18n.format("设置完成")));
        super.initGui();
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawBackground(0);
        //Gui.drawModalRectWithCustomSizedTexture(0,0,0,0,width,height,width,height);
        FontRenderer font = mc.fontRendererObj;
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        super.drawScreen(mouseX, mouseY, partialTicks);
        Minecraft.getMinecraft().fontRendererObj.drawString("Shadowless Client B4的Mod设置界面",width - 310, 0,new Color(51, 62,255).getRGB());
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button.id == 0)
        {
            this.mc.displayGuiScreen(new GuiIngameMenu());
        }
    }
}
