package init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting 
{
	public static void register()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_sword, 1), " E ", " E ", " W ", 'E', Items.EMERALD, 'W', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_axe, 1), "EE ", "EW ", " W ", 'E', Items.EMERALD, 'W', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_pickaxe, 1), "EEE", " W ", " W ", 'E', Items.EMERALD, 'W', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_shovel, 1), " E ", " W ", " W ", 'E', Items.EMERALD, 'W', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emerald_hoe, 1), "EE ", " W ", " W ", 'E', Items.EMERALD, 'W', Items.STICK);
	}
}
