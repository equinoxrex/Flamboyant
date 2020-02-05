package mod.equinox.flamboyant.core.registry;

import static mod.equinox.flamboyant.core.utils.PropertyUtils.CARPET;
import static mod.equinox.flamboyant.core.utils.PropertyUtils.CONCRETE;
import static mod.equinox.flamboyant.core.utils.PropertyUtils.CONCRETE_POWDER;
import static mod.equinox.flamboyant.core.utils.PropertyUtils.GLAZED_TERRACOTTA;
import static mod.equinox.flamboyant.core.utils.PropertyUtils.STAINED_GLASS;
import static mod.equinox.flamboyant.core.utils.PropertyUtils.TERRACOTTA;
import static mod.equinox.flamboyant.core.utils.PropertyUtils.WOOL;

import mod.equinox.flamboyant.common.block.FlamboyantCarpetBlock;
import mod.equinox.flamboyant.core.Flamboyant;
import mod.equinox.flamboyant.core.utils.RegistryUtils;
import net.minecraft.block.Block;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.block.GlazedTerracottaBlock;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FlamboyantBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Flamboyant.MODID);
	
	public static RegistryObject<Block> AMBER_WOOL 			= RegistryUtils.createBlock("amber_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BEIGE_WOOL 			= RegistryUtils.createBlock("beige_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CREAM_WOOL 			= RegistryUtils.createBlock("cream_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_GREEN_WOOL 	= RegistryUtils.createBlock("dark_green_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> FOREST_GREEN_WOOL 	= RegistryUtils.createBlock("forest_green_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> HOT_PINK_WOOL 		= RegistryUtils.createBlock("hot_pink_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> INDIGO_WOOL 		= RegistryUtils.createBlock("indigo_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MAROON_WOOL 		= RegistryUtils.createBlock("maroon_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> NAVY_WOOL 			= RegistryUtils.createBlock("navy_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> OLIVE_WOOL 			= RegistryUtils.createBlock("olive_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_GREEN_WOOL 	= RegistryUtils.createBlock("pale_green_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_PINK_WOOL 		= RegistryUtils.createBlock("pale_pink_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_YELLOW_WOOL 	= RegistryUtils.createBlock("pale_yellow_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SKY_BLUE_WOOL 		= RegistryUtils.createBlock("sky_blue_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SLATE_GRAY_WOOL 	= RegistryUtils.createBlock("slate_gray_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> VIOLET_WOOL			= RegistryUtils.createBlock("violet_wool", () -> new Block(WOOL), ItemGroup.BUILDING_BLOCKS);
    
    public static RegistryObject<Block> AMBER_CARPET 		= RegistryUtils.createBlock("amber_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BEIGE_CARPET 		= RegistryUtils.createBlock("beige_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> CREAM_CARPET 		= RegistryUtils.createBlock("cream_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> DARK_GREEN_CARPET 	= RegistryUtils.createBlock("dark_green_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> FOREST_GREEN_CARPET = RegistryUtils.createBlock("forest_green_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> HOT_PINK_CARPET 	= RegistryUtils.createBlock("hot_pink_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> INDIGO_CARPET 		= RegistryUtils.createBlock("indigo_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> MAROON_CARPET 		= RegistryUtils.createBlock("maroon_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> NAVY_CARPET 		= RegistryUtils.createBlock("navy_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> OLIVE_CARPET 		= RegistryUtils.createBlock("olive_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_GREEN_CARPET 	= RegistryUtils.createBlock("pale_green_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_PINK_CARPET 	= RegistryUtils.createBlock("pale_pink_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_YELLOW_CARPET 	= RegistryUtils.createBlock("pale_yellow_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> SKY_BLUE_CARPET 	= RegistryUtils.createBlock("sky_blue_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> SLATE_GRAY_CARPET 	= RegistryUtils.createBlock("slate_gray_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> VIOLET_CARPET 		= RegistryUtils.createBlock("violet_carpet", () -> new FlamboyantCarpetBlock(CARPET), ItemGroup.DECORATIONS);
    
    public static RegistryObject<Block> AMBER_STAINED_GLASS = RegistryUtils.createBlock("amber_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BEIGE_STAINED_GLASS = RegistryUtils.createBlock("beige_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CREAM_STAINED_GLASS = RegistryUtils.createBlock("cream_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_GREEN_STAINED_GLASS = RegistryUtils.createBlock("dark_green_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> FOREST_GREEN_STAINED_GLASS = RegistryUtils.createBlock("forest_green_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> HOT_PINK_STAINED_GLASS = RegistryUtils.createBlock("hot_pink_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> INDIGO_STAINED_GLASS = RegistryUtils.createBlock("indigo_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MAROON_STAINED_GLASS = RegistryUtils.createBlock("maroon_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> NAVY_STAINED_GLASS = RegistryUtils.createBlock("navy_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> OLIVE_STAINED_GLASS = RegistryUtils.createBlock("olive_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_GREEN_STAINED_GLASS = RegistryUtils.createBlock("pale_green_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_PINK_STAINED_GLASS = RegistryUtils.createBlock("pale_pink_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_YELLOW_STAINED_GLASS = RegistryUtils.createBlock("pale_yellow_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SKY_BLUE_STAINED_GLASS = RegistryUtils.createBlock("sky_blue_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SLATE_GRAY_STAINED_GLASS = RegistryUtils.createBlock("slate_gray_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> VIOLET_STAINED_GLASS = RegistryUtils.createBlock("violet_stained_glass", () -> new StainedGlassBlock(null, STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
    
    public static RegistryObject<Block> AMBER_STAINED_GLASS_PANE = RegistryUtils.createBlock("amber_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BEIGE_STAINED_GLASS_PANE = RegistryUtils.createBlock("beige_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> CREAM_STAINED_GLASS_PANE = RegistryUtils.createBlock("cream_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> DARK_GREEN_STAINED_GLASS_PANE = RegistryUtils.createBlock("dark_green_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> FOREST_GREEN_STAINED_GLASS_PANE = RegistryUtils.createBlock("forest_green_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> HOT_PINK_STAINED_GLASS_PANE = RegistryUtils.createBlock("hot_pink_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> INDIGO_STAINED_GLASS_PANE = RegistryUtils.createBlock("indigo_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> MAROON_STAINED_GLASS_PANE = RegistryUtils.createBlock("maroon_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> NAVY_STAINED_GLASS_PANE = RegistryUtils.createBlock("navy_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> OLIVE_STAINED_GLASS_PANE = RegistryUtils.createBlock("olive_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_GREEN_STAINED_GLASS_PANE = RegistryUtils.createBlock("pale_green_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_PINK_STAINED_GLASS_PANE = RegistryUtils.createBlock("pale_pink_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_YELLOW_STAINED_GLASS_PANE = RegistryUtils.createBlock("pale_yellow_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> SKY_BLUE_STAINED_GLASS_PANE = RegistryUtils.createBlock("sky_blue_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> SLATE_GRAY_STAINED_GLASS_PANE = RegistryUtils.createBlock("slate_gray_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> VIOLET_STAINED_GLASS_PANE = RegistryUtils.createBlock("violet_stained_glass_pane", () -> new StainedGlassPaneBlock(null, STAINED_GLASS), ItemGroup.DECORATIONS);    
    
    public static RegistryObject<Block> AMBER_TERRACOTTA = RegistryUtils.createBlock("amber_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BEIGE_TERRACOTTA = RegistryUtils.createBlock("beige_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CREAM_TERRACOTTA = RegistryUtils.createBlock("cream_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_GREEN_TERRACOTTA = RegistryUtils.createBlock("dark_green_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> FOREST_GREEN_TERRACOTTA = RegistryUtils.createBlock("forest_green_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> HOT_PINK_TERRACOTTA = RegistryUtils.createBlock("hot_pink_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> INDIGO_TERRACOTTA = RegistryUtils.createBlock("indigo_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MAROON_TERRACOTTA = RegistryUtils.createBlock("maroon_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> NAVY_TERRACOTTA = RegistryUtils.createBlock("navy_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> OLIVE_TERRACOTTA = RegistryUtils.createBlock("olive_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_GREEN_TERRACOTTA = RegistryUtils.createBlock("pale_green_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_PINK_TERRACOTTA = RegistryUtils.createBlock("pale_pink_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_YELLOW_TERRACOTTA = RegistryUtils.createBlock("pale_yellow_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SKY_BLUE_TERRACOTTA = RegistryUtils.createBlock("sky_blue_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SLATE_GRAY_TERRACOTTA = RegistryUtils.createBlock("slate_gray_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> VIOLET_TERRACOTTA = RegistryUtils.createBlock("violet_terracotta", () -> new Block(TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
    
    public static RegistryObject<Block> AMBER_GLAZED_TERRACOTTA = RegistryUtils.createBlock("amber_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BEIGE_GLAZED_TERRACOTTA = RegistryUtils.createBlock("beige_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> CREAM_GLAZED_TERRACOTTA = RegistryUtils.createBlock("cream_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> DARK_GREEN_GLAZED_TERRACOTTA = RegistryUtils.createBlock("dark_green_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> FOREST_GREEN_GLAZED_TERRACOTTA = RegistryUtils.createBlock("forest_green_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> HOT_PINK_GLAZED_TERRACOTTA = RegistryUtils.createBlock("hot_pink_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> INDIGO_GLAZED_TERRACOTTA = RegistryUtils.createBlock("indigo_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> MAROON_GLAZED_TERRACOTTA = RegistryUtils.createBlock("maroon_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> NAVY_GLAZED_TERRACOTTA = RegistryUtils.createBlock("navy_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> OLIVE_GLAZED_TERRACOTTA = RegistryUtils.createBlock("olive_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_GREEN_GLAZED_TERRACOTTA = RegistryUtils.createBlock("pale_green_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_PINK_GLAZED_TERRACOTTA = RegistryUtils.createBlock("pale_pink_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> PALE_YELLOW_GLAZED_TERRACOTTA = RegistryUtils.createBlock("pale_yellow_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> SKY_BLUE_GLAZED_TERRACOTTA = RegistryUtils.createBlock("sky_blue_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> SLATE_GRAY_GLAZED_TERRACOTTA = RegistryUtils.createBlock("slate_gray_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> VIOLET_GLAZED_TERRACOTTA = RegistryUtils.createBlock("violet_glazed_terracotta", () -> new GlazedTerracottaBlock(GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);    
    
    public static RegistryObject<Block> AMBER_CONCRETE = RegistryUtils.createBlock("amber_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BEIGE_CONCRETE = RegistryUtils.createBlock("beige_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CREAM_CONCRETE = RegistryUtils.createBlock("cream_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_GREEN_CONCRETE = RegistryUtils.createBlock("dark_green_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> FOREST_GREEN_CONCRETE = RegistryUtils.createBlock("forest_green_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> HOT_PINK_CONCRETE = RegistryUtils.createBlock("hot_pink_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> INDIGO_CONCRETE = RegistryUtils.createBlock("indigo_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MAROON_CONCRETE = RegistryUtils.createBlock("maroon_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> NAVY_CONCRETE = RegistryUtils.createBlock("navy_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> OLIVE_CONCRETE = RegistryUtils.createBlock("olive_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_GREEN_CONCRETE = RegistryUtils.createBlock("pale_green_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_PINK_CONCRETE = RegistryUtils.createBlock("pale_pink_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_YELLOW_CONCRETE = RegistryUtils.createBlock("pale_yellow_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SKY_BLUE_CONCRETE = RegistryUtils.createBlock("sky_blue_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SLATE_GRAY_CONCRETE = RegistryUtils.createBlock("slate_gray_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> VIOLET_CONCRETE = RegistryUtils.createBlock("violet_concrete", () -> new Block(CONCRETE), ItemGroup.BUILDING_BLOCKS);
    
    public static RegistryObject<Block> AMBER_CONCRETE_POWDER = RegistryUtils.createBlock("amber_concrete_powder", () -> new ConcretePowderBlock(AMBER_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BEIGE_CONCRETE_POWDER = RegistryUtils.createBlock("beige_concrete_powder", () -> new ConcretePowderBlock(BEIGE_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> CREAM_CONCRETE_POWDER = RegistryUtils.createBlock("cream_concrete_powder", () -> new ConcretePowderBlock(CREAM_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DARK_GREEN_CONCRETE_POWDER = RegistryUtils.createBlock("dark_green_concrete_powder", () -> new ConcretePowderBlock(DARK_GREEN_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> FOREST_GREEN_CONCRETE_POWDER = RegistryUtils.createBlock("forest_green_concrete_powder", () -> new ConcretePowderBlock(FOREST_GREEN_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> HOT_PINK_CONCRETE_POWDER = RegistryUtils.createBlock("hot_pink_concrete_powder", () -> new ConcretePowderBlock(HOT_PINK_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> INDIGO_CONCRETE_POWDER = RegistryUtils.createBlock("indigo_concrete_powder", () -> new ConcretePowderBlock(INDIGO_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> MAROON_CONCRETE_POWDER = RegistryUtils.createBlock("maroon_concrete_powder", () -> new ConcretePowderBlock(MAROON_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> NAVY_CONCRETE_POWDER = RegistryUtils.createBlock("navy_concrete_powder", () -> new ConcretePowderBlock(NAVY_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> OLIVE_CONCRETE_POWDER = RegistryUtils.createBlock("olive_concrete_powder", () -> new ConcretePowderBlock(OLIVE_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_GREEN_CONCRETE_POWDER = RegistryUtils.createBlock("pale_green_concrete_powder", () -> new ConcretePowderBlock(PALE_GREEN_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_PINK_CONCRETE_POWDER = RegistryUtils.createBlock("pale_pink_concrete_powder", () -> new ConcretePowderBlock(PALE_PINK_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> PALE_YELLOW_CONCRETE_POWDER = RegistryUtils.createBlock("pale_yellow_concrete_powder", () -> new ConcretePowderBlock(PALE_YELLOW_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SKY_BLUE_CONCRETE_POWDER = RegistryUtils.createBlock("sky_blue_concrete_powder", () -> new ConcretePowderBlock(SKY_BLUE_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> SLATE_GRAY_CONCRETE_POWDER = RegistryUtils.createBlock("slate_gray_concrete_powder", () -> new ConcretePowderBlock(SLATE_GRAY_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> VIOLET_CONCRETE_POWDER = RegistryUtils.createBlock("violet_concrete_powder", () -> new ConcretePowderBlock(VIOLET_CONCRETE.get(), CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
}