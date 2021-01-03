package com.formas1.ruispantry.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EffectFoodBase extends FoodBase
{

	PotionEffect effect;
	
	public EffectFoodBase(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect)
	{
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
		
		this.effect = effect;

	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if(!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}

}
