package com.formas1.ruispantry.entity.flines;

import com.formas1.ruispantry.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlines extends RenderLiving<EntityFlines>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entities/flines/flines.png");
			
			public RenderFlines(RenderManager manager)
			{
			super(manager, new ModelFlines(), NAME_TAG_RANGE);
		
			}
			
			@Override
			protected ResourceLocation getEntityTexture(EntityFlines entity)
			{
				return TEXTURE;
			}
			
			
}
