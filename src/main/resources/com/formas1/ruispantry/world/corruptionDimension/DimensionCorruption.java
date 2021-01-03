package com.formas1.ruispantry.world.corruptionDimension;

import com.formas1.ruispantry.init.DimensionInit;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionCorruption extends WorldProvider
{
	@Override
	protected void init() 
	{
		this.biomeProvider = new BiomeProviderCustom(this.world.getSeed()); 
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.CORRUPTION;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new CorruptionGen(this.world, true, this.world.getSeed(), this.world.getSpawnPoint());
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
	
	@Override
	public boolean shouldMapSpin(String entity, double x, double z, double rotation) 
	{
		return true;
	}
	
	@Override
	public double getMovementFactor() 
	{
		return 32.0d;
	}
	
	@Override
	protected void generateLightBrightnessTable() 
	{
		float f = 0.5f;
		for(int i = 0; i<=15; i++)
		{
			float f1 = 1.0f - (float)i/15.0f;
			this.lightBrightnessTable[i] = (1.0f-f1)/(f1*3.0f+1.0f)*(1.0f-f) + f;
		}
	}
}