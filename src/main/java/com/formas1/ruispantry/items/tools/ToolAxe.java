package com.formas1.ruispantry.items.tools;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.init.ModItems;
import com.formas1.ruispantry.util.IHasModel;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{

public ToolAxe(String name, ToolMaterial material)
{
	super(material, 9.0F, -3.2F);
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
}
