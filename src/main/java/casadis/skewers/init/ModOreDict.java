package casadis.skewers.init;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {
	// Dictionary names taken from Pam's HarvestCraft
	
    public static final String listAllchickenraw="listAllchickenraw";
    public static final String listAllchickencooked="listAllchickencooked";
    public static final String listAllporkraw="listAllporkraw";
    public static final String listAllporkcooked="listAllporkcooked";
    public static final String listAllbeefraw="listAllbeefraw";
    public static final String listAllbeefcooked="listAllbeefcooked";
    public static final String listAllmuttonraw="listAllmuttonraw";
    public static final String listAllmuttoncooked="listAllmuttoncooked";
    public static final String listAllrabbitraw="listAllrabbitraw";
    public static final String listAllrabbitcooked="listAllrabbitcooked";
    
	public static void init() {
        OreDictionary.registerOre(listAllchickenraw, Items.CHICKEN);
        OreDictionary.registerOre(listAllchickencooked, Items.COOKED_CHICKEN);
        OreDictionary.registerOre(listAllporkraw, Items.PORKCHOP);
        OreDictionary.registerOre(listAllporkcooked, Items.COOKED_PORKCHOP);
		OreDictionary.registerOre(listAllbeefraw, Items.BEEF);
		OreDictionary.registerOre(listAllbeefcooked, Items.COOKED_BEEF);
        OreDictionary.registerOre(listAllmuttonraw, Items.MUTTON);
        OreDictionary.registerOre(listAllmuttoncooked, Items.COOKED_MUTTON);
        OreDictionary.registerOre(listAllrabbitraw, Items.RABBIT);
        OreDictionary.registerOre(listAllrabbitcooked, Items.COOKED_RABBIT);
	}
}
