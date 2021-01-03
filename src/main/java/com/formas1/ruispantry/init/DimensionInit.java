package com.formas1.ruispantry.init;


import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.world.corruptionDimension.DimensionCorruption;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit 
{
	public static final DimensionType CORRUPTION = DimensionType.register("corruption", "_corruption", Main.CORRUPTION, DimensionCorruption.class, false);	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(Main.CORRUPTION, CORRUPTION);
	}
}