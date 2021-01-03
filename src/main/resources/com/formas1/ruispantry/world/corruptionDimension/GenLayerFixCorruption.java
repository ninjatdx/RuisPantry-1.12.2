package com.formas1.ruispantry.world.corruptionDimension;

import com.formas1.ruispantry.world.corruptionbiome.GenLayerCorruption;
import com.formas1.ruispantry.world.corruptionbiome.GenLayerCorruption;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class GenLayerFixCorruption 
{
	public static GenLayer[] createWorld(long seed)
	{
		GenLayer biomes = new GenLayerCorruption(1l);
		biomes = new GenLayerZoom(1000l, biomes);
		biomes = new GenLayerZoom(1001l, biomes);
		biomes = new GenLayerZoom(1002l, biomes);
		biomes = new GenLayerZoom(1003l, biomes);
		biomes = new GenLayerZoom(1004l, biomes);
		biomes = new GenLayerZoom(1005l, biomes);
		GenLayer genLayerVoronoiZoom = new GenLayerVoronoiZoom(10l, biomes);
		biomes.initWorldGenSeed(seed);
		return new GenLayer[] {biomes, genLayerVoronoiZoom};
	}
}