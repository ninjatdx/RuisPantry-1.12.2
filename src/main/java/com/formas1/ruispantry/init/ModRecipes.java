package com.formas1.ruispantry.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.FORMAS_ORE, new ItemStack(ModItems.FORMAS_INGOT, 1), 2.0F);
		GameRegistry.addSmelting(ModBlocks.MILKSHAKE_ORE, new ItemStack(ModItems.MILKSHAKE_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.GAM_ORE, new ItemStack(ModItems.GAM_INGOT, 1), 1.5F);
	}
}
