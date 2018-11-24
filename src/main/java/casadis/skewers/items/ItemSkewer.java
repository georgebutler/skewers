package casadis.skewers.items;

import java.util.Map;

import com.google.common.collect.Maps;

import casadis.skewers.Main;
import casadis.skewers.init.ModItems;
import casadis.skewers.util.IHasModel;
import casadis.skewers.util.handlers.ConfigHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class ItemSkewer extends ItemFood implements IHasModel {
	private boolean isCooked;
	
	public ItemSkewer(String name, int amount, float saturation, boolean isWolfFood, boolean isCooked) {
		super(amount * ConfigHandler.SKEWER_HUNGER_MULTIPLIER, saturation * ConfigHandler.SKEWER_SATURATION_MULTIPLIER, isWolfFood);
		
		this.isCooked = isCooked;
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote && !this.isCooked) {
			double sickChance = (int)(Math.random() * ((ConfigHandler.SICK_CHANCE - 0) + 1)) + 0;
			
			if (sickChance <= ConfigHandler.SICK_CHANCE) {
				player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 1));
				player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 600, 1));
			}
		}
		
		super.onFoodEaten(stack, worldIn, player);
	}
    
    @Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
