package casadis.skewers.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		// Skewers
		GameRegistry.addSmelting(ModItems.SKEWER_BEEF_RAW, new ItemStack(ModItems.SKEWER_BEEF_COOKED, 1),  0.70f);
		GameRegistry.addSmelting(ModItems.SKEWER_PORKCHOP_RAW, new ItemStack(ModItems.SKEWER_PORKCHOP_COOKED, 1),  0.70f);
		GameRegistry.addSmelting(ModItems.SKEWER_COD_RAW, new ItemStack(ModItems.SKEWER_COD_COOKED, 1),  0.70f);
		GameRegistry.addSmelting(ModItems.SKEWER_SALMON_RAW, new ItemStack(ModItems.SKEWER_SALMON_COOKED, 1),  0.70f);
		GameRegistry.addSmelting(ModItems.SKEWER_VEGGIE_RAW, new ItemStack(ModItems.SKEWER_VEGGIE_COOKED, 1),  0.70f);
		
		// Crafting Ingredients
		GameRegistry.addSmelting(Items.SUGAR, new ItemStack(ModItems.CARAMEL, 1),  0.70f);
	}
}
