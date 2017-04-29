package items;

import com.turbocrackers.usefulemeralds.Reference;

import net.minecraft.item.ItemSpade;

public class EmeraldShovel extends ItemSpade
{
	public EmeraldShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UsefulEmeraldsItems.EMERALDSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.UsefulEmeraldsItems.EMERALDSHOVEL.getRegistryName());
	}
}