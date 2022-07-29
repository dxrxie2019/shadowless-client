package top.shadowless.client.mod.mods.Util;

import net.minecraft.client.gui.Gui;

public class drawUtil {
    public static void drawRect(int x,int y,int width,int height,int color){
        Gui.drawRect(x,y,x+width,y+height,color);
    }
}
