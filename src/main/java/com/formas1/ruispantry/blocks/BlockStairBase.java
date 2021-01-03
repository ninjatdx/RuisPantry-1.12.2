package com.formas1.ruispantry.blocks;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.init.ModItems;
import com.formas1.ruispantry.util.IHasModel;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockStairBase extends BlockStairs implements IHasModel
{

	public BlockStairBase(String name, IBlockState modelState)
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.RUISPANTRYTAB);
		setHardness(5.0F);
		setResistance(15.0F);
		setSoundType(SoundType.WOOD);
		setHarvestLevel("axe", 4);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
