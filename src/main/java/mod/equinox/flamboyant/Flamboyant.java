package mod.equinox.flamboyant;

import mod.equinox.flamboyant.setup.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static mod.equinox.flamboyant.block.ModBlocks.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
//The value here should match an entry in the META-INF/mods.toml file
@Mod("flamboyant")
public class Flamboyant {
    public static final String MODID = "flamboyant";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger(Flamboyant.class);

    public Flamboyant() {
        MinecraftForge.EVENT_BUS.register(this);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> this::initClientSetup);
    }

    private void initClientSetup(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
    }

    private void setupClient(final FMLClientSetupEvent event) {
        setupRenderLayer();
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void setupRenderLayer() {
        RenderTypeLookup.setRenderLayer(AMBERGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(BEIGEGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(CREAMGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(DARKGREENGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(FORESTGREENGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(HOTPINKGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(INDIGOGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(MAROONGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(NAVYGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(OLIVEGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(PALEGREENGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(PALEPINKGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(PALEYELLOWGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(SKYBLUEGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(SLATEGRAYGLASS, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(VIOLETGLASS, RenderType.func_228645_f_());

        RenderTypeLookup.setRenderLayer(AMBERPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(BEIGEPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(CREAMPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(DARKGREENPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(FORESTGREENPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(HOTPINKPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(INDIGOPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(MAROONPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(NAVYPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(OLIVEPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(PALEGREENPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(PALEPINKPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(PALEYELLOWPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(SKYBLUEPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(SLATEGRAYPANE, RenderType.func_228645_f_());
        RenderTypeLookup.setRenderLayer(VIOLETPANE, RenderType.func_228645_f_());
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(
                    AMBERWOOL, BEIGEWOOL, CREAMWOOL, DARKGREENWOOL, FORESTGREENWOOL, HOTPINKWOOL, INDIGOWOOL, MAROONWOOL,
                    NAVYWOOL, OLIVEWOOL, PALEGREENWOOL, PALEPINKWOOL, PALEYELLOWWOOL, SKYBLUEWOOL, SLATEGRAYWOOL, VIOLETWOOL,
                    AMBERCARPET, BEIGECARPET, CREAMCARPET, DARKGREENCARPET, FORESTGREENCARPET, HOTPINKCARPET, INDIGOCARPET, MAROONCARPET,
                    NAVYCARPET, OLIVECARPET, PALEGREENCARPET, PALEPINKCARPET, PALEYELLOWCARPET, SKYBLUECARPET, SLATEGRAYCARPET, VIOLETCARPET,
                    AMBERTERRACOTTA, BEIGETERRACOTTA, CREAMTERRACOTTA, DARKGREENTERRACOTTA, FORESTGREENTERRACOTTA, HOTPINKTERRACOTTA, INDIGOTERRACOTTA, MAROONTERRACOTTA,
                    NAVYTERRACOTTA, OLIVETERRACOTTA, PALEGREENTERRACOTTA, PALEPINKTERRACOTTA, PALEYELLOWTERRACOTTA, SKYBLUETERRACOTTA, SLATEGRAYTERRACOTTA, VIOLETTERRACOTTA,
                    AMBERGLAZEDTERRACOTTA, BEIGEGLAZEDTERRACOTTA, CREAMGLAZEDTERRACOTTA, DARKGREENGLAZEDTERRACOTTA, FORESTGREENGLAZEDTERRACOTTA, HOTPINKGLAZEDTERRACOTTA, INDIGOGLAZEDTERRACOTTA, MAROONGLAZEDTERRACOTTA,
                    NAVYGLAZEDTERRACOTTA, OLIVEGLAZEDTERRACOTTA, PALEGREENGLAZEDTERRACOTTA, PALEPINKGLAZEDTERRACOTTA, PALEYELLOWGLAZEDTERRACOTTA, SKYBLUEGLAZEDTERRACOTTA, SLATEGRAYGLAZEDTERRACOTTA, VIOLETGLAZEDTERRACOTTA,
                    AMBERCONCRETE, BEIGECONCRETE, CREAMCONCRETE, DARKGREENCONCRETE, FORESTGREENCONCRETE, HOTPINKCONCRETE, INDIGOCONCRETE, MAROONCONCRETE,
                    NAVYCONCRETE, OLIVECONCRETE, PALEGREENCONCRETE, PALEPINKCONCRETE, PALEYELLOWCONCRETE, SKYBLUECONCRETE, SLATEGRAYCONCRETE, VIOLETCONCRETE,
                    AMBERCONCRETEPOWDER, BEIGECONCRETEPOWDER, CREAMCONCRETEPOWDER, DARKGREENCONCRETEPOWDER, FORESTGREENCONCRETEPOWDER, HOTPINKCONCRETEPOWDER, INDIGOCONCRETEPOWDER, MAROONCONCRETEPOWDER,
                    NAVYCONCRETEPOWDER, OLIVECONCRETEPOWDER, PALEGREENCONCRETEPOWDER, PALEPINKCONCRETEPOWDER, PALEYELLOWCONCRETEPOWDER, SKYBLUECONCRETEPOWDER, SLATEGRAYCONCRETEPOWDER, VIOLETCONCRETEPOWDER,
                    AMBERGLASS, BEIGEGLASS, CREAMGLASS, DARKGREENGLASS, FORESTGREENGLASS, HOTPINKGLASS, INDIGOGLASS, MAROONGLASS,
                    NAVYGLASS, OLIVEGLASS, PALEGREENGLASS, PALEPINKGLASS, PALEYELLOWGLASS, SKYBLUEGLASS, SLATEGRAYGLASS, VIOLETGLASS,
                    AMBERPANE, BEIGEPANE, CREAMPANE, DARKGREENPANE, FORESTGREENPANE, HOTPINKPANE, INDIGOPANE, MAROONPANE,
                    NAVYPANE, OLIVEPANE, PALEGREENPANE, PALEPINKPANE, PALEYELLOWPANE, SKYBLUEPANE, SLATEGRAYPANE, VIOLETPANE
                    // AMBERBED
            );
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(ModSetup.itemGroup);
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"amber_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"beige_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"cream_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"dark_green_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"forest_green_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"hot_pink_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"indigo_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"maroon_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"navy_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"olive_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"pale_green_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"pale_pink_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"pale_yellow_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"sky_blue_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"slate_gray_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName(MODID,"violet_dye"));
            event.getRegistry().register(new BlockItem(AMBERWOOL, properties).setRegistryName(MODID,"amber_wool"));
            event.getRegistry().register(new BlockItem(BEIGEWOOL, properties).setRegistryName(MODID,"beige_wool"));
            event.getRegistry().register(new BlockItem(CREAMWOOL, properties).setRegistryName(MODID,"cream_wool"));
            event.getRegistry().register(new BlockItem(DARKGREENWOOL, properties).setRegistryName(MODID,"dark_green_wool"));
            event.getRegistry().register(new BlockItem(FORESTGREENWOOL, properties).setRegistryName(MODID,"forest_green_wool"));
            event.getRegistry().register(new BlockItem(HOTPINKWOOL, properties).setRegistryName(MODID,"hot_pink_wool"));
            event.getRegistry().register(new BlockItem(INDIGOWOOL, properties).setRegistryName(MODID,"indigo_wool"));
            event.getRegistry().register(new BlockItem(MAROONWOOL, properties).setRegistryName(MODID,"maroon_wool"));
            event.getRegistry().register(new BlockItem(NAVYWOOL, properties).setRegistryName(MODID,"navy_wool"));
            event.getRegistry().register(new BlockItem(OLIVEWOOL, properties).setRegistryName(MODID,"olive_wool"));
            event.getRegistry().register(new BlockItem(PALEGREENWOOL, properties).setRegistryName(MODID,"pale_green_wool"));
            event.getRegistry().register(new BlockItem(PALEPINKWOOL, properties).setRegistryName(MODID,"pale_pink_wool"));
            event.getRegistry().register(new BlockItem(PALEYELLOWWOOL, properties).setRegistryName(MODID,"pale_yellow_wool"));
            event.getRegistry().register(new BlockItem(SKYBLUEWOOL, properties).setRegistryName(MODID,"sky_blue_wool"));
            event.getRegistry().register(new BlockItem(SLATEGRAYWOOL, properties).setRegistryName(MODID,"slate_gray_wool"));
            event.getRegistry().register(new BlockItem(VIOLETWOOL, properties).setRegistryName(MODID,"violet_wool"));
            event.getRegistry().register(new BlockItem(AMBERCARPET, properties).setRegistryName(MODID,"amber_carpet"));
            event.getRegistry().register(new BlockItem(BEIGECARPET, properties).setRegistryName(MODID,"beige_carpet"));
            event.getRegistry().register(new BlockItem(CREAMCARPET, properties).setRegistryName(MODID,"cream_carpet"));
            event.getRegistry().register(new BlockItem(DARKGREENCARPET, properties).setRegistryName(MODID,"dark_green_carpet"));
            event.getRegistry().register(new BlockItem(FORESTGREENCARPET, properties).setRegistryName(MODID,"forest_green_carpet"));
            event.getRegistry().register(new BlockItem(HOTPINKCARPET, properties).setRegistryName(MODID,"hot_pink_carpet"));
            event.getRegistry().register(new BlockItem(INDIGOCARPET, properties).setRegistryName(MODID,"indigo_carpet"));
            event.getRegistry().register(new BlockItem(MAROONCARPET, properties).setRegistryName(MODID,"maroon_carpet"));
            event.getRegistry().register(new BlockItem(NAVYCARPET, properties).setRegistryName(MODID,"navy_carpet"));
            event.getRegistry().register(new BlockItem(OLIVECARPET, properties).setRegistryName(MODID,"olive_carpet"));
            event.getRegistry().register(new BlockItem(PALEGREENCARPET, properties).setRegistryName(MODID,"pale_green_carpet"));
            event.getRegistry().register(new BlockItem(PALEPINKCARPET, properties).setRegistryName(MODID,"pale_pink_carpet"));
            event.getRegistry().register(new BlockItem(PALEYELLOWCARPET, properties).setRegistryName(MODID,"pale_yellow_carpet"));
            event.getRegistry().register(new BlockItem(SKYBLUECARPET, properties).setRegistryName(MODID,"sky_blue_carpet"));
            event.getRegistry().register(new BlockItem(SLATEGRAYCARPET, properties).setRegistryName(MODID,"slate_gray_carpet"));
            event.getRegistry().register(new BlockItem(VIOLETCARPET, properties).setRegistryName(MODID,"violet_carpet"));
            event.getRegistry().register(new BlockItem(AMBERTERRACOTTA, properties).setRegistryName(MODID,"amber_terracotta"));
            event.getRegistry().register(new BlockItem(BEIGETERRACOTTA, properties).setRegistryName(MODID,"beige_terracotta"));
            event.getRegistry().register(new BlockItem(CREAMTERRACOTTA, properties).setRegistryName(MODID,"cream_terracotta"));
            event.getRegistry().register(new BlockItem(DARKGREENTERRACOTTA, properties).setRegistryName(MODID,"dark_green_terracotta"));
            event.getRegistry().register(new BlockItem(FORESTGREENTERRACOTTA, properties).setRegistryName(MODID,"forest_green_terracotta"));
            event.getRegistry().register(new BlockItem(HOTPINKTERRACOTTA, properties).setRegistryName(MODID,"hot_pink_terracotta"));
            event.getRegistry().register(new BlockItem(INDIGOTERRACOTTA, properties).setRegistryName(MODID,"indigo_terracotta"));
            event.getRegistry().register(new BlockItem(MAROONTERRACOTTA, properties).setRegistryName(MODID,"maroon_terracotta"));
            event.getRegistry().register(new BlockItem(NAVYTERRACOTTA, properties).setRegistryName(MODID,"navy_terracotta"));
            event.getRegistry().register(new BlockItem(OLIVETERRACOTTA, properties).setRegistryName(MODID,"olive_terracotta"));
            event.getRegistry().register(new BlockItem(PALEGREENTERRACOTTA, properties).setRegistryName(MODID,"pale_green_terracotta"));
            event.getRegistry().register(new BlockItem(PALEPINKTERRACOTTA, properties).setRegistryName(MODID,"pale_pink_terracotta"));
            event.getRegistry().register(new BlockItem(PALEYELLOWTERRACOTTA, properties).setRegistryName(MODID,"pale_yellow_terracotta"));
            event.getRegistry().register(new BlockItem(SKYBLUETERRACOTTA, properties).setRegistryName(MODID,"sky_blue_terracotta"));
            event.getRegistry().register(new BlockItem(SLATEGRAYTERRACOTTA, properties).setRegistryName(MODID,"slate_gray_terracotta"));
            event.getRegistry().register(new BlockItem(VIOLETTERRACOTTA, properties).setRegistryName(MODID,"violet_terracotta"));
            event.getRegistry().register(new BlockItem(AMBERGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"amber_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(BEIGEGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"beige_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(CREAMGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"cream_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(DARKGREENGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"dark_green_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(FORESTGREENGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"forest_green_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(HOTPINKGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"hot_pink_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(INDIGOGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"indigo_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(MAROONGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"maroon_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(NAVYGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"navy_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(OLIVEGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"olive_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(PALEGREENGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"pale_green_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(PALEPINKGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"pale_pink_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(PALEYELLOWGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"pale_yellow_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(SKYBLUEGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"sky_blue_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(SLATEGRAYGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"slate_gray_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(VIOLETGLAZEDTERRACOTTA, properties).setRegistryName(MODID,"violet_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(AMBERCONCRETE, properties).setRegistryName(MODID,"amber_concrete"));
            event.getRegistry().register(new BlockItem(BEIGECONCRETE, properties).setRegistryName(MODID,"beige_concrete"));
            event.getRegistry().register(new BlockItem(CREAMCONCRETE, properties).setRegistryName(MODID,"cream_concrete"));
            event.getRegistry().register(new BlockItem(DARKGREENCONCRETE, properties).setRegistryName(MODID,"dark_green_concrete"));
            event.getRegistry().register(new BlockItem(FORESTGREENCONCRETE, properties).setRegistryName(MODID,"forest_green_concrete"));
            event.getRegistry().register(new BlockItem(HOTPINKCONCRETE, properties).setRegistryName(MODID,"hot_pink_concrete"));
            event.getRegistry().register(new BlockItem(INDIGOCONCRETE, properties).setRegistryName(MODID,"indigo_concrete"));
            event.getRegistry().register(new BlockItem(MAROONCONCRETE, properties).setRegistryName(MODID,"maroon_concrete"));
            event.getRegistry().register(new BlockItem(NAVYCONCRETE, properties).setRegistryName(MODID,"navy_concrete"));
            event.getRegistry().register(new BlockItem(OLIVECONCRETE, properties).setRegistryName(MODID,"olive_concrete"));
            event.getRegistry().register(new BlockItem(PALEGREENCONCRETE, properties).setRegistryName(MODID,"pale_green_concrete"));
            event.getRegistry().register(new BlockItem(PALEPINKCONCRETE, properties).setRegistryName(MODID,"pale_pink_concrete"));
            event.getRegistry().register(new BlockItem(PALEYELLOWCONCRETE, properties).setRegistryName(MODID,"pale_yellow_concrete"));
            event.getRegistry().register(new BlockItem(SKYBLUECONCRETE, properties).setRegistryName(MODID,"sky_blue_concrete"));
            event.getRegistry().register(new BlockItem(SLATEGRAYCONCRETE, properties).setRegistryName(MODID,"slate_gray_concrete"));
            event.getRegistry().register(new BlockItem(VIOLETCONCRETE, properties).setRegistryName(MODID,"violet_concrete"));
            event.getRegistry().register(new BlockItem(AMBERCONCRETEPOWDER, properties).setRegistryName(MODID,"amber_concrete_powder"));
            event.getRegistry().register(new BlockItem(BEIGECONCRETEPOWDER, properties).setRegistryName(MODID,"beige_concrete_powder"));
            event.getRegistry().register(new BlockItem(CREAMCONCRETEPOWDER, properties).setRegistryName(MODID,"cream_concrete_powder"));
            event.getRegistry().register(new BlockItem(DARKGREENCONCRETEPOWDER, properties).setRegistryName(MODID,"dark_green_concrete_powder"));
            event.getRegistry().register(new BlockItem(FORESTGREENCONCRETEPOWDER, properties).setRegistryName(MODID,"forest_green_concrete_powder"));
            event.getRegistry().register(new BlockItem(HOTPINKCONCRETEPOWDER, properties).setRegistryName(MODID,"hot_pink_concrete_powder"));
            event.getRegistry().register(new BlockItem(INDIGOCONCRETEPOWDER, properties).setRegistryName(MODID,"indigo_concrete_powder"));
            event.getRegistry().register(new BlockItem(MAROONCONCRETEPOWDER, properties).setRegistryName(MODID,"maroon_concrete_powder"));
            event.getRegistry().register(new BlockItem(NAVYCONCRETEPOWDER, properties).setRegistryName(MODID,"navy_concrete_powder"));
            event.getRegistry().register(new BlockItem(OLIVECONCRETEPOWDER, properties).setRegistryName(MODID,"olive_concrete_powder"));
            event.getRegistry().register(new BlockItem(PALEGREENCONCRETEPOWDER, properties).setRegistryName(MODID,"pale_green_concrete_powder"));
            event.getRegistry().register(new BlockItem(PALEPINKCONCRETEPOWDER, properties).setRegistryName(MODID,"pale_pink_concrete_powder"));
            event.getRegistry().register(new BlockItem(PALEYELLOWCONCRETEPOWDER, properties).setRegistryName(MODID,"pale_yellow_concrete_powder"));
            event.getRegistry().register(new BlockItem(SKYBLUECONCRETEPOWDER, properties).setRegistryName(MODID,"sky_blue_concrete_powder"));
            event.getRegistry().register(new BlockItem(SLATEGRAYCONCRETEPOWDER, properties).setRegistryName(MODID,"slate_gray_concrete_powder"));
            event.getRegistry().register(new BlockItem(VIOLETCONCRETEPOWDER, properties).setRegistryName(MODID,"violet_concrete_powder"));
            event.getRegistry().register(new BlockItem(AMBERGLASS, properties).setRegistryName(MODID,"amber_stained_glass"));
            event.getRegistry().register(new BlockItem(BEIGEGLASS, properties).setRegistryName(MODID,"beige_stained_glass"));
            event.getRegistry().register(new BlockItem(CREAMGLASS, properties).setRegistryName(MODID,"cream_stained_glass"));
            event.getRegistry().register(new BlockItem(DARKGREENGLASS, properties).setRegistryName(MODID,"dark_green_stained_glass"));
            event.getRegistry().register(new BlockItem(FORESTGREENGLASS, properties).setRegistryName(MODID,"forest_green_stained_glass"));
            event.getRegistry().register(new BlockItem(HOTPINKGLASS, properties).setRegistryName(MODID,"hot_pink_stained_glass"));
            event.getRegistry().register(new BlockItem(INDIGOGLASS, properties).setRegistryName(MODID,"indigo_stained_glass"));
            event.getRegistry().register(new BlockItem(MAROONGLASS, properties).setRegistryName(MODID,"maroon_stained_glass"));
            event.getRegistry().register(new BlockItem(NAVYGLASS, properties).setRegistryName(MODID,"navy_stained_glass"));
            event.getRegistry().register(new BlockItem(OLIVEGLASS, properties).setRegistryName(MODID,"olive_stained_glass"));
            event.getRegistry().register(new BlockItem(PALEGREENGLASS, properties).setRegistryName(MODID,"pale_green_stained_glass"));
            event.getRegistry().register(new BlockItem(PALEPINKGLASS, properties).setRegistryName(MODID,"pale_pink_stained_glass"));
            event.getRegistry().register(new BlockItem(PALEYELLOWGLASS, properties).setRegistryName(MODID,"pale_yellow_stained_glass"));
            event.getRegistry().register(new BlockItem(SKYBLUEGLASS, properties).setRegistryName(MODID,"sky_blue_stained_glass"));
            event.getRegistry().register(new BlockItem(SLATEGRAYGLASS, properties).setRegistryName(MODID,"slate_gray_stained_glass"));
            event.getRegistry().register(new BlockItem(VIOLETGLASS, properties).setRegistryName(MODID,"violet_stained_glass"));
            event.getRegistry().register(new BlockItem(AMBERPANE, properties).setRegistryName(MODID,"amber_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(BEIGEPANE, properties).setRegistryName(MODID,"beige_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(CREAMPANE, properties).setRegistryName(MODID,"cream_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(DARKGREENPANE, properties).setRegistryName(MODID,"dark_green_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(FORESTGREENPANE, properties).setRegistryName(MODID,"forest_green_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(HOTPINKPANE, properties).setRegistryName(MODID,"hot_pink_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(INDIGOPANE, properties).setRegistryName(MODID,"indigo_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(MAROONPANE, properties).setRegistryName(MODID,"maroon_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(NAVYPANE, properties).setRegistryName(MODID,"navy_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(OLIVEPANE, properties).setRegistryName(MODID,"olive_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(PALEGREENPANE, properties).setRegistryName(MODID,"pale_green_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(PALEPINKPANE, properties).setRegistryName(MODID,"pale_pink_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(PALEYELLOWPANE, properties).setRegistryName(MODID,"pale_yellow_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(SKYBLUEPANE, properties).setRegistryName(MODID,"sky_blue_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(SLATEGRAYPANE, properties).setRegistryName(MODID,"slate_gray_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(VIOLETPANE, properties).setRegistryName(MODID,"violet_stained_glass_pane"));
            // event.getRegistry().register(new BlockItem(AMBERBED, properties).setRegistryName(MODID,"amber_bed"));
        }
    }
}
