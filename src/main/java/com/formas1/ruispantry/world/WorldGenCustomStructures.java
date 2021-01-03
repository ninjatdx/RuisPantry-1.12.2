package com.formas1.ruispantry.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.world.corruptionbiome.BiomeCorruption;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeHell;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomStructures implements IWorldGenerator
{
	public static final WorldGenStructure NETHER_WARP = new WorldGenStructure("nether_warp");
	public static final WorldGenStructure SPINEL_CLUSTER = new WorldGenStructure("spinel_cluster");
	public static final WorldGenStructure NETHER_QUARTZ_PYRAMID = new WorldGenStructure("nether_quartz_pyramid");
	//public static final WorldGenStructure CORRUPTED_DUNGEON = new WorldGenStructure("corrupted_dungeon");
	public static final WorldGenStructure CORRUPTED_TEMPLE = new WorldGenStructure("corrupted_temple");

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		 switch (world.provider.getDimension())
		 {
		case 1:
			
			
			break;
			
		case 0:
			
			generateStructure(NETHER_WARP, world, random, chunkX, chunkZ, 1000, Blocks.GRASS, BiomePlains.class);
			generateStructure(SPINEL_CLUSTER, world, random, chunkX, chunkZ, 2000, Blocks.GRASS, BiomePlains.class);
			generateStructure(CORRUPTED_TEMPLE, world, random, chunkX, chunkZ, 100, ModBlocks.CORRUPTED_GRASS, BiomeCorruption.class);
			
			break;
			
		case -1:
			
			generateStructureNether(NETHER_QUARTZ_PYRAMID, world, random, chunkX, chunkZ, 2000, Blocks.NETHERRACK, BiomeHell.class);
			
			break;
			
		case 300:
			
			//generateStructure(CORRUPTED_TEMPLE, world, random, chunkX, chunkZ, 550, ModBlocks.CORRUPTED_COBBLESTONE, BiomeCorruption.class);
			//generateStructure(CORRUPTED_DUNGEON, world, random, chunkX, chunkZ, 500, ModBlocks.CORRUPTED_COBBLESTONE, BiomeCorruption.class);
			
			break;
		}
	}
	
	private void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>...classes)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + random.nextInt(15) + 8;
		int z = (chunkZ * 16) + random.nextInt(15) + 8;
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType()!= WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		}
		
	}
	
	private void generateStructureNether(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>...classes)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + random.nextInt(15) + 8;
		int z = (chunkZ * 16) + random.nextInt(15) + 8;
		int y = calculateGenerationHeight(world, x, z, topBlock) - 50;
		BlockPos pos = new BlockPos(x, y, z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType()!= WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		}
		
	}

	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock)
	{
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		return y;
	}
}
