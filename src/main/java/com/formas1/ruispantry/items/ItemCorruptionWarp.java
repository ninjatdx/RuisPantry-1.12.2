package com.formas1.ruispantry.items;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.init.ModItems;
import com.formas1.ruispantry.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemCorruptionWarp extends Item implements IHasModel
{

	public ItemCorruptionWarp(String name)
	{
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
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		int x = pos.getX(), y = pos.getY(), z = pos.getZ();
		int side = facing.getIndex();
		
		switch(side) {
		case 0:
		default:
			y--;
			break;
		case 1:
			y++;
			break;
		case 2:
			z--;
			break;
		case 3:
			z++;
			break;
		case 4:
			x--;
			break;
		case 5:
			x++;
			break;
		}
		
		if(!player.canPlayerEdit(new BlockPos(x, y, z), facing, player.getHeldItem(hand))) {
			return EnumActionResult.FAIL;
		}
		
		IBlockState location = worldIn.getBlockState(new BlockPos(x, y, z));
		if(location == Blocks.AIR.getDefaultState()) {
			ModBlocks.CORRUPTED_PORTAL.trySpawnPortal(worldIn, new BlockPos(x, y, z));
		}
		player.getHeldItem(hand).shrink(1);
		return EnumActionResult.SUCCESS;
	}
}
