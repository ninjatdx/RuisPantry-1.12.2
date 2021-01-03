package com.formas1.ruispantry.entity.gam;

import com.formas1.ruispantry.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGam extends RenderLiving<EntityGam>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entities/gam/gam.png");
			
			public RenderGam(RenderManager manager)
			{
			super(manager, new ModelGam(), NAME_TAG_RANGE);
		
			}
			
			@Override
			protected ResourceLocation getEntityTexture(EntityGam entity)
			{
				return TEXTURE;
			}
			
			
}
