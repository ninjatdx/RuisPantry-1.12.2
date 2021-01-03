package com.formas1.ruispantry.init;

import com.formas1.ruispantry.world.corruptionbiome.BiomeCorruption;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;


public class BiomeInit
{
	public static final Biome CORRUPTION_BIOME = new BiomeCorruption();
	public static void registerBiomes()
	{
		initBiome(CORRUPTION_BIOME, "corruption_biome", BiomeType.WARM, Type.DEAD, Type.HILLS, Type.RARE);
	}
		private static Biome initBiome(Biome biome, String name, BiomeType bType, Type...types)
		{
			biome.setRegistryName(name);
			ForgeRegistries.BIOMES.register(biome);
			BiomeDictionary.addTypes(biome, types);
			BiomeManager.addBiome(bType, new BiomeEntry(biome, 10));
			BiomeManager.addSpawnBiome(biome);
			return biome;
		}
	
}

