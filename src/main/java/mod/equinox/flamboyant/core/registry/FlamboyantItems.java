package mod.equinox.flamboyant.core.registry;

import mod.equinox.flamboyant.core.Flamboyant;
import mod.equinox.flamboyant.core.utils.RegistryUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FlamboyantItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Flamboyant.MODID);
	public static Item.Properties properties = new Item.Properties().group(ItemGroup.MISC);
	
	public static RegistryObject<Item> AMBER_DYE = RegistryUtils.createItem("amber_dye", () -> new Item(properties));
	public static RegistryObject<Item> BEIGE_DYE = RegistryUtils.createItem("beige_dye", () -> new Item(properties));
	public static RegistryObject<Item> CREAM_DYE = RegistryUtils.createItem("cream_dye", () -> new Item(properties));
	public static RegistryObject<Item> DARK_GREEN_DYE = RegistryUtils.createItem("dark_green_dye", () -> new Item(properties));
	public static RegistryObject<Item> FOREST_GREEN_DYE = RegistryUtils.createItem("forest_green_dye", () -> new Item(properties));
	public static RegistryObject<Item> HOT_PINK_DYE = RegistryUtils.createItem("hot_pink_dye", () -> new Item(properties));
	public static RegistryObject<Item> INDIGO_DYE = RegistryUtils.createItem("indigo_dye", () -> new Item(properties));
	public static RegistryObject<Item> MAROON_DYE = RegistryUtils.createItem("maroon_dye", () -> new Item(properties));
	public static RegistryObject<Item> NAVY_DYE = RegistryUtils.createItem("navy_dye", () -> new Item(properties));
	public static RegistryObject<Item> OLIVE_DYE = RegistryUtils.createItem("olive_dye", () -> new Item(properties));
	public static RegistryObject<Item> PALE_GREEN_DYE = RegistryUtils.createItem("pale_green_dye", () -> new Item(properties));
	public static RegistryObject<Item> PALE_PINK_DYE = RegistryUtils.createItem("pale_pink_dye", () -> new Item(properties));
	public static RegistryObject<Item> PALE_YELLOW_DYE = RegistryUtils.createItem("pale_yellow_dye", () -> new Item(properties));
	public static RegistryObject<Item> SKY_BLUE_DYE = RegistryUtils.createItem("sky_blue_dye", () -> new Item(properties));
	public static RegistryObject<Item> SLATE_GRAY_DYE = RegistryUtils.createItem("slate_gray_dye", () -> new Item(properties));
	public static RegistryObject<Item> VIOLET_DYE = RegistryUtils.createItem("violet_dye", () -> new Item(properties));
}
