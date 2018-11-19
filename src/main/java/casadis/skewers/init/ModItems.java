package casadis.skewers.init;

import java.util.ArrayList;
import java.util.List;

import casadis.skewers.items.ItemMisc;
import casadis.skewers.items.ItemSkewer;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Skewers
	public static final Item SKEWER_BEEF_RAW = new ItemSkewer("skewer_beef_raw", 3, 1.8f, true, false);
	public static final Item SKEWER_BEEF_COOKED = new ItemSkewer("skewer_beef_cooked", 8, 12.8f, true, true);
	
	public static final Item SKEWER_PORKCHOP_RAW = new ItemSkewer("skewer_porkchop_raw", 3, 0.6f, true, false);
	public static final Item SKEWER_PORKCHOP_COOKED = new ItemSkewer("skewer_porkchop_cooked", 8, 12.8f, true, true);
	
	public static final Item SKEWER_COD_RAW = new ItemSkewer("skewer_cod_raw", 2, 0.4f, false, false);
	public static final Item SKEWER_COD_COOKED = new ItemSkewer("skewer_cod_cooked", 5, 6.0f, true, true);
	
	public static final Item SKEWER_SALMON_RAW = new ItemSkewer("skewer_salmon_raw", 2, 0.2f, false, false);
	public static final Item SKEWER_SALMON_COOKED = new ItemSkewer("skewer_salmon_cooked", 6, 9.6f, true, true);
	
	public static final Item SKEWER_VEGGIE_RAW = new ItemSkewer("skewer_veggie_raw", 5, 4.0f, false, false);
	public static final Item SKEWER_VEGGIE_COOKED = new ItemSkewer("skewer_veggie_cooked", 10, 12.0f, true, true);
	
	public static final Item SKEWER_CHICKEN_RAW = new ItemSkewer("skewer_chicken_raw", 2, 1.2f, false, false);
	public static final Item SKEWER_CHICKEN_COOKED = new ItemSkewer("skewer_chicken_cooked", 6, 7.2f, true, true);
	
	public static final Item SKEWER_RABBIT_RAW = new ItemSkewer("skewer_rabbit_raw", 3, 1.8f, false, false);
	public static final Item SKEWER_RABBIT_COOKED = new ItemSkewer("skewer_rabbit_cooked", 5, 6.0f, true, true);
	
	public static final Item SKEWER_MUTTON_RAW = new ItemSkewer("skewer_mutton_raw", 2, 1.2f, false, false);
	public static final Item SKEWER_MUTTON_COOKED = new ItemSkewer("skewer_mutton_cooked", 6, 9.6f, true, true);
	
	public static final Item SKEWER_CARAMEL_APPLE = new ItemSkewer("skewer_caramel_apple", 6, 9.6f, false, true);
	
	// Crafting Ingredients
	public static final Item CARAMEL = new ItemMisc("caramel");
}
