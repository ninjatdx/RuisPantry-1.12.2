package com.formas1.ruispantry.blocks.uncorruptor;

import java.util.Random;

import com.formas1.ruispantry.blocks.BlockBase;
import com.formas1.ruispantry.blocks.SpinelBlock;
import com.formas1.ruispantry.init.ModBlocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Uncorruptor extends BlockBase
{

	public Uncorruptor(String name, Material material)
	{
		super(name, material);
		this.setTickRandomly(true);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 4);
		setLightLevel(0.5F);
	}
	
	public boolean isFullCube(IBlockState state)
	{
    return false;
	}
	public boolean isOpaqueCube(IBlockState state)
	{
    return false;
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		
		
		IBlockState west = worldIn.getBlockState(pos.west());
		IBlockState down = worldIn.getBlockState(pos.down());
		
		if(west == ModBlocks.SPINEL_BLOCK.getDefaultState())
		{
			if(down != Blocks.AIR.getDefaultState())
			{
		for(int x = -8; x < 16; x++) {
		    for(int y = 0; y < 256; y++) {
		        for(int z = -8; z < 16; z++) {
		            BlockPos newPos = new BlockPos(pos.getX()+x, y, pos.getZ()+z);
		           // System.out.println(newPos);
		            if(worldIn.getBlockState(newPos).getBlock() == ModBlocks.CORRUPTED_GRASS)
		            {
		                worldIn.setBlockState(newPos, Blocks.GRASS.getDefaultState());
		                worldIn.setBlockState(pos.west(), ModBlocks.SPINEL_BLOCK_OFF.getDefaultState());
		            }
		            if(worldIn.getBlockState(newPos).getBlock() == ModBlocks.CORRUPTED_DIRT)
		            {
		                worldIn.setBlockState(newPos, Blocks.GRASS.getDefaultState());
		                worldIn.setBlockState(pos.west(), ModBlocks.SPINEL_BLOCK_OFF.getDefaultState());
		            }
		            if(worldIn.getBlockState(newPos).getBlock() == ModBlocks.CORRUPTED_DIRT)
		            {
		                worldIn.setBlockState(newPos, Blocks.DIRT.getDefaultState());
		                worldIn.setBlockState(pos.west(), ModBlocks.SPINEL_BLOCK_OFF.getDefaultState());
		            }
		            if(worldIn.getBlockState(newPos).getBlock() == ModBlocks.CORRUPTED_OAK_LOG)
		            {
		                worldIn.setBlockState(newPos, Blocks.LOG.getDefaultState());
		                worldIn.setBlockState(pos.west(), ModBlocks.SPINEL_BLOCK_OFF.getDefaultState());
		            }
		            if(worldIn.getBlockState(newPos).getBlock() == ModBlocks.CORRUPTED_OAK_LEAVES)
		            {
		                worldIn.setBlockState(newPos, Blocks.LEAVES.getDefaultState());
		                worldIn.setBlockState(pos.west(), ModBlocks.SPINEL_BLOCK_OFF.getDefaultState());
		            }
		            if(worldIn.getBlockState(newPos).getBlock() == ModBlocks.CORRUPTED_OAK_SAPLING)
		            {
		                worldIn.setBlockState(newPos, Blocks.SAPLING.getDefaultState());
		                worldIn.setBlockState(pos.west(), ModBlocks.SPINEL_BLOCK_OFF.getDefaultState());
		            }
		            
		            if(worldIn.getBlockState(newPos).getBlock() == ModBlocks.CORRUPTED_COBBLESTONE)
		            {
		                worldIn.setBlockState(newPos, Blocks.COBBLESTONE.getDefaultState());
		                worldIn.setBlockState(pos.west(), ModBlocks.SPINEL_BLOCK_OFF.getDefaultState());
		            }
		            
		            if(worldIn.getBlockState(newPos).getBlock() == ModBlocks.CORRUPTED_MOSSY_COBBLESTONE)
		            {
		                worldIn.setBlockState(newPos, Blocks.MAGMA.getDefaultState());
		                worldIn.setBlockState(pos.west(), ModBlocks.SPINEL_BLOCK_OFF.getDefaultState());
		            }
		        }
		    }
		}
		}
		}
}
}
