package top.shadowless.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.chunk.RenderChunk;
import top.shadowless.client.mod.ModManager;

public class client {
    public final static String NAME = "Shadowless";
    public final static String VERSION = "Beta 3.0";
    public static ModManager modManager;
    private static final client INSTANCE = new client();
    public static final client getInstance(){
        return INSTANCE;
    }

    public void start(){//游戏启动时的方法
        modManager = new ModManager();
        modManager.load();
        System.out.println("shadowless client 开始启动");
    }


    public static void stop(){//游戏结束时的方法
        System.out.println("shadowless client 停止了运行");
    }

}
