package com.formas1.ruispantry.items.armor;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModItems;
import com.formas1.ruispantry.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorBaseEffect extends ItemArmor implements IHasModel
{

	public ArmorBaseEffect(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.RUISPANTRYTAB);		
		ModItems.ITEMS.add(this);

	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 40, 0, false, true));
		player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 40, 0, false, true));
	}
	
}
