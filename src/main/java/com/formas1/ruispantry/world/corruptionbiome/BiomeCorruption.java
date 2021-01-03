package com.formas1.ruispantry.world.corruptionbiome;

import java.util.Random;

import com.formas1.ruispantry.entity.flines.EntityFlines;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.world.WorldGenTreesCorruptedOak;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class BiomeCorruption extends Biome
{

	public BiomeCorruption()
	{
		super(new BiomeProperties("Corruption").setBaseHeight(1.2F).setTemperature(2.0F).setHeightVariation(1.2F).setWaterColor(11272192));
		topBlock = ModBlocks.CORRUPTED_GRASS.getDefaultState();
		fillerBlock = ModBlocks.CORRUPTED_DIRT.getDefaultState();
		this.decorator.treesPerChunk = 6;
		this.decorator.extraTreeChance = 0.025f;
		this.modSpawnableLists.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityFlines.class, 100, 2, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPigZombie.class, 100, 2, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWitherSkeleton.class, 100, 2, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityMagmaCube.class, 100, 2, 5));
		Random rand = new Random();
	}
	
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
		return new WorldGenTreesCorruptedOak(false);
	}
	
	@Override
	public int getSkyColorByTemp(float currentTemperature)
	{
		return 11272192;
	}
	


}
