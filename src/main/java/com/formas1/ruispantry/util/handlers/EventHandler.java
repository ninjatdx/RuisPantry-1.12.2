package com.formas1.ruispantry.util.handlers;

import com.formas1.ruispantry.events.LootTableEvent;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class EventHandler
{
	public static void registerEvents()
	{
		LootTableEvent lootevent = new LootTableEvent();
		
		MinecraftForge.EVENT_BUS.register(lootevent);
	}
}
