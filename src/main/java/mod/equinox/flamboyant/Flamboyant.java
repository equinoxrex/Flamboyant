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
public class Flamboyant
{
	public static final String MODID = "flamboyant";

 // Directly reference a log4j logger.
	private static final Logger LOGGER = LogManager.getLogger();
	
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
    
    private void setupRenderLayer()
	{
		RenderTypeLookup.setRenderLayer(AMBERGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BEIGEGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(CREAMGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(DARKGREENGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FORESTGREENGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(HOTPINKGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(INDIGOGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(MAROONGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(NAVYGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(OLIVEGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PALEGREENGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PALEPINKGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PALEYELLOWGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SKYBLUEGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SLATEGRAYGLASS,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(VIOLETGLASS,RenderType.translucent());

		RenderTypeLookup.setRenderLayer(AMBERPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BEIGEPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(CREAMPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(DARKGREENPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FORESTGREENPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(HOTPINKPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(INDIGOPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(MAROONPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(NAVYPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(OLIVEPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PALEGREENPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PALEPINKPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(PALEYELLOWPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SKYBLUEPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SLATEGRAYPANE,RenderType.translucent());
		RenderTypeLookup.setRenderLayer(VIOLETPANE,RenderType.translucent());
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
            event.getRegistry().register(new Item(properties).setRegistryName("amber_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("beige_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("cream_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("dark_green_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("forest_green_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("hot_pink_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("indigo_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("maroon_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("navy_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("olive_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("pale_green_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("pale_pink_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("pale_yellow_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("sky_blue_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("slate_gray_dye"));
            event.getRegistry().register(new Item(properties).setRegistryName("violet_dye"));
            event.getRegistry().register(new BlockItem(AMBERWOOL, properties).setRegistryName("amber_wool"));
            event.getRegistry().register(new BlockItem(BEIGEWOOL, properties).setRegistryName("beige_wool"));
            event.getRegistry().register(new BlockItem(CREAMWOOL, properties).setRegistryName("cream_wool"));
            event.getRegistry().register(new BlockItem(DARKGREENWOOL, properties).setRegistryName("dark_green_wool"));
            event.getRegistry().register(new BlockItem(FORESTGREENWOOL, properties).setRegistryName("forest_green_wool"));
            event.getRegistry().register(new BlockItem(HOTPINKWOOL, properties).setRegistryName("hot_pink_wool"));
            event.getRegistry().register(new BlockItem(INDIGOWOOL, properties).setRegistryName("indigo_wool"));
            event.getRegistry().register(new BlockItem(MAROONWOOL, properties).setRegistryName("maroon_wool"));
            event.getRegistry().register(new BlockItem(NAVYWOOL, properties).setRegistryName("navy_wool"));
            event.getRegistry().register(new BlockItem(OLIVEWOOL, properties).setRegistryName("olive_wool"));
            event.getRegistry().register(new BlockItem(PALEGREENWOOL, properties).setRegistryName("pale_green_wool"));
            event.getRegistry().register(new BlockItem(PALEPINKWOOL, properties).setRegistryName("pale_pink_wool"));
            event.getRegistry().register(new BlockItem(PALEYELLOWWOOL, properties).setRegistryName("pale_yellow_wool"));
            event.getRegistry().register(new BlockItem(SKYBLUEWOOL, properties).setRegistryName("sky_blue_wool"));
            event.getRegistry().register(new BlockItem(SLATEGRAYWOOL, properties).setRegistryName("slate_gray_wool"));
            event.getRegistry().register(new BlockItem(VIOLETWOOL, properties).setRegistryName("violet_wool"));
            event.getRegistry().register(new BlockItem(AMBERCARPET, properties).setRegistryName("amber_carpet"));
            event.getRegistry().register(new BlockItem(BEIGECARPET, properties).setRegistryName("beige_carpet"));
            event.getRegistry().register(new BlockItem(CREAMCARPET, properties).setRegistryName("cream_carpet"));
            event.getRegistry().register(new BlockItem(DARKGREENCARPET, properties).setRegistryName("dark_green_carpet"));
            event.getRegistry().register(new BlockItem(FORESTGREENCARPET, properties).setRegistryName("forest_green_carpet"));
            event.getRegistry().register(new BlockItem(HOTPINKCARPET, properties).setRegistryName("hot_pink_carpet"));
            event.getRegistry().register(new BlockItem(INDIGOCARPET, properties).setRegistryName("indigo_carpet"));
            event.getRegistry().register(new BlockItem(MAROONCARPET, properties).setRegistryName("maroon_carpet"));
            event.getRegistry().register(new BlockItem(NAVYCARPET, properties).setRegistryName("navy_carpet"));
            event.getRegistry().register(new BlockItem(OLIVECARPET, properties).setRegistryName("olive_carpet"));
            event.getRegistry().register(new BlockItem(PALEGREENCARPET, properties).setRegistryName("pale_green_carpet"));
            event.getRegistry().register(new BlockItem(PALEPINKCARPET, properties).setRegistryName("pale_pink_carpet"));
            event.getRegistry().register(new BlockItem(PALEYELLOWCARPET, properties).setRegistryName("pale_yellow_carpet"));
            event.getRegistry().register(new BlockItem(SKYBLUECARPET, properties).setRegistryName("sky_blue_carpet"));
            event.getRegistry().register(new BlockItem(SLATEGRAYCARPET, properties).setRegistryName("slate_gray_carpet"));
            event.getRegistry().register(new BlockItem(VIOLETCARPET, properties).setRegistryName("violet_carpet"));
            event.getRegistry().register(new BlockItem(AMBERTERRACOTTA, properties).setRegistryName("amber_terracotta"));
            event.getRegistry().register(new BlockItem(BEIGETERRACOTTA, properties).setRegistryName("beige_terracotta"));
            event.getRegistry().register(new BlockItem(CREAMTERRACOTTA, properties).setRegistryName("cream_terracotta"));
            event.getRegistry().register(new BlockItem(DARKGREENTERRACOTTA, properties).setRegistryName("dark_green_terracotta"));
            event.getRegistry().register(new BlockItem(FORESTGREENTERRACOTTA, properties).setRegistryName("forest_green_terracotta"));
            event.getRegistry().register(new BlockItem(HOTPINKTERRACOTTA, properties).setRegistryName("hot_pink_terracotta"));
            event.getRegistry().register(new BlockItem(INDIGOTERRACOTTA, properties).setRegistryName("indigo_terracotta"));
            event.getRegistry().register(new BlockItem(MAROONTERRACOTTA, properties).setRegistryName("maroon_terracotta"));
            event.getRegistry().register(new BlockItem(NAVYTERRACOTTA, properties).setRegistryName("navy_terracotta"));
            event.getRegistry().register(new BlockItem(OLIVETERRACOTTA, properties).setRegistryName("olive_terracotta"));
            event.getRegistry().register(new BlockItem(PALEGREENTERRACOTTA, properties).setRegistryName("pale_green_terracotta"));
            event.getRegistry().register(new BlockItem(PALEPINKTERRACOTTA, properties).setRegistryName("pale_pink_terracotta"));
            event.getRegistry().register(new BlockItem(PALEYELLOWTERRACOTTA, properties).setRegistryName("pale_yellow_terracotta"));
            event.getRegistry().register(new BlockItem(SKYBLUETERRACOTTA, properties).setRegistryName("sky_blue_terracotta"));
            event.getRegistry().register(new BlockItem(SLATEGRAYTERRACOTTA, properties).setRegistryName("slate_gray_terracotta"));
            event.getRegistry().register(new BlockItem(VIOLETTERRACOTTA, properties).setRegistryName("violet_terracotta"));
            event.getRegistry().register(new BlockItem(AMBERGLAZEDTERRACOTTA, properties).setRegistryName("amber_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(BEIGEGLAZEDTERRACOTTA, properties).setRegistryName("beige_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(CREAMGLAZEDTERRACOTTA, properties).setRegistryName("cream_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(DARKGREENGLAZEDTERRACOTTA, properties).setRegistryName("dark_green_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(FORESTGREENGLAZEDTERRACOTTA, properties).setRegistryName("forest_green_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(HOTPINKGLAZEDTERRACOTTA, properties).setRegistryName("hot_pink_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(INDIGOGLAZEDTERRACOTTA, properties).setRegistryName("indigo_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(MAROONGLAZEDTERRACOTTA, properties).setRegistryName("maroon_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(NAVYGLAZEDTERRACOTTA, properties).setRegistryName("navy_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(OLIVEGLAZEDTERRACOTTA, properties).setRegistryName("olive_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(PALEGREENGLAZEDTERRACOTTA, properties).setRegistryName("pale_green_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(PALEPINKGLAZEDTERRACOTTA, properties).setRegistryName("pale_pink_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(PALEYELLOWGLAZEDTERRACOTTA, properties).setRegistryName("pale_yellow_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(SKYBLUEGLAZEDTERRACOTTA, properties).setRegistryName("sky_blue_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(SLATEGRAYGLAZEDTERRACOTTA, properties).setRegistryName("slate_gray_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(VIOLETGLAZEDTERRACOTTA, properties).setRegistryName("violet_glazed_terracotta"));
            event.getRegistry().register(new BlockItem(AMBERCONCRETE, properties).setRegistryName("amber_concrete"));
            event.getRegistry().register(new BlockItem(BEIGECONCRETE, properties).setRegistryName("beige_concrete"));
            event.getRegistry().register(new BlockItem(CREAMCONCRETE, properties).setRegistryName("cream_concrete"));
            event.getRegistry().register(new BlockItem(DARKGREENCONCRETE, properties).setRegistryName("dark_green_concrete"));
            event.getRegistry().register(new BlockItem(FORESTGREENCONCRETE, properties).setRegistryName("forest_green_concrete"));
            event.getRegistry().register(new BlockItem(HOTPINKCONCRETE, properties).setRegistryName("hot_pink_concrete"));
            event.getRegistry().register(new BlockItem(INDIGOCONCRETE, properties).setRegistryName("indigo_concrete"));
            event.getRegistry().register(new BlockItem(MAROONCONCRETE, properties).setRegistryName("maroon_concrete"));
            event.getRegistry().register(new BlockItem(NAVYCONCRETE, properties).setRegistryName("navy_concrete"));
            event.getRegistry().register(new BlockItem(OLIVECONCRETE, properties).setRegistryName("olive_concrete"));
            event.getRegistry().register(new BlockItem(PALEGREENCONCRETE, properties).setRegistryName("pale_green_concrete"));
            event.getRegistry().register(new BlockItem(PALEPINKCONCRETE, properties).setRegistryName("pale_pink_concrete"));
            event.getRegistry().register(new BlockItem(PALEYELLOWCONCRETE, properties).setRegistryName("pale_yellow_concrete"));
            event.getRegistry().register(new BlockItem(SKYBLUECONCRETE, properties).setRegistryName("sky_blue_concrete"));
            event.getRegistry().register(new BlockItem(SLATEGRAYCONCRETE, properties).setRegistryName("slate_gray_concrete"));
            event.getRegistry().register(new BlockItem(VIOLETCONCRETE, properties).setRegistryName("violet_concrete"));
            event.getRegistry().register(new BlockItem(AMBERCONCRETEPOWDER, properties).setRegistryName("amber_concrete_powder"));
            event.getRegistry().register(new BlockItem(BEIGECONCRETEPOWDER, properties).setRegistryName("beige_concrete_powder"));
            event.getRegistry().register(new BlockItem(CREAMCONCRETEPOWDER, properties).setRegistryName("cream_concrete_powder"));
            event.getRegistry().register(new BlockItem(DARKGREENCONCRETEPOWDER, properties).setRegistryName("dark_green_concrete_powder"));
            event.getRegistry().register(new BlockItem(FORESTGREENCONCRETEPOWDER, properties).setRegistryName("forest_green_concrete_powder"));
            event.getRegistry().register(new BlockItem(HOTPINKCONCRETEPOWDER, properties).setRegistryName("hot_pink_concrete_powder"));
            event.getRegistry().register(new BlockItem(INDIGOCONCRETEPOWDER, properties).setRegistryName("indigo_concrete_powder"));
            event.getRegistry().register(new BlockItem(MAROONCONCRETEPOWDER, properties).setRegistryName("maroon_concrete_powder"));
            event.getRegistry().register(new BlockItem(NAVYCONCRETEPOWDER, properties).setRegistryName("navy_concrete_powder"));
            event.getRegistry().register(new BlockItem(OLIVECONCRETEPOWDER, properties).setRegistryName("olive_concrete_powder"));
            event.getRegistry().register(new BlockItem(PALEGREENCONCRETEPOWDER, properties).setRegistryName("pale_green_concrete_powder"));
            event.getRegistry().register(new BlockItem(PALEPINKCONCRETEPOWDER, properties).setRegistryName("pale_pink_concrete_powder"));
            event.getRegistry().register(new BlockItem(PALEYELLOWCONCRETEPOWDER, properties).setRegistryName("pale_yellow_concrete_powder"));
            event.getRegistry().register(new BlockItem(SKYBLUECONCRETEPOWDER, properties).setRegistryName("sky_blue_concrete_powder"));
            event.getRegistry().register(new BlockItem(SLATEGRAYCONCRETEPOWDER, properties).setRegistryName("slate_gray_concrete_powder"));
            event.getRegistry().register(new BlockItem(VIOLETCONCRETEPOWDER, properties).setRegistryName("violet_concrete_powder"));
            event.getRegistry().register(new BlockItem(AMBERGLASS, properties).setRegistryName("amber_stained_glass"));
            event.getRegistry().register(new BlockItem(BEIGEGLASS, properties).setRegistryName("beige_stained_glass"));
            event.getRegistry().register(new BlockItem(CREAMGLASS, properties).setRegistryName("cream_stained_glass"));
            event.getRegistry().register(new BlockItem(DARKGREENGLASS, properties).setRegistryName("dark_green_stained_glass"));
            event.getRegistry().register(new BlockItem(FORESTGREENGLASS, properties).setRegistryName("forest_green_stained_glass"));
            event.getRegistry().register(new BlockItem(HOTPINKGLASS, properties).setRegistryName("hot_pink_stained_glass"));
            event.getRegistry().register(new BlockItem(INDIGOGLASS, properties).setRegistryName("indigo_stained_glass"));
            event.getRegistry().register(new BlockItem(MAROONGLASS, properties).setRegistryName("maroon_stained_glass"));
            event.getRegistry().register(new BlockItem(NAVYGLASS, properties).setRegistryName("navy_stained_glass"));
            event.getRegistry().register(new BlockItem(OLIVEGLASS, properties).setRegistryName("olive_stained_glass"));
            event.getRegistry().register(new BlockItem(PALEGREENGLASS, properties).setRegistryName("pale_green_stained_glass"));
            event.getRegistry().register(new BlockItem(PALEPINKGLASS, properties).setRegistryName("pale_pink_stained_glass"));
            event.getRegistry().register(new BlockItem(PALEYELLOWGLASS, properties).setRegistryName("pale_yellow_stained_glass"));
            event.getRegistry().register(new BlockItem(SKYBLUEGLASS, properties).setRegistryName("sky_blue_stained_glass"));
            event.getRegistry().register(new BlockItem(SLATEGRAYGLASS, properties).setRegistryName("slate_gray_stained_glass"));
            event.getRegistry().register(new BlockItem(VIOLETGLASS, properties).setRegistryName("violet_stained_glass"));
            event.getRegistry().register(new BlockItem(AMBERPANE, properties).setRegistryName("amber_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(BEIGEPANE, properties).setRegistryName("beige_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(CREAMPANE, properties).setRegistryName("cream_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(DARKGREENPANE, properties).setRegistryName("dark_green_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(FORESTGREENPANE, properties).setRegistryName("forest_green_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(HOTPINKPANE, properties).setRegistryName("hot_pink_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(INDIGOPANE, properties).setRegistryName("indigo_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(MAROONPANE, properties).setRegistryName("maroon_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(NAVYPANE, properties).setRegistryName("navy_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(OLIVEPANE, properties).setRegistryName("olive_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(PALEGREENPANE, properties).setRegistryName("pale_green_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(PALEPINKPANE, properties).setRegistryName("pale_pink_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(PALEYELLOWPANE, properties).setRegistryName("pale_yellow_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(SKYBLUEPANE, properties).setRegistryName("sky_blue_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(SLATEGRAYPANE, properties).setRegistryName("slate_gray_stained_glass_pane"));
            event.getRegistry().register(new BlockItem(VIOLETPANE, properties).setRegistryName("violet_stained_glass_pane"));
            // event.getRegistry().register(new BlockItem(AMBERBED, properties).setRegistryName("amber_bed"));
            
        }
    }
}
