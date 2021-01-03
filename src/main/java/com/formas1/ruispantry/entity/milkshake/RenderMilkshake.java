package com.formas1.ruispantry.entity.milkshake;

import com.formas1.ruispantry.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMilkshake extends RenderLiving<EntityMilkshake>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entities/milkshake/milkshake.png");
			
			public RenderMilkshake(RenderManager manager)
			{
			super(manager, new ModelMilkshake(), NAME_TAG_RANGE);
		
			}
			
			@Override
			protected ResourceLocation getEntityTexture(EntityMilkshake entity)
			{
				return TEXTURE;
			}
			
			
}
