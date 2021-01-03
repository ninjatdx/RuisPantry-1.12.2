package com.formas1.ruispantry.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DoubleEffectFoodBase extends FoodBase
{

	PotionEffect effect;
	PotionEffect effect2;
	
	public DoubleEffectFoodBase(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect, PotionEffect effect2)
	{
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
		
		this.effect = effect;
		this.effect2 = effect2;

	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if(!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
			player.addPotionEffect(new PotionEffect(effect2.getPotion(), effect2.getDuration(), effect2.getAmplifier(), effect2.getIsAmbient(), effect2.doesShowParticles()));
		}
	}
	
	//@SideOnly(Side.CLIENT)
	//public boolean hasEffect(ItemStack stack)
	//{
		//return true;
	//}

}
