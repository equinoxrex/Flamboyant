package mod.equinox.flamboyant.block;

import mod.equinox.flamboyant.Flamboyant;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public enum BlockProperties {
    WOOL(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8F).sound(SoundType.CLOTH), Block.class),
    TERRACOTTA(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.25F, 4.2F), Block.class),
    GLAZED_TERRACOTTA(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.4F), GlazedTerracottaBlock.class),
    CONCRETE(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.8F), Block.class),
    CONCRETE_POWDER(Block.Properties.create(Material.SAND).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.5F).sound(SoundType.SAND), ConcretePowderBlock.class),
    GLASS(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS), Block.class),
    STAINED_GLASS(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS), StainedGlassBlock.class),
    STAINED_GLASS_PANE(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS), StainedGlassPaneBlock.class);/*,
    BED(Block.Properties.create(Material.WOOL).sound(SoundType.WOOD).hardnessAndResistance(0.2F), BedBlock.class),
    CARPET(Block.Properties.create(Material.CARPET).hardnessAndResistance(0.1F).sound(SoundType.CLOTH), CarpetBlock.class);*/
    
    Block.Properties properties;
    private Class<? extends Block> clazz;
    BlockProperties(Block.Properties properties, Class<? extends Block> clazz) {
        this.properties = properties;
        this.clazz = clazz;
    }

    public Block create(DyeColors color) {
        try {
            Block block = null;
            switch(this.clazz.getName().replace("net.minecraft.block.", "")) {
                case "Block":
                    block = new Block(this.properties);
                    break;
                case "GlazedTerracottaBlock":
                    block = new GlazedTerracottaBlock(this.properties);
                    break;
                case "ConcretePowderBlock":
                    block = new ConcretePowderBlock(CONCRETE.create(color), this.properties);
                    break;
                case "StainedGlassBlock":
                    block = new StainedGlassBlock(null, this.properties);
                    break;
                case "StainedGlassPaneBlock":
                    block = new StainedGlassPaneBlock(null, this.properties);
                    break;
                default:
                    throw new Exception("Invalid class name!");
            }
            block.setRegistryName((color.name() + "_" + this.name()).toLowerCase());
            return block;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isParent() {
        return this == GLASS;
    }
}
