package com.formas1.ruispantry.blocks;

import java.util.Random;

import com.formas1.ruispantry.init.ModBlocks;

import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class CorruptedGrassBlock extends BlockBase
{

	public CorruptedGrassBlock(String name, Material material)
	{
		super(name, material);
		this.setTickRandomly(true);
		
		setSoundType(SoundType.GROUND);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("shovel", 4);
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		
		IBlockState block = worldIn.getBlockState(pos);
		IBlockState north = worldIn.getBlockState(pos.north());
		IBlockState south = worldIn.getBlockState(pos.south());
		IBlockState east = worldIn.getBlockState(pos.east());
		IBlockState west = worldIn.getBlockState(pos.west());
		IBlockState up = worldIn.getBlockState(pos.up());
		IBlockState down = worldIn.getBlockState(pos.down());
		
		//Grass
			if(north == Blocks.GRASS.getDefaultState())
			{
				 worldIn.setBlockState(pos.north(), ModBlocks.CORRUPTED_GRASS.getDefaultState());
			}
			
			if(south == Blocks.GRASS.getDefaultState())
			{
				 worldIn.setBlockState(pos.south(), ModBlocks.CORRUPTED_GRASS.getDefaultState());
			}

			if(east == Blocks.GRASS.getDefaultState())
			{
				 worldIn.setBlockState(pos.east(), ModBlocks.CORRUPTED_GRASS.getDefaultState());
			}
		
			if(west == Blocks.GRASS.getDefaultState())
			{
				 worldIn.setBlockState(pos.west(), ModBlocks.CORRUPTED_GRASS.getDefaultState());
			}
			
			if(up == Blocks.GRASS.getDefaultState())
			{
				 worldIn.setBlockState(pos.up(), ModBlocks.CORRUPTED_GRASS.getDefaultState());
			}
			
			if(down == Blocks.GRASS.getDefaultState())
			{
				 worldIn.setBlockState(pos.down(), ModBlocks.CORRUPTED_GRASS.getDefaultState());
			}
			
			//Dirt
			
			if(north == Blocks.DIRT.getDefaultState())
			{
				 worldIn.setBlockState(pos.north(), ModBlocks.CORRUPTED_DIRT.getDefaultState());
			}
			
			if(south == Blocks.DIRT.getDefaultState())
			{
				 worldIn.setBlockState(pos.south(), ModBlocks.CORRUPTED_DIRT.getDefaultState());
			}

			if(east == Blocks.DIRT.getDefaultState())
			{
				 worldIn.setBlockState(pos.east(), ModBlocks.CORRUPTED_DIRT.getDefaultState());
			}
		
			if(west == Blocks.DIRT.getDefaultState())
			{
				 worldIn.setBlockState(pos.west(), ModBlocks.CORRUPTED_DIRT.getDefaultState());
			}
			
			if(up == Blocks.DIRT.getDefaultState())
			{
				 worldIn.setBlockState(pos.up(), ModBlocks.CORRUPTED_DIRT.getDefaultState());
			}
			
			if(down == Blocks.DIRT.getDefaultState())
			{
				 worldIn.setBlockState(pos.down(), ModBlocks.CORRUPTED_DIRT.getDefaultState());
			}
			
			//Log
			
			if(north == Blocks.LOG.getDefaultState())
			{
				 worldIn.setBlockState(pos.north(), ModBlocks.CORRUPTED_OAK_LOG.getDefaultState());
			}
			
			if(south == Blocks.LOG.getDefaultState())
			{
				 worldIn.setBlockState(pos.south(), ModBlocks.CORRUPTED_OAK_LOG.getDefaultState());
			}

			if(east == Blocks.LOG.getDefaultState())
			{
				 worldIn.setBlockState(pos.east(), ModBlocks.CORRUPTED_OAK_LOG.getDefaultState());
			}
		
			if(west == Blocks.LOG.getDefaultState())
			{
				 worldIn.setBlockState(pos.west(), ModBlocks.CORRUPTED_OAK_LOG.getDefaultState());
			}
			
			if(up == Blocks.LOG.getDefaultState())
			{
				 worldIn.setBlockState(pos.up(), ModBlocks.CORRUPTED_OAK_LOG.getDefaultState());
			}
			
			if(down == Blocks.LOG.getDefaultState())
			{
				 worldIn.setBlockState(pos.down(), ModBlocks.CORRUPTED_OAK_LOG.getDefaultState());
			}
			
			//Sapling
			
			if(north == Blocks.SAPLING.getDefaultState())
			{
				 worldIn.setBlockState(pos.north(), ModBlocks.CORRUPTED_OAK_SAPLING.getDefaultState());
			}
			
			if(south == Blocks.SAPLING.getDefaultState())
			{
				 worldIn.setBlockState(pos.south(), ModBlocks.CORRUPTED_OAK_SAPLING.getDefaultState());
			}

			if(east == Blocks.SAPLING.getDefaultState())
			{
				 worldIn.setBlockState(pos.east(), ModBlocks.CORRUPTED_OAK_SAPLING.getDefaultState());
			}
		
			if(west == Blocks.SAPLING.getDefaultState())
			{
				 worldIn.setBlockState(pos.west(), ModBlocks.CORRUPTED_OAK_SAPLING.getDefaultState());
			}
			
			if(up == Blocks.SAPLING.getDefaultState())
			{
				 worldIn.setBlockState(pos.up(), ModBlocks.CORRUPTED_OAK_SAPLING.getDefaultState());
			}
			
			if(down == Blocks.SAPLING.getDefaultState())
			{
				 worldIn.setBlockState(pos.down(), ModBlocks.CORRUPTED_OAK_SAPLING.getDefaultState());
			}
			
			//Stone
			if(north == Blocks.STONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.north(), ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState());
			}
			
			if(south == Blocks.STONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.south(), ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState());
			}

			if(east == Blocks.STONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.east(), ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState());
			}
		
			if(west == Blocks.STONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.west(), ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState());
			}
			
			if(up == Blocks.STONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.up(), ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState());
			}
			
			if(down == Blocks.STONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.down(), ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState());
			}
			
			if(north == ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.north(), ModBlocks.CORRUPTED_COBBLESTONE.getDefaultState());
			}
			
			if(south == ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.south(), ModBlocks.CORRUPTED_COBBLESTONE.getDefaultState());
			}

			if(east == ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.east(), ModBlocks.CORRUPTED_COBBLESTONE.getDefaultState());
			}
		
			if(west == ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.west(), ModBlocks.CORRUPTED_COBBLESTONE.getDefaultState());
			}
			
			if(up == ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.up(), ModBlocks.CORRUPTED_COBBLESTONE.getDefaultState());
			}
			
			if(down == ModBlocks.CORRUPTED_MOSSY_COBBLESTONE.getDefaultState())
			{
				 worldIn.setBlockState(pos.down(), ModBlocks.CORRUPTED_COBBLESTONE.getDefaultState());
			}
		
		
	}
	
	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable)
	{
		return true;
	}
}
