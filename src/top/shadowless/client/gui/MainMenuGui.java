package top.shadowless.client.gui;

import net.minecraft.client.gui.*;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.demo.DemoWorldServer;
import net.minecraft.world.storage.ISaveFormat;
import net.minecraft.world.storage.WorldInfo;
import net.optifine.reflect.Reflector;
import java.io.IOException;

public class MainMenuGui extends GuiScreen {

    @Override
    public void initGui() {
        int j = this.height / 4 + 48;
        this.buttonList.add(new GuiButton(1, this.width / 2 - 90, j, 89, 20,I18n.format("menu.singleplayer")));
        this.buttonList.add(new GuiButton(2, this.width / 2 - 90, j + 24 * 1, 89, 20,I18n.format("menu.multiplayer")));
        this.buttonList.add(new GuiButton(3, this.width / 2 - -5, j + 72 + -72,  89, 20,I18n.format("menu.options")));
        this.buttonList.add(new GuiButton(4, this.width / 2 - -5, j + 72 + -48,  89, 20,I18n.format("menu.quit")));
        this.buttonList.add(new GuiButton(5, this.width / 2 - 90, 160, 185, 20,I18n.format("关于我们")));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawBackground(0);
        ResourceLocation back = new ResourceLocation("mc/back.png");
        mc.getTextureManager().bindTexture(back);
        Gui.drawModalRectWithCustomSizedTexture(0,0,0,0,width,height,width,height);
        FontRenderer font = mc.fontRendererObj;
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    //width / 2 - font.getStringWidth("shadowless Client B3") / 2
    //height / 2 - font.FONT_HEIGHT / 2 - 50
    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button.id == 0)
        {
            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
        }

        if (button.id == 1)
        {
            this.mc.displayGuiScreen(new GuiSelectWorld(this));
        }

        if (button.id == 2)
        {
            this.mc.displayGuiScreen(new GuiMultiplayer(this));
        }

        if (button.id == 4)
        {
            this.mc.shutdown();
        }

        if (button.id == 6 && Reflector.GuiModList_Constructor.exists())
        {
            this.mc.displayGuiScreen((GuiScreen)Reflector.newInstance(Reflector.GuiModList_Constructor, this));
        }

        if (button.id == 11)
        {
            this.mc.launchIntegratedServer("Demo_World", "Demo_World", DemoWorldServer.demoWorldSettings);
        }

        if (button.id == 12)
        {
            ISaveFormat isaveformat = this.mc.getSaveLoader();
            WorldInfo worldinfo = isaveformat.getWorldInfo("Demo_World");

            if (worldinfo != null)
            {
                GuiYesNo guiyesno = GuiSelectWorld.makeDeleteWorldYesNo(this, worldinfo.getWorldName(), 12);
                this.mc.displayGuiScreen(guiyesno);
            }
        }if (button.id == 5){
            this.mc.displayGuiScreen(new About());
        }
    }
}
