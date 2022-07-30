package top.shadowless.client;

import top.shadowless.client.Event.EventManager;
import top.shadowless.client.gui.SplashProgress;
import top.shadowless.client.mod.ModManager;

public class client {
    public final static String NAME = "Shadowless";
    public final static String VERSION = "Beta 4";
    public static ModManager modManager;
    private static final client INSTANCE = new client();
    public static final client getInstance(){
        return INSTANCE;
    }

    public void start(){//游戏启动时的方法
        SplashProgress.setPROGRESS(1,"Client -- starting");
        modManager = new ModManager();
        modManager.load();
        System.out.println("shadowless client 开始启动");
        EventManager.register(this);
    }

    public void mc(){
    }


    public static void stop(){//游戏结束时的方法
        System.out.println("shadowless client 停止了运行");
    }
}
