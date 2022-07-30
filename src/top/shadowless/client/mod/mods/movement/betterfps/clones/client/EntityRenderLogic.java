package top.shadowless.client.mod.mods.movement.betterfps.clones.client;

import top.shadowless.client.mod.mods.movement.betterfps.transformers.cloner.CopyBoolCondition;
import top.shadowless.client.mod.mods.movement.betterfps.transformers.cloner.CopyMode;
import top.shadowless.client.mod.mods.movement.betterfps.transformers.cloner.CopyMode.Mode;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.resources.IResourceManager;

/**
 * @author Guilherme Chaguri
 */
public class EntityRenderLogic extends EntityRenderer {

    @CopyMode(Mode.IGNORE)
    public EntityRenderLogic(Minecraft mcIn, IResourceManager manager) {
        super(mcIn, manager);
    }

    @CopyBoolCondition(key = "fog", value = false)
    @CopyMode(Mode.REPLACE)
    public void setupFog(int p1, float partialTicks) {
        if(p1 != -1) return;
        super.setupFog(p1, partialTicks);
    }

}
