package com.formas1.ruispantry.util.handlers;


import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.commands.teleportdimension.CommandTeleportDim;
import com.formas1.ruispantry.init.BiomeInit;
import com.formas1.ruispantry.init.DimensionInit;
import com.formas1.ruispantry.init.EntityInit;
import com.formas1.ruispantry.init.FluidInit;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.init.ModItems;
import com.formas1.ruispantry.util.IHasModel;
import com.formas1.ruispantry.world.ModWorldGen;
import com.formas1.ruispantry.world.WorldGenCustomStructures;
import com.formas1.ruispantry.world.WorldGenTreesFormas;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.ForgeRegistry;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		RenderHandler.registerCustomMeshesAndStates();
		BiomeInit.registerBiomes();
		RenderHandler.registerEntityRenders();
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		FluidInit.RegisterFluids();
		DimensionInit.registerDimensions();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		
		EntityInit.registerEntities();
	}

	public static void postInitRegistries(FMLPostInitializationEvent event)
	{
	
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandTeleportDim());
	}

	
}
