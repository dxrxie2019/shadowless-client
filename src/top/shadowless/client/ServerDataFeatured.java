package top.shadowless.client;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.util.ResourceLocation;

public class ServerDataFeatured extends ServerData {
    public static final ResourceLocation iii = new ResourceLocation("mc/Star.png");
    public ServerDataFeatured(String Servername, String Serverip) {
        super(Servername, Serverip, false);
    }
}
