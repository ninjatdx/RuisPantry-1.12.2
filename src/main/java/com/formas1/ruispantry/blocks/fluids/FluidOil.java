package com.formas1.ruispantry.blocks.fluids;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;

public class FluidOil extends Fluid
{

	public FluidOil(String name, ResourceLocation still, ResourceLocation flow, ResourceLocation overlay)
	{
		super(name, still, flow, overlay);
		
		this.setUnlocalizedName(name);
		
		
	}

}
