package com.formas1.ruispantry.blocks.slab;

import java.util.Random;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockDoubleSlabBase extends BlockSlabBase implements IHasModel{

	public BlockDoubleSlabBase(String name, Material material, CreativeTabs tab, BlockSlab half)
	{
		super(name, material, half);
		setCreativeTab(tab);
	}
	
	@Override
	public boolean isDouble()
	{
		return true;
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if (this == ModBlocks.FORMAS_SLAB_DOUBLE)
        {
            return Item.getItemFromBlock(ModBlocks.FORMAS_SLAB_HALF);
        }
        else if (this == ModBlocks.GAM_SLAB_DOUBLE)
        {
            return Item.getItemFromBlock(ModBlocks.GAM_SLAB_HALF);
        }
        else if (this == ModBlocks.MILKSHAKE_SLAB_DOUBLE)
        {
            return Item.getItemFromBlock(ModBlocks.MILKSHAKE_SLAB_HALF);
        }
        else if (this == ModBlocks.CORRUPTED_OAK_SLAB_DOUBLE)
        {
            return Item.getItemFromBlock(ModBlocks.CORRUPTED_OAK_SLAB_HALF);
        }
        else
        {
            return null;
        }
    }
}
