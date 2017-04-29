package items;

import com.turbocrackers.usefulemeralds.Reference;

import net.minecraft.item.ItemHoe;

public class EmeraldHoe extends ItemHoe
{
	public EmeraldHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UsefulEmeraldsItems.EMERALDHOE.getUnlocalizedName());
		setRegistryName(Reference.UsefulEmeraldsItems.EMERALDHOE.getRegistryName());
	}
}
