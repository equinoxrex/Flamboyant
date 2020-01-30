package mod.equinox.flamboyant.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraft.block.SoundType;


public class BlockProperties {
    public static final Block.Properties WOOL = Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F).sound(SoundType.CLOTH);
    public static final Block.Properties TERRACOTTA = Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25F, 4.2F);
    public static final Block.Properties GLAZEDTERRACOTTA = Block.Properties.create(Material.ROCK).hardnessAndResistance(1.4F);
    public static final Block.Properties CONCRETE = Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F);
    public static final Block.Properties CONCRETEPOWDER = Block.Properties.create(Material.SAND).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.5F).sound(SoundType.SAND);
    public static final Block.Properties GLASS = Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS);
    public static final Block.Properties BED = Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F);
    public static final Block.Properties CARPET = Block.Properties.create(Material.CARPET).hardnessAndResistance(0.1F).sound(SoundType.CLOTH);
}
