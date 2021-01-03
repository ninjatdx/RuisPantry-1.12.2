package com.formas1.ruispantry.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreBlock extends BlockBase
{

	public OreBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 4);
		setLightLevel(1.0F);
	}

}
