package com.formas1.ruispantry.init;

import com.formas1.ruispantry.blocks.fluids.FluidOil;
import com.formas1.ruispantry.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidInit
{

	public static final Fluid OIL_FLUID = new FluidOil("oil", new ResourceLocation(Reference.MOD_ID + ":blocks/oil_still"), new ResourceLocation(Reference.MOD_ID + ":blocks/oil_flow"), new ResourceLocation(Reference.MOD_ID + "blocks:oil_overlay"));
	
	
	
	
	public static void RegisterFluids()
	{
		registerFluid(OIL_FLUID);
	}

	private static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
