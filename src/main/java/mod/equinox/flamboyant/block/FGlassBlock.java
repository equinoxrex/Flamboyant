package mod.equinox.flamboyant.block;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.Block.Properties;
import net.minecraft.util.BlockRenderLayer;

public class FGlassBlock extends AbstractGlassBlock {
    public FGlassBlock(Properties p_i48392_1_) {
        super(p_i48392_1_);
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
