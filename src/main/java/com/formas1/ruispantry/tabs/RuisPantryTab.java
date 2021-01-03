package com.formas1.ruispantry.tabs;

import com.formas1.ruispantry.init.FluidInit;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;

public class RuisPantryTab extends CreativeTabs
{
	public RuisPantryTab(String label) 
	{
		super("ruispantrytab");
		//this.setBackgroundImageName("ruispantry.png");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.STRAWBERRY);
	}
	
	@Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items) {
        super.displayAllRelevantItems(items);
        items.add(FluidUtil.getFilledBucket(new FluidStack(FluidInit.OIL_FLUID, 1)));
    }
}