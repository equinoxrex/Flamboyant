package mod.equinox.flamboyant;

import mod.equinox.flamboyant.block.BlockProperties;
import mod.equinox.flamboyant.block.DyeColors;
import mod.equinox.flamboyant.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Flamboyant.MODID)
public class Flamboyant {
    public static final String MODID = "flamboyant";
    public static final ItemGroup CREATIVE_TAB = new ItemGroup(Flamboyant.MODID) {
        @Override public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ICON_BLOCK);
        }
    };

    //private static final Logger LOGGER = LogManager.getLogger();

    public Flamboyant() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(ModBlocks.ICON_BLOCK);
            event.getRegistry().registerAll(ModBlocks.getAll());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(CREATIVE_TAB);

            for(DyeColors color : DyeColors.values()) {
                event.getRegistry().register(new Item(properties).setRegistryName(color.name().toLowerCase() + "_dye"));
            }

            event.getRegistry().register(new BlockItem(ModBlocks.ICON_BLOCK, properties).setRegistryName(ModBlocks.ICON_BLOCK.getRegistryName()));
            for(Block block : ModBlocks.getAll()) {
                event.getRegistry().register(new BlockItem(block, properties).setRegistryName(block.getRegistryName()));
            }
        }
    }
}
