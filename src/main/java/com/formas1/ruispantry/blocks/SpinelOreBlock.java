package com.formas1.ruispantry.blocks;

import java.util.Random;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SpinelOreBlock extends BlockBase
{

	public SpinelOreBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 4);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.SPINEL;
	}
	
	 public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return MapColor.NETHERRACK;
	    }
	 

}
