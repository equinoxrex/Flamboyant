package mod.equinox.flamboyant.block;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.BlockState;
import net.minecraft.block.FourWayBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FPaneBlock extends FourWayBlock {
    protected FPaneBlock(Properties p_i48373_1_) {
        super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, p_i48373_1_);
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateContainer.getBaseState()).with(NORTH, false)).with(EAST, false)).with(SOUTH, false)).with(WEST, false)).with(WATERLOGGED, false));
    }

    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        IBlockReader lvt_2_1_ = p_196258_1_.getWorld();
        BlockPos lvt_3_1_ = p_196258_1_.getPos();
        IFluidState lvt_4_1_ = p_196258_1_.getWorld().getFluidState(p_196258_1_.getPos());
        BlockPos lvt_5_1_ = lvt_3_1_.north();
        BlockPos lvt_6_1_ = lvt_3_1_.south();
        BlockPos lvt_7_1_ = lvt_3_1_.west();
        BlockPos lvt_8_1_ = lvt_3_1_.east();
        BlockState lvt_9_1_ = lvt_2_1_.getBlockState(lvt_5_1_);
        BlockState lvt_10_1_ = lvt_2_1_.getBlockState(lvt_6_1_);
        BlockState lvt_11_1_ = lvt_2_1_.getBlockState(lvt_7_1_);
        BlockState lvt_12_1_ = lvt_2_1_.getBlockState(lvt_8_1_);
        return (BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.getDefaultState().with(NORTH, this.canAttachTo(lvt_9_1_, lvt_9_1_.func_224755_d(lvt_2_1_, lvt_5_1_, Direction.SOUTH)))).with(SOUTH, this.canAttachTo(lvt_10_1_, lvt_10_1_.func_224755_d(lvt_2_1_, lvt_6_1_, Direction.NORTH)))).with(WEST, this.canAttachTo(lvt_11_1_, lvt_11_1_.func_224755_d(lvt_2_1_, lvt_7_1_, Direction.EAST)))).with(EAST, this.canAttachTo(lvt_12_1_, lvt_12_1_.func_224755_d(lvt_2_1_, lvt_8_1_, Direction.WEST)))).with(WATERLOGGED, lvt_4_1_.getFluid() == Fluids.WATER);
    }

    public BlockState updatePostPlacement(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if ((Boolean)p_196271_1_.get(WATERLOGGED)) {
            p_196271_4_.getPendingFluidTicks().scheduleTick(p_196271_5_, Fluids.WATER, Fluids.WATER.getTickRate(p_196271_4_));
        }

        return p_196271_2_.getAxis().isHorizontal() ? (BlockState)p_196271_1_.with((IProperty)FACING_TO_PROPERTY_MAP.get(p_196271_2_), this.canAttachTo(p_196271_3_, p_196271_3_.func_224755_d(p_196271_4_, p_196271_6_, p_196271_2_.getOpposite()))) : super.updatePostPlacement(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState p_200122_1_, BlockState p_200122_2_, Direction p_200122_3_) {
        if (p_200122_2_.getBlock() == this) {
            if (!p_200122_3_.getAxis().isHorizontal()) {
                return true;
            }

            if ((Boolean)p_200122_1_.get((IProperty)FACING_TO_PROPERTY_MAP.get(p_200122_3_)) && (Boolean)p_200122_2_.get((IProperty)FACING_TO_PROPERTY_MAP.get(p_200122_3_.getOpposite()))) {
                return true;
            }
        }

        return super.isSideInvisible(p_200122_1_, p_200122_2_, p_200122_3_);
    }

    public final boolean canAttachTo(BlockState p_220112_1_, boolean p_220112_2_) {
        Block lvt_3_1_ = p_220112_1_.getBlock();
        return !cannotAttach(lvt_3_1_) && p_220112_2_ || lvt_3_1_ instanceof FPaneBlock || lvt_3_1_ instanceof PaneBlock;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    protected void fillStateContainer(Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new IProperty[]{NORTH, EAST, WEST, SOUTH, WATERLOGGED});
    }
}
