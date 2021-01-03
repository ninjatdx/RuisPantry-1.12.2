package com.formas1.ruispantry.blocks.slab;

import java.util.Random;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.init.ModItems;
import com.formas1.ruispantry.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPurpurSlab.Variant;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockSlabBase extends BlockSlab implements IHasModel
{
	Block half;
	public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant", Variant.class);
	
	public BlockSlabBase(String name, Material material, BlockSlab half)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.RUISPANTRYTAB);
		setHarvestLevel("axe", 4);
		setHardness(5.0F);
		
		this.useNeighborBrightness = !this.isDouble();
		
		IBlockState state = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
		if(!this.isDouble()) state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		this.half = half;

		ModBlocks.BLOCKS.add(this);
	}
	
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(half);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState state = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
		
		if(!this.isDouble() && state.getValue(HALF) == EnumBlockHalf.TOP) meta |= 8;
			return state;
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		int meta = 0;
		if(!this.isDouble() && state.getValue(HALF) == EnumBlockHalf.TOP) meta |=8;
		return meta;
	}
	@Override
	protected BlockStateContainer createBlockState()
	{
		if(!this.isDouble()) return new BlockStateContainer(this, new IProperty[] {VARIANT, HALF});
		else return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getUnlocalizedName(int meta)
	{
	return super.getUnlocalizedName();
	}
	
	@Override
	public IProperty<?> getVariantProperty()
	{
		return VARIANT;
	}
	
	@Override
	public Comparable<?> getTypeForItem(ItemStack stack)
	{
		return Variant.DEFAULT;
	}
	
	public static enum Variant implements IStringSerializable
	{
		DEFAULT;

		@Override
		public String getName()
		{
			return "default";
		}
		
	}
	
}
