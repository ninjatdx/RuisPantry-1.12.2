package com.formas1.ruispantry.init;

import java.util.ArrayList;
import java.util.List;

import com.formas1.ruispantry.Main;
import com.formas1.ruispantry.blocks.BlockBase;
import com.formas1.ruispantry.blocks.BlockDoorBase;
import com.formas1.ruispantry.blocks.BlockStairBase;
import com.formas1.ruispantry.blocks.CorruptedCobblestoneBlock;
import com.formas1.ruispantry.blocks.CorruptedGrassBlock;
import com.formas1.ruispantry.blocks.CorruptedLogBlock;
import com.formas1.ruispantry.blocks.CorruptedOakLeaveBlock;
import com.formas1.ruispantry.blocks.CorruptedOakSaplingBlock;
import com.formas1.ruispantry.blocks.EnderAsuriteOreBlock;
import com.formas1.ruispantry.blocks.FormasLeaveBlock;
import com.formas1.ruispantry.blocks.FormasSaplingBlock;
import com.formas1.ruispantry.blocks.GamLeaveBlock;
import com.formas1.ruispantry.blocks.GamSaplingBlock;
import com.formas1.ruispantry.blocks.LogBlock;
import com.formas1.ruispantry.blocks.MsLeaveBlock;
import com.formas1.ruispantry.blocks.MsSaplingBlock;
import com.formas1.ruispantry.blocks.OreBlock;
import com.formas1.ruispantry.blocks.PlankBlock;
import com.formas1.ruispantry.blocks.SpinelBlock;
import com.formas1.ruispantry.blocks.SpinelOreBlock;
import com.formas1.ruispantry.blocks.corrupted_portal.BlockCorruptedPortal;
import com.formas1.ruispantry.blocks.deep_fryer.DeepFryer;
import com.formas1.ruispantry.blocks.fluids.BlockOilFluid;
import com.formas1.ruispantry.blocks.slab.BlockDoubleSlabBase;
import com.formas1.ruispantry.blocks.slab.BlockHalfSlabBase;
import com.formas1.ruispantry.blocks.uncorruptor.Uncorruptor;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block FORMAS_BLOCK = new OreBlock("formas_block", Material.IRON);
	public static final Block MILKSHAKE_BLOCK = new OreBlock("milkshake_block", Material.IRON);
	public static final Block GAM_BLOCK = new OreBlock("gam_block", Material.IRON);
	
	public static final Block SPINEL_BLOCK = new SpinelBlock("spinel_block", Material.ROCK);
	
	public static final Block SPINEL_BLOCK_OFF = new SpinelBlock("spinel_block_off", Material.ROCK);


	
	//public static final Block DEEP_FRYER = new DeepFryerBlockTest("deep_fryer", Material.IRON);
	
	public static final Block DEEP_FRYER_ON = new DeepFryer("deep_fryer_on", true);
	public static final Block DEEP_FRYER_OFF = new DeepFryer("deep_fryer_off", false).setCreativeTab(Main.RUISPANTRYTAB);
	

	//Ores
	public static final Block FORMAS_ORE = new OreBlock("formas_ore", Material.IRON);
	public static final Block MILKSHAKE_ORE = new OreBlock("milkshake_ore", Material.IRON);
	public static final Block GAM_ORE = new OreBlock("gam_ore", Material.IRON);
	
	public static final Block SPINEL_ORE = new SpinelOreBlock("spinel_ore", Material.ROCK);
	
	public static final Block ENDER_ASURITE_ORE = new EnderAsuriteOreBlock("ender_asurite_ore", Material.ROCK);
	
	//Trees
	public static final Block FORMAS_SAPLING = new FormasSaplingBlock("formas_sapling");
	public static final Block FORMAS_LOG = new LogBlock("formas_log");
	public static final Block FORMAS_LEAVES = new FormasLeaveBlock("formas_leaves");
	public static final Block FORMAS_PLANKS = new PlankBlock("formas_planks", Material.WOOD);
	
	public static final Block FORMAS_STAIRS = new BlockStairBase("formas_stairs", ModBlocks.FORMAS_PLANKS.getDefaultState());
	
	public static final BlockSlab FORMAS_SLAB_DOUBLE = new BlockDoubleSlabBase("formas_slab_double", Material.WOOD, Main.RUISPANTRYTAB, ModBlocks.FORMAS_SLAB_HALF);
	public static final BlockSlab FORMAS_SLAB_HALF = new BlockHalfSlabBase("formas_slab_half", Material.WOOD, Main.RUISPANTRYTAB, ModBlocks.FORMAS_SLAB_HALF, ModBlocks.FORMAS_SLAB_DOUBLE);
	
	public static final Block FORMAS_DOOR = new BlockDoorBase("formas_door", Material.WOOD);
	
	
	
	public static final Block GAM_SAPLING = new GamSaplingBlock("gam_sapling");
	public static final Block GAM_LOG = new LogBlock("gam_log");
	public static final Block GAM_LEAVES = new GamLeaveBlock("gam_leaves");
	public static final Block GAM_PLANKS = new PlankBlock("gam_planks", Material.WOOD);
	
	public static final Block GAM_STAIRS = new BlockStairBase("gam_stairs", ModBlocks.GAM_PLANKS.getDefaultState());
	
	public static final BlockSlab GAM_SLAB_DOUBLE = new BlockDoubleSlabBase("gam_slab_double", Material.WOOD, Main.RUISPANTRYTAB, ModBlocks.GAM_SLAB_HALF);
	public static final BlockSlab GAM_SLAB_HALF = new BlockHalfSlabBase("gam_slab_half", Material.WOOD, Main.RUISPANTRYTAB, ModBlocks.GAM_SLAB_HALF, ModBlocks.GAM_SLAB_DOUBLE);
	
	public static final Block GAM_DOOR = new BlockDoorBase("gam_door", Material.WOOD);
	
	
	
	public static final Block MILKSHAKE_SAPLING = new MsSaplingBlock("milkshake_sapling");
	public static final Block MILKSHAKE_LOG = new LogBlock("milkshake_log");
	public static final Block MILKSHAKE_LEAVES = new MsLeaveBlock("milkshake_leaves");
	public static final Block MILKSHAKE_PLANKS = new PlankBlock("milkshake_planks", Material.WOOD);
	
	public static final Block MILKSHAKE_STAIRS = new BlockStairBase("milkshake_stairs", ModBlocks.MILKSHAKE_PLANKS.getDefaultState());
	
	public static final BlockSlab MILKSHAKE_SLAB_DOUBLE = new BlockDoubleSlabBase("milkshake_slab_double", Material.WOOD, Main.RUISPANTRYTAB, ModBlocks.MILKSHAKE_SLAB_HALF);
	public static final BlockSlab MILKSHAKE_SLAB_HALF = new BlockHalfSlabBase("milkshake_slab_half", Material.WOOD, Main.RUISPANTRYTAB, ModBlocks.MILKSHAKE_SLAB_HALF, ModBlocks.MILKSHAKE_SLAB_DOUBLE);
	
	public static final Block MILKSHAKE_DOOR = new BlockDoorBase("milkshake_door", Material.WOOD);
	
	public static final Block CORRUPTED_DIRT = new CorruptedGrassBlock("corrupted_dirt", Material.GRASS);
	public static final Block CORRUPTED_GRASS = new CorruptedGrassBlock("corrupted_grass", Material.GRASS);
	
	public static final Block CORRUPTED_OAK_SAPLING = new CorruptedOakSaplingBlock("corrupted_oak_sapling");
	public static final Block CORRUPTED_OAK_LOG = new CorruptedLogBlock("corrupted_oak_log");
	public static final Block CORRUPTED_OAK_LEAVES = new CorruptedOakLeaveBlock("corrupted_oak_leaves");
	
	public static final Block CORRUPTED_OAK_PLANKS = new PlankBlock("corrupted_oak_planks", Material.WOOD);
	
	public static final Block CORRUPTED_OAK_STAIRS = new BlockStairBase("corrupted_oak_stairs", ModBlocks.CORRUPTED_OAK_PLANKS.getDefaultState());
	
	public static final BlockSlab CORRUPTED_OAK_SLAB_DOUBLE = new BlockDoubleSlabBase("corrupted_oak_slab_double", Material.WOOD, Main.RUISPANTRYTAB, ModBlocks.CORRUPTED_OAK_SLAB_HALF);
	public static final BlockSlab CORRUPTED_OAK_SLAB_HALF = new BlockHalfSlabBase("corrupted_oak_slab_half", Material.WOOD, Main.RUISPANTRYTAB, ModBlocks.CORRUPTED_OAK_SLAB_HALF, ModBlocks.CORRUPTED_OAK_SLAB_DOUBLE);
	
	public static final Block CORRUPTED_OAK_DOOR = new BlockDoorBase("corrupted_oak_door", Material.WOOD);
	
	public static final Block CORRUPTED_COBBLESTONE = new CorruptedCobblestoneBlock("corrupted_cobblestone", Material.ROCK);
	public static final Block CORRUPTED_MOSSY_COBBLESTONE = new CorruptedCobblestoneBlock("corrupted_mossy_cobblestone", Material.ROCK);
	
	public static final Block UNCORRUPTOR = new Uncorruptor("uncorruptor", Material.IRON);
	
	//public static final Block CORRUPTION_WARP = new BlockBase("corrupted_warp", Material.PORTAL);
	
	public static final BlockCorruptedPortal CORRUPTED_PORTAL = new BlockCorruptedPortal("corrupted_portal");
	
	//Fluids
	public static final Block OIL = new BlockOilFluid("oil", FluidInit.OIL_FLUID, Material.WATER);

	
	//Tests
	
}
