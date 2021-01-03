package com.formas1.ruispantry.events;

import java.util.Random;

import com.formas1.ruispantry.entity.flines.EntityFlines;
import com.formas1.ruispantry.entity.formas.EntityFormas;
import com.formas1.ruispantry.entity.gam.EntityGam;
import com.formas1.ruispantry.entity.milkshake.EntityMilkshake;
import com.formas1.ruispantry.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootTableEvent
{
	
@SubscribeEvent
public void customLootTableDrop(LivingDropsEvent event)
{
	Random rand= new Random();
	if(event.getEntityLiving() instanceof EntityFormas)
	{
		if(rand.nextInt(2) == 0)
		{
			event.getEntityLiving().entityDropItem(new ItemStack(ModItems.FORMAS_STICK), 0);
		}
		
		if(rand.nextInt(10) == 0)
		{
			event.getEntityLiving().entityDropItem(new ItemStack(Blocks.DOUBLE_PLANT, 1, 0), 0);
		}
	}
	
	if(event.getEntityLiving() instanceof EntityMilkshake)
	{
		if(rand.nextInt(2) == 0)
		{
			event.getEntityLiving().entityDropItem(new ItemStack(ModItems.MILKSHAKE_STICK), 0);
		}
		
		if(rand.nextInt(10) == 0)
		{
			event.getEntityLiving().entityDropItem(new ItemStack(Blocks.DOUBLE_PLANT, 1, 0), 0);
		}
	}
	
	if(event.getEntityLiving() instanceof EntityGam)
	{
		if(rand.nextInt(2) == 0)
		{
			event.getEntityLiving().entityDropItem(new ItemStack(ModItems.GAM_STICK), 0);
		}
		
		if(rand.nextInt(10) == 0)
		{
			event.getEntityLiving().entityDropItem(new ItemStack(Blocks.DOUBLE_PLANT, 1, 0), 0);
		}
	}
	
	if(event.getEntityLiving() instanceof EntityFlines)
	{
		if(rand.nextInt(2) == 0)
		{
			event.getEntityLiving().entityDropItem(new ItemStack(Items.SPLASH_POTION, 2), 0);
		}
	}

}
}
