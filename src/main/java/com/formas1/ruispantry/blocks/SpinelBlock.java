package com.formas1.ruispantry.blocks;

import com.formas1.ruispantry.commands.teleportdimension.CustomTeleport;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpinelBlock extends BlockBase
{
	
	public SpinelBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 4);
		setLightLevel(0.0F);
		
	}
}
