package com.formas1.ruispantry.world;

import java.util.ArrayList;
import java.util.Random;

import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.world.corruptionbiome.BiomeCorruption;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModWorldGen implements IWorldGenerator
{
	private WorldGenTreesFormas FORMAS = new WorldGenTreesFormas(false);
	private WorldGenTreesGam GAM = new WorldGenTreesGam(false);
	private WorldGenTreesMilkshake MILKSHAKE = new WorldGenTreesMilkshake(false);
	private WorldGenTreesCorruptedOak CORRUPTED = new WorldGenTreesCorruptedOak(false);
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider)
	{
		if(world.provider.getDimension() == 0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			if(world.getBiomeForCoordsBody(new BlockPos(chunkX * 16, 70, chunkZ * 16)) instanceof BiomePlains)
			{
				populate(FORMAS, world, random, chunkX, chunkZ, 2);
				populate(GAM, world, random, chunkX, chunkZ, 2);
				populate(MILKSHAKE, world, random, chunkX, chunkZ, 2);
			}
			if(world.getBiomeForCoordsBody(new BlockPos(chunkX * 16, 70, chunkZ * 16)) instanceof BiomeCorruption)
			{
				populate(CORRUPTED, world, random, chunkX, chunkZ, 2);
			}
		}
		
		else if(world.provider.getDimension() == -1)
        {
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
		
		else if(world.provider.getDimension() == 1)
        {
            generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
		
		else if(world.provider.getDimension() == 300)
        {
            generateCorruptionDim(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
            populate(CORRUPTED, world, random, chunkX, chunkZ, 2);
        }


	}	
	
	private void populate(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int amountPerChunk) {
		for(int i = 0; i < amountPerChunk; i++) {
			int x = chunkX * 16 + random.nextInt(15) + 8;
			int z = chunkZ * 16 + random.nextInt(15) + 8;
			int y = world.getChunkFromChunkCoords(x >> 4, z >> 4).getHeight(new BlockPos(x & 15, 0, z & 15)) - 1;
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.FORMAS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 3, 15);
		generateOre(ModBlocks.MILKSHAKE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 3, 15);
		generateOre(ModBlocks.GAM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 3, 15);
		
		if(world.getBiomeForCoordsBody(new BlockPos(chunkX * 16, 70, chunkZ * 16)) instanceof BiomeCorruption)
		{
			 generateCorruption(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider)
	{
		generateReplaceBlockOre(ModBlocks.SPINEL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(6) + 2, 10, Blocks.NETHERRACK);
	}
	
	private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider)
	{
		generateReplaceBlockOre(ModBlocks.ENDER_ASURITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(3) + 2, 10, Blocks.END_STONE);
	}
	
	private void generateCorruptionDim(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider)
	{
		generateReplaceBlockOre(ModBlocks.SPINEL_BLOCK_OFF.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 256, random.nextInt(5) + 3, 15, ModBlocks.CORRUPTED_COBBLESTONE);
	}
	
	private void generateCorruption(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider)
	{
		generateReplaceBlockOre(ModBlocks.SPINEL_BLOCK_OFF.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 11, 100, random.nextInt(5) + 3, 15, Blocks.STONE);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable oregenerator = new WorldGenMinable(ore, size);
			oregenerator.generate(world, random, pos);
		}
	}
	
	private void generateReplaceBlockOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block block)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable oregenerator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(block));
			oregenerator.generate(world, random, pos);
		}
	}

}
