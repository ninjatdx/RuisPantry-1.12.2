package com.formas1.ruispantry.blocks;

import java.util.Random;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.init.ModItems;
import com.formas1.ruispantry.util.IHasModel;
import com.formas1.ruispantry.world.WorldGenTreesCorruptedOak;
import com.formas1.ruispantry.world.WorldGenTreesFormas;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class CorruptedOakSaplingBlock extends BlockBush implements IGrowable, IHasModel
{
	 public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
	 protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
	
	public CorruptedOakSaplingBlock(String name)
	{

		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.RUISPANTRYTAB);
		setHardness(0.0F);
        setSoundType(SoundType.PLANT);
        this.setTickRandomly(true);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		 IBlockState soil = worldIn.getBlockState(pos.down());
	        return super.canPlaceBlockAt(worldIn, pos) && soil == ModBlocks.CORRUPTED_GRASS.getDefaultState() || soil == ModBlocks.CORRUPTED_DIRT.getDefaultState();
	}
	
	@Override
	  protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == ModBlocks.CORRUPTED_GRASS || state.getBlock() == ModBlocks.CORRUPTED_DIRT;
    }
	
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return SAPLING_AABB;
    }
    
    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
            {
                grow(worldIn, rand, pos, state);
            }
        }
        
			
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
    
    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!TerrainGen.saplingGrowTree(worldIn, rand, pos)) return;
        WorldGenerator worldgenerator = new WorldGenTreesCorruptedOak(true);

        worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 4);
        worldgenerator.generate(worldIn, rand, pos);
    }
    
    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        if (state.getValue(STAGE).intValue() == 0)
        {
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        }
        else
        {
            generateTree(worldIn, pos, state, rand);
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
    }
    
    @Override
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | state.getValue(STAGE).intValue() << 3;
        return i;
    }
    
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {STAGE});
    }

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
