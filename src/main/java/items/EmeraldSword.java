package items;

import com.turbocrackers.usefulemeralds.Reference;

import net.minecraft.item.ItemSword;

public class EmeraldSword extends ItemSword
{
	public EmeraldSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UsefulEmeraldsItems.EMERALDSWORD.getUnlocalizedName());
		setRegistryName(Reference.UsefulEmeraldsItems.EMERALDSWORD.getRegistryName());
	}
}
