package casadis.skewers.items;

import casadis.skewers.Main;
import casadis.skewers.init.ModItems;
import casadis.skewers.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMisc extends Item implements IHasModel {
	public ItemMisc(String name) {		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
