package items;

import java.util.Set;

import com.turbocrackers.usefulemeralds.Reference;

public class EmeraldAxe extends ItemAxeCustom
{

	public EmeraldAxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UsefulEmeraldsItems.EMERALDAXE.getUnlocalizedName());
		setRegistryName(Reference.UsefulEmeraldsItems.EMERALDAXE.getRegistryName());
	}

}
