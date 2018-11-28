package casadis.skewers.conditions;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import casadis.skewers.util.Reference;
import casadis.skewers.util.handlers.ConfigHandler;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class SkewerConditionFactory implements IConditionFactory {
	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) 
	{
		boolean value = JsonUtils.getBoolean(json , "value", true);
		String key = JsonUtils.getString(json, "type");
		
		if (key.equals(Reference.MOD_ID + ":BeefEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_BEEF == value;
		}
		else if (key.equals(Reference.MOD_ID + ":PorkEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_PORK == value;
		}
		else if (key.equals(Reference.MOD_ID + ":CodEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_COD == value;
		}
		else if (key.equals(Reference.MOD_ID + ":SalmonEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_SALMON == value;
		}
		else if (key.equals(Reference.MOD_ID + ":VeggieEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_VEGGIE == value;
		}
		else if (key.equals(Reference.MOD_ID + ":ChickenEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_CHICKEN == value;
		}
		else if (key.equals(Reference.MOD_ID + ":RabbitEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_RABBIT == value;
		}
		else if (key.equals(Reference.MOD_ID + ":MuttonEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_MUTTON == value;
		}
		else if (key.equals(Reference.MOD_ID + ":CookieEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_COOKIE == value;
		}
		else if (key.equals(Reference.MOD_ID + ":AppleEnabled")) {
			return () -> ConfigHandler.ENABLE_SKEWER_APPLE == value;
		}
		else if (key.equals(Reference.MOD_ID + ":CaramelEnabled")) {
			return () -> ConfigHandler.ENABLE_CARAMEL == value;
		}
		
		return null;
	}
}
