package com.formas1.ruispantry.util.handlers;

import com.formas1.ruispantry.blocks.deep_fryer.ContainerDeepFryer;
import com.formas1.ruispantry.blocks.deep_fryer.GuiDeepFryer;
import com.formas1.ruispantry.blocks.deep_fryer.TileEntityDeepFryer;
import com.formas1.ruispantry.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_DEEP_FRYER)
		{
			return new ContainerDeepFryer(player.inventory, (TileEntityDeepFryer)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_DEEP_FRYER)
		{
			return new GuiDeepFryer(player.inventory, (TileEntityDeepFryer)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
