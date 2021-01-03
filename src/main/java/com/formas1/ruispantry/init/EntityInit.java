package com.formas1.ruispantry.init;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.entity.flines.EntityFlines;
import com.formas1.ruispantry.entity.formas.EntityFormas;
import com.formas1.ruispantry.entity.gam.EntityGam;
import com.formas1.ruispantry.entity.milkshake.EntityMilkshake;
import com.formas1.ruispantry.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	public static void registerEntities()
	{
		registerEntity("formas", EntityFormas.class, Reference.ENTITY_FORMAS, 50, 16627753, 16717848 );
		registerEntity("milkshake", EntityMilkshake.class, Reference.ENTITY_MILKSHAKE, 50, 16722050, 16759738 );
		registerEntity("gam", EntityGam.class, Reference.ENTITY_GAM, 50, 702539, 46770 );
		registerEntity("flines", EntityFlines.class, Reference.ENTITY_FLINES, 50, 16723859, 44031 );
		
		EntityRegistry.addSpawn(EntityFormas.class, 6, 2, 5, EnumCreatureType.CREATURE, Biomes.HELL);
		EntityRegistry.addSpawn(EntityMilkshake.class, 6, 2, 5, EnumCreatureType.CREATURE, Biomes.HELL);
		EntityRegistry.addSpawn(EntityGam.class, 6, 2, 5, EnumCreatureType.CREATURE, Biomes.HELL);
		EntityRegistry.addSpawn(EntityFlines.class, 6, 1, 2, EnumCreatureType.CREATURE, Biomes.HELL);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	private static void registerNonMobEntity()
	{
		
	}
}
