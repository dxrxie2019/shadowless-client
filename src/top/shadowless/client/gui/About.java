package top.shadowless.client.gui;

import net.minecraft.client.gui.*;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import org.jdesktop.jdic.desktop.Desktop;
import java.io.IOException;

public class About extends GuiScreen {
    @Override
    public void initGui() {
        this.buttonList.add(new GuiButton(1, this.width / 2 - 90, 218, 185, 20, I18n.format("返回")));
        this.buttonList.add(new GuiButton(2, this.width / 2 - -36, 160, 98, 20, I18n.format("打开官方网站")));
        super.initGui();
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawBackground(0);
        ResourceLocation back = new ResourceLocation("mc/backage.png");
        mc.getTextureManager().bindTexture(back);
        Gui.drawModalRectWithCustomSizedTexture(0,0,0,0,width,height,width,height);
        FontRenderer font = mc.fontRendererObj;
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException{
        if (button.id == 1) {
            this.mc.displayGuiScreen(new MainMenuGui());
        }
        if (button.id == 2){
            String url = "https://www.shadowless.top";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+url);//使用默认浏览器打开url
        }
    }
}
