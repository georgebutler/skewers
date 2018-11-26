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
		
		return null;
	}
}
