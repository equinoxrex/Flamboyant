package mod.equinox.flamboyant.core.registry;

import mod.equinox.flamboyant.core.Flamboyant;
import mod.equinox.flamboyant.core.utils.TradeUtils;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Flamboyant.MODID)
public class FlamboyantTrades {
	
	//ItemsForEmeraldsTrade
	//Get Items for giving Emeralds
	//Emerald Amount, Item Amount, Trade Amount, Villager XP
	
	//EmeraldsForItemsTrade
	//Get Emeralds for giving Items
	//Item Amount, Emerald Amount, Trade Amount, Villager XP
	
	//(amount you give), (amount you get), (times allowed to trade), (xp for the villager)
	
	@SubscribeEvent
	public static void onWandererTradesEvent(WandererTradesEvent event) {
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.AMBER_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.BEIGE_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.CREAM_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.DARK_GREEN_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.FOREST_GREEN_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.HOT_PINK_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.INDIGO_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.MAROON_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.NAVY_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.OLIVE_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.PALE_GREEN_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.PALE_PINK_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.PALE_YELLOW_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.SKY_BLUE_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.SLATE_GRAY_DYE.get(), 1, 3, 12, 1));
		event.getGenericTrades().add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantItems.VIOLET_DYE.get(), 1, 3, 12, 1));
	}
	
	
	@SubscribeEvent
	public static void onVillagerTradesEvent(VillagerTradesEvent event) {
		if(event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.AMBER_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.BEIGE_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.CREAM_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.DARK_GREEN_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.FOREST_GREEN_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.HOT_PINK_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.INDIGO_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.MAROON_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.NAVY_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.OLIVE_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_GREEN_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_PINK_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_YELLOW_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.SKY_BLUE_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.SLATE_GRAY_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.VIOLET_TERRACOTTA.get(), 1, 1, 12, 15));
			
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.AMBER_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.BEIGE_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.CREAM_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.DARK_GREEN_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.FOREST_GREEN_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.HOT_PINK_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.INDIGO_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.MAROON_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.NAVY_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.OLIVE_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_GREEN_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_PINK_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_YELLOW_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.SKY_BLUE_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.SLATE_GRAY_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
			event.getTrades().get(4).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.VIOLET_GLAZED_TERRACOTTA.get(), 1, 1, 12, 15));
		}
		if(event.getType() == VillagerProfession.SHEPHERD) {
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.AMBER_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.BEIGE_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.CREAM_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.DARK_GREEN_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.FOREST_GREEN_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.HOT_PINK_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.INDIGO_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.MAROON_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.NAVY_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.OLIVE_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_GREEN_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_PINK_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_YELLOW_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.SKY_BLUE_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.SLATE_GRAY_WOOL.get(), 1, 1, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.VIOLET_WOOL.get(), 1, 1, 16, 5));
			
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.AMBER_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.BEIGE_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.CREAM_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.DARK_GREEN_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.FOREST_GREEN_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.HOT_PINK_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.INDIGO_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.MAROON_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.NAVY_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.OLIVE_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_GREEN_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_PINK_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.PALE_YELLOW_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.SKY_BLUE_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.SLATE_GRAY_CARPET.get(), 1, 4, 16, 5));
			event.getTrades().get(2).add(new TradeUtils.ItemsForEmeraldsTrade(FlamboyantBlocks.VIOLET_CARPET.get(), 1, 4, 16, 5));
			
			event.getTrades().get(2).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.CREAM_DYE.get(), 12, 1, 16, 20));
			event.getTrades().get(2).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.PALE_GREEN_DYE.get(), 12, 1, 16, 20));
			event.getTrades().get(2).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.SKY_BLUE_DYE.get(), 12, 1, 16, 20));
			event.getTrades().get(2).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.SLATE_GRAY_DYE.get(), 12, 1, 16, 20));
			
			event.getTrades().get(3).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.AMBER_DYE.get(), 12, 1, 16, 10));
			event.getTrades().get(3).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.BEIGE_DYE.get(), 12, 1, 16, 10));
			event.getTrades().get(3).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.HOT_PINK_DYE.get(), 12, 1, 16, 10));		
			event.getTrades().get(3).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.MAROON_DYE.get(), 12, 1, 16, 10));
			event.getTrades().get(3).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.PALE_PINK_DYE.get(), 12, 1, 16, 10));
			event.getTrades().get(3).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.PALE_YELLOW_DYE.get(), 12, 1, 16, 10));
			event.getTrades().get(3).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.VIOLET_DYE.get(), 12, 1, 16, 10));
			
			event.getTrades().get(4).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.INDIGO_DYE.get(), 12, 1, 16, 30));
			event.getTrades().get(4).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.NAVY_DYE.get(), 12, 1, 16, 30));
			event.getTrades().get(4).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.OLIVE_DYE.get(), 12, 1, 16, 30));
			event.getTrades().get(4).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.DARK_GREEN_DYE.get(), 12, 1, 16, 30));
			event.getTrades().get(4).add(new TradeUtils.EmeraldsForItemsTrade(FlamboyantItems.FOREST_GREEN_DYE.get(), 12, 1, 16, 30));
		}
    }
}
