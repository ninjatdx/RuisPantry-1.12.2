package com.formas1.ruispantry.util.handlers;

import com.formas1.ruispantry.blocks.deep_fryer.TileEntityDeepFryer;
import com.formas1.ruispantry.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityDeepFryer.class, new ResourceLocation(Reference.MOD_ID + ":deep_fryer"));
	}
}
