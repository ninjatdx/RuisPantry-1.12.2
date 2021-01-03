package com.formas1.ruispantry.blocks.slab;

import java.util.Random;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModItems;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class BlockHalfSlabBase extends BlockSlabBase
{

	public BlockHalfSlabBase(String name, Material material, CreativeTabs tab, BlockSlab half, BlockSlab doubleslab)
	{
		super(name, material, half);
		setCreativeTab(tab);
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleslab).setRegistryName(name));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean isDouble()
	{
		return false;
	}
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }
}
