package com.formas1.ruispantry.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlankBlock extends BlockBase
{

	public PlankBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 4);
		setLightLevel(0.0F);
	}

}
