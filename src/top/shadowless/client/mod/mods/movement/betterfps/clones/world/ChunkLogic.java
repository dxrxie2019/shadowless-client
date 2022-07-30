package top.shadowless.client.mod.mods.movement.betterfps.clones.world;

import top.shadowless.client.mod.mods.movement.betterfps.transformers.cloner.CopyMode;
import top.shadowless.client.mod.mods.movement.betterfps.transformers.cloner.CopyMode.Mode;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

/**
 * @author Guilherme Chaguri
 */
public class ChunkLogic extends Chunk {

    @CopyMode(Mode.IGNORE) // Lets ignore the constructor, we don't want infinite loops
    private ChunkLogic(World worldIn, int x, int z) {
        super(worldIn, x, z);
    }

    public boolean shouldTick = true;

}
