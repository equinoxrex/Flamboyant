package mod.equinox.flamboyant.core;

import mod.equinox.flamboyant.core.registry.FlamboyantBlocks;
import mod.equinox.flamboyant.core.registry.FlamboyantItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("flamboyant")
public class Flamboyant {
    public static final String MODID = "flamboyant";

    public Flamboyant() {
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	FlamboyantBlocks.BLOCKS.register(modEventBus);
    	FlamboyantItems.ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    	
        modEventBus.addListener(this::setup);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> this::initSetupClient);   
    }
    
    public void initSetupClient() {
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);	
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
    
    private void clientSetup(final FMLClientSetupEvent event) {
    }
}
