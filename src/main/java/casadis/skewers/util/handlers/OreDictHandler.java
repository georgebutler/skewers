package casadis.skewers.util.handlers;

import casadis.skewers.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
	// Dictionary names taken from Pam's HarvestCraft
	
	public static final String cropApple="cropApple";
    public static final String cropCarrot="cropCarrot";
    public static final String cropPotato="cropPotato";
	
	public static final String listAllfishraw="listAllfishraw";
	public static final String salmonRaw="salmonRaw";
	
    public static final String listAllchickenraw="listAllchickenraw";
    public static final String listAllporkraw="listAllporkraw";
    public static final String listAllbeefraw="listAllbeefraw";
    public static final String listAllmuttonraw="listAllmuttonraw";
    public static final String listAllrabbitraw="listAllrabbitraw";
    public static final String listAllcookie = "listAllcookie";
    
    public static final String foodCaramel = "foodCaramel";
    
	public static void init() {
		OreDictionary.registerOre(cropApple, Items.APPLE);
        OreDictionary.registerOre(cropCarrot, Items.CARROT);
        OreDictionary.registerOre(cropPotato, Items.POTATO);
		
		OreDictionary.registerOre(listAllfishraw, new ItemStack(Items.FISH, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre(salmonRaw, new ItemStack(Items.FISH, 1, 1));
		
        OreDictionary.registerOre(listAllchickenraw, Items.CHICKEN);
        OreDictionary.registerOre(listAllporkraw, Items.PORKCHOP);
		OreDictionary.registerOre(listAllbeefraw, Items.BEEF);
        OreDictionary.registerOre(listAllmuttonraw, Items.MUTTON);
        OreDictionary.registerOre(listAllrabbitraw, Items.RABBIT);
        OreDictionary.registerOre(listAllcookie, Items.COOKIE);
        
        OreDictionary.registerOre(foodCaramel, ModItems.CARAMEL);
	}
}
