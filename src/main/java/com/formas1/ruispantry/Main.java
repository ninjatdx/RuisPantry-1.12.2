package com.formas1.ruispantry;

import java.util.Random;

import com.formas1.ruispantry.events.LootTableEvent;
import com.formas1.ruispantry.init.ModRecipes;
import com.formas1.ruispantry.proxy.CommonProxy;
import com.formas1.ruispantry.tabs.RuisPantryTab;
import com.formas1.ruispantry.util.Reference;
import com.formas1.ruispantry.util.handlers.LootTableHandler;
import com.formas1.ruispantry.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs RUISPANTRYTAB = new RuisPantryTab("ruispantrytab");

	public static final int CORRUPTION =300;
	
	static
	{
		FluidRegistry.enableUniversalBucket();
	}
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries(event);
		LootTableEvent lootevent = new LootTableEvent();
		LootTableHandler loothandler = new LootTableHandler();
		MinecraftForge.EVENT_BUS.register(lootevent);
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries(event);
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		RegistryHandler.postInitRegistries(event);
	}
	
	@EventHandler
	public static void ServerInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}
