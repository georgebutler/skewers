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
	
	public static final Item SKEWER_CARAMEL_APPLE = new ItemSkewer("skewer_caramel_apple", 4, 2.4f, false, true);
	
	// Crafting Ingredients
	public static final Item CARAMEL = new ItemMisc("caramel");
}
