package items;

import com.turbocrackers.usefulemeralds.Reference;

import net.minecraft.item.ItemPickaxe;

public class EmeraldPickaxe extends ItemPickaxe
{
	public EmeraldPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.UsefulEmeraldsItems.EMERALDPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.UsefulEmeraldsItems.EMERALDPICKAXE.getRegistryName());
	}
}
