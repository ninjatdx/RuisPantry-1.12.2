package com.formas1.ruispantry.entity.formas;

import com.formas1.ruispantry.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFormas extends RenderLiving<EntityFormas>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entities/formas/formas.png");
			
			public RenderFormas(RenderManager manager)
			{
			super(manager, new ModelFormas(), NAME_TAG_RANGE);
		
			}
			
			@Override
			protected ResourceLocation getEntityTexture(EntityFormas entity)
			{
				return TEXTURE;
			}
			
			
}
