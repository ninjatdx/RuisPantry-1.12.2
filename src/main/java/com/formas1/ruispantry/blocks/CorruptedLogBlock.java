package com.formas1.ruispantry.blocks;

import java.util.Random;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.init.ModItems;
import com.formas1.ruispantry.util.IHasModel;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CorruptedLogBlock extends BlockLog implements IHasModel{

	  public CorruptedLogBlock(String name)
	    {
	        super();
	        setDefaultState(blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
	        this.setTickRandomly(true);
	        
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.RUISPANTRYTAB);			
			ModBlocks.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
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
				
				//Leaves
				
				if(north == Blocks.LEAVES.getDefaultState())
				{
					 worldIn.setBlockState(pos.north(), ModBlocks.CORRUPTED_OAK_LEAVES.getDefaultState());
				}
				
				if(south == Blocks.LEAVES.getDefaultState())
				{
					 worldIn.setBlockState(pos.south(), ModBlocks.CORRUPTED_OAK_LEAVES.getDefaultState());
				}

				if(east == Blocks.LEAVES.getDefaultState())
				{
					 worldIn.setBlockState(pos.east(), ModBlocks.CORRUPTED_OAK_LEAVES.getDefaultState());
				}
			
				if(west == Blocks.LEAVES.getDefaultState())
				{
					 worldIn.setBlockState(pos.west(), ModBlocks.CORRUPTED_OAK_LEAVES.getDefaultState());
				}
				
				if(up == Blocks.LEAVES.getDefaultState())
				{
					 worldIn.setBlockState(pos.up(), ModBlocks.CORRUPTED_OAK_LEAVES.getDefaultState());
				}
				
				if(down == Blocks.LEAVES.getDefaultState())
				{
					 worldIn.setBlockState(pos.down(), ModBlocks.CORRUPTED_OAK_LEAVES.getDefaultState());
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
	    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return Blocks.LOG.getDefaultState().getMapColor(worldIn, pos);
	    }
	    
	    @Override
	    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	    {
	        items.add(new ItemStack(this));
	    }
	    
	    @Override
	    public IBlockState getStateFromMeta(int meta)
	    {
	        IBlockState state = this.getDefaultState();

	        switch (meta & 12)
	        {
	            case 0:
	                state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
	                break;
	            case 4:
	                state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
	                break;
	            case 8:
	                state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
	                break;
	            default:
	                state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
	        }

	        return state;
	    }
	    
	    @Override
	    @SuppressWarnings("incomplete-switch")
	    public int getMetaFromState(IBlockState state)
	    {
	        int meta = 0;

	        switch (state.getValue(LOG_AXIS))
	        {
	            case X:
	                meta |= 4;
	                break;
	            case Z:
	                meta |= 8;
	                break;
	            case NONE:
	                meta |= 12;
	        }

	        return meta;
	    }
	    
	    @Override
	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LOG_AXIS});
	    }
	    
	    @Override
	    protected ItemStack getSilkTouchDrop(IBlockState state)
	    {
	        return new ItemStack(Item.getItemFromBlock(this), 1);
	    }
	    
	    @Override
	    public int damageDropped(IBlockState state)
	    {
	        return 0;
	    }
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

	}

}
