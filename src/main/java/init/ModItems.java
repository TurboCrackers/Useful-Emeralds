package init;

import com.turbocrackers.usefulemeralds.Reference;

import items.EmeraldAxe;
import items.EmeraldHoe;
import items.EmeraldPickaxe;
import items.EmeraldShovel;
import items.EmeraldSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static Item emerald_sword;
	public static Item emerald_pickaxe;
	public static Item emerald_axe;
	public static Item emerald_shovel;
	public static Item emerald_hoe;
	
	public static ToolMaterial EMERALDSWORDTOOLMATERIAL = EnumHelper.addToolMaterial("Emerald Sword", 3, 700, 15.0F, 6, 25);
	public static ToolMaterial EMERALDPICKAXETOOLMATERIAL = EnumHelper.addToolMaterial("Emerald Pickaxe", 3, 700, 15.0F, 4.5F, 25);
	public static ToolMaterial EMERALDAXETOOLMATERIAL = EnumHelper.addToolMaterial("Emerald Axe", 3, 1000, 6.5F, 4.0F, 30);
	public static ToolMaterial EMERALDSHOVELTOOLMATERIAL = EnumHelper.addToolMaterial("Emerald Shovel", 3, 700, 15.0F, 5, 25);
	public static ToolMaterial EMERALDHOETOOLMATERIAL = EnumHelper.addToolMaterial("Emerald Hoe", 3, 700, 15.0F, 1, 25);
	
	public static void init()
	{
		emerald_sword = new EmeraldSword(EMERALDSWORDTOOLMATERIAL);
		emerald_pickaxe = new EmeraldPickaxe(EMERALDPICKAXETOOLMATERIAL);
		emerald_axe = new EmeraldAxe(EMERALDAXETOOLMATERIAL);
		emerald_shovel = new EmeraldShovel(EMERALDSHOVELTOOLMATERIAL);
		emerald_hoe = new EmeraldHoe(EMERALDHOETOOLMATERIAL);
	}
	
	public static void register()
	{
		GameRegistry.register(emerald_sword);
		GameRegistry.register(emerald_pickaxe);
		GameRegistry.register(emerald_axe);
		GameRegistry.register(emerald_shovel);
		GameRegistry.register(emerald_hoe);
	}
	
	public static void registerRenders()
	{
		registerRender(emerald_sword);
		registerRender(emerald_pickaxe);
		registerRender(emerald_axe);
		registerRender(emerald_shovel);
		registerRender(emerald_hoe);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
