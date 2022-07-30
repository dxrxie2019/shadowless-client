package top.shadowless.client.mod;

import top.shadowless.client.mod.mods.movement.HUD;
import top.shadowless.client.mod.mods.movement.SprintMod;
import top.shadowless.client.mod.mods.movement.betterfps.BetterFps;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModManager {
    private final List<Mod> mods = new ArrayList<>();

    public List<Mod> getMods() {
        return mods;
    }

    public List<Mod> getEnadleMods(){
        return mods.stream().filter(Mod::isEnadle).collect(Collectors.toList());
    }

    public void load(){
        mods.add(new SprintMod());
        mods.add(new HUD());
        mods.add(new BetterFps());
    }
}
