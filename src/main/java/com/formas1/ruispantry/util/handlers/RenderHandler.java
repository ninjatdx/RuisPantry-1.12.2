package com.formas1.ruispantry.util.handlers;

import com.formas1.ruispantry.entity.flines.EntityFlines;
import com.formas1.ruispantry.entity.flines.RenderFlines;
import com.formas1.ruispantry.entity.formas.EntityFormas;
import com.formas1.ruispantry.entity.formas.RenderFormas;
import com.formas1.ruispantry.entity.gam.EntityGam;
import com.formas1.ruispantry.entity.gam.RenderGam;
import com.formas1.ruispantry.entity.milkshake.EntityMilkshake;
import com.formas1.ruispantry.entity.milkshake.RenderMilkshake;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.util.Reference;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
	public static void registerCustomMeshesAndStates()
	{
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(ModBlocks.OIL), new ItemMeshDefinition()
		{

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack)
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":oil", "fluid");
			
			}
			
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.OIL, new StateMapperBase()
				{

					@Override
					protected ModelResourceLocation getModelResourceLocation(IBlockState state)
					{
						return new ModelResourceLocation(Reference.MOD_ID + ":oil", "fluid");
					}
			
				});
	}
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityFormas.class, new IRenderFactory<EntityFormas>()
		{
			@Override
			public Render<? super EntityFormas> createRenderFor(RenderManager manager) 
			{
				return new RenderFormas(manager);		
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMilkshake.class, new IRenderFactory<EntityMilkshake>()
		{
			@Override
			public Render<? super EntityMilkshake> createRenderFor(RenderManager manager) 
			{
				return new RenderMilkshake(manager);		
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGam.class, new IRenderFactory<EntityGam>()
		{
			@Override
			public Render<? super EntityGam> createRenderFor(RenderManager manager) 
			{
				return new RenderGam(manager);		
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFlines.class, new IRenderFactory<EntityFlines>()
		{
			@Override
			public Render<? super EntityFlines> createRenderFor(RenderManager manager) 
			{
				return new RenderFlines(manager);		
			}
		});
	}
}
