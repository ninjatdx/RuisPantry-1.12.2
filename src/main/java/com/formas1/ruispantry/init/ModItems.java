package com.formas1.ruispantry.init;

import java.util.ArrayList;
import java.util.List;

import com.formas1.ruispantry.items.HasEffectItemBase;
import com.formas1.ruispantry.items.HmmItem;
import com.formas1.ruispantry.items.ItemBase;
import com.formas1.ruispantry.items.ItemCorruptionWarp;
import com.formas1.ruispantry.items.armor.ArmorBase;
import com.formas1.ruispantry.items.armor.ArmorBaseEffect;
import com.formas1.ruispantry.items.food.DoubleEffectFoodBase;
import com.formas1.ruispantry.items.food.EffectFoodBase;
import com.formas1.ruispantry.items.tools.ToolAxe;
import com.formas1.ruispantry.items.tools.ToolBow;
import com.formas1.ruispantry.items.tools.ToolHoe;
import com.formas1.ruispantry.items.tools.ToolPickaxe;
import com.formas1.ruispantry.items.tools.ToolSpade;
import com.formas1.ruispantry.items.tools.ToolSword;
import com.formas1.ruispantry.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Tool Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 4, 40, 15.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_FORMAS = EnumHelper.addToolMaterial("material_formas", 5, 2000, 16.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_GAM = EnumHelper.addToolMaterial("material_gam", 5, 2000, 15.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_MILKSHAKE = EnumHelper.addToolMaterial("material_milkshake", 5, 2000, 15.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_NETHERRACK = EnumHelper.addToolMaterial("material_netherrack", 6, 10, 15.0F, 3.0F, 10);
	//Armor Material
	public static final ArmorMaterial ARMOR_MATERIAL_FORMAS = EnumHelper.addArmorMaterial("armor_material_formas", Reference.MOD_ID + ":formas", 20,
			new int [] {4, 7, 8, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_GAM = EnumHelper.addArmorMaterial("armor_material_gam", Reference.MOD_ID + ":gam", 20,
			new int [] {3, 8, 7, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_MILKSHAKE = EnumHelper.addArmorMaterial("armor_material_milkshake", Reference.MOD_ID + ":milkshake", 20,
			new int [] {3, 7, 7, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_ENIGMATIC = EnumHelper.addArmorMaterial("armor_material_enigmatic", Reference.MOD_ID + ":enigmatic", 100,
			new int [] {5, 9, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	
	//Items
	public static final Item FORMAS_INGOT = new ItemBase("formas_ingot");
	public static final Item MILKSHAKE_INGOT = new ItemBase("milkshake_ingot");
	public static final Item GAM_INGOT = new ItemBase("gam_ingot");
	
	public static final Item SPINEL = new HasEffectItemBase("spinel");
	
	public static final Item ENDER_ASURITE = new HasEffectItemBase("ender_asurite");
	
	public static final Item FORMAS_STICK = new ItemBase("formas_stick");
	public static final Item GAM_STICK = new ItemBase("gam_stick");
	public static final Item MILKSHAKE_STICK = new ItemBase("milkshake_stick");
	
	public static final Item HMMM = new HmmItem("hmm");
	
	//Tools
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	
	public static final ItemSword NETHERRACK_SWORD = new ToolSword("netherrack_sword", MATERIAL_NETHERRACK);
	public static final ItemPickaxe NETHERRACK_PICKAXE = new ToolPickaxe("netherrack_pickaxe", MATERIAL_NETHERRACK);
	public static final ItemAxe NETHERRACK_AXE = new ToolAxe("netherrack_axe", MATERIAL_NETHERRACK);
	public static final ItemSpade NETHERRACK_SHOVEL = new ToolSpade("netherrack_shovel", MATERIAL_NETHERRACK);
	public static final ItemHoe NETHERRACK_HOE = new ToolHoe("netherrack_hoe", MATERIAL_NETHERRACK);
	
	public static final ItemSword FORMAS_SWORD = new ToolSword("formas_sword", MATERIAL_FORMAS);
	public static final ItemPickaxe FORMAS_PICKAXE = new ToolPickaxe("formas_pickaxe", MATERIAL_FORMAS);
	public static final ItemAxe FORMAS_AXE = new ToolAxe("formas_axe", MATERIAL_FORMAS);
	public static final ItemSpade FORMAS_SHOVEL = new ToolSpade("formas_shovel", MATERIAL_FORMAS);
	public static final ItemHoe FORMAS_HOE = new ToolHoe("formas_hoe", MATERIAL_FORMAS);
	
	public static final ItemBow FORMAS_BOW = new ToolBow("formas_bow");
	
	
	public static final ItemSword GAM_SWORD = new ToolSword("gam_sword", MATERIAL_GAM);
	public static final ItemPickaxe GAM_PICKAXE = new ToolPickaxe("gam_pickaxe", MATERIAL_GAM);
	public static final ItemAxe GAM_AXE = new ToolAxe("gam_axe", MATERIAL_GAM);
	public static final ItemSpade GAM_SHOVEL = new ToolSpade("gam_shovel", MATERIAL_GAM);
	public static final ItemHoe GAM_HOE = new ToolHoe("gam_hoe", MATERIAL_GAM);
	
	public static final ItemBow GAM_BOW = new ToolBow("gam_bow");
	
	
	public static final ItemSword MILKSHAKE_SWORD = new ToolSword("milkshake_sword", MATERIAL_MILKSHAKE);
	public static final ItemPickaxe MILKSHAKE_PICKAXE = new ToolPickaxe("milkshake_pickaxe", MATERIAL_MILKSHAKE);
	public static final ItemAxe MILKSHAKE_AXE = new ToolAxe("milkshake_axe", MATERIAL_MILKSHAKE);
	public static final ItemSpade MILKSHAKE_SHOVEL = new ToolSpade("milkshake_shovel", MATERIAL_MILKSHAKE);
	public static final ItemHoe MILKSHAKE_HOE = new ToolHoe("milkshake_hoe", MATERIAL_MILKSHAKE);
	
	public static final ItemBow MILKSHAKE_BOW = new ToolBow("milkshake_bow");

	//Armor
	public static final Item FORMAS_HELMET = new ArmorBase("formas_helmet", ARMOR_MATERIAL_FORMAS, 1, EntityEquipmentSlot.HEAD);
	public static final Item FORMAS_CHESTPLATE = new ArmorBase("formas_chestplate", ARMOR_MATERIAL_FORMAS, 1, EntityEquipmentSlot.CHEST);
	public static final Item FORMAS_LEGGINS = new ArmorBase("formas_leggins", ARMOR_MATERIAL_FORMAS, 2, EntityEquipmentSlot.LEGS);
	public static final Item FORMAS_BOOTS = new ArmorBase("formas_boots", ARMOR_MATERIAL_FORMAS, 1, EntityEquipmentSlot.FEET);
	
	public static final Item GAM_HELMET = new ArmorBase("gam_helmet", ARMOR_MATERIAL_GAM, 1, EntityEquipmentSlot.HEAD);
	public static final Item GAM_CHESTPLATE = new ArmorBase("gam_chestplate", ARMOR_MATERIAL_GAM, 1, EntityEquipmentSlot.CHEST);
	public static final Item GAM_LEGGINS = new ArmorBase("gam_leggins", ARMOR_MATERIAL_GAM, 2, EntityEquipmentSlot.LEGS);
	public static final Item GAM_BOOTS = new ArmorBase("gam_boots", ARMOR_MATERIAL_GAM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item MILKSHAKE_HELMET = new ArmorBase("milkshake_helmet", ARMOR_MATERIAL_MILKSHAKE, 1, EntityEquipmentSlot.HEAD);
	public static final Item MILKSHAKE_CHESTPLATE = new ArmorBase("milkshake_chestplate", ARMOR_MATERIAL_MILKSHAKE, 1, EntityEquipmentSlot.CHEST);
	public static final Item MILKSHAKE_LEGGINS = new ArmorBase("milkshake_leggins", ARMOR_MATERIAL_MILKSHAKE, 2, EntityEquipmentSlot.LEGS);
	public static final Item MILKSHAKE_BOOTS = new ArmorBase("milkshake_boots", ARMOR_MATERIAL_MILKSHAKE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ENIGMATIC_HELMET = new ArmorBaseEffect("enigmatic_helmet", ARMOR_MATERIAL_ENIGMATIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENIGMATIC_CHESTPLATE = new ArmorBaseEffect("enigmatic_chestplate", ARMOR_MATERIAL_ENIGMATIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENIGMATIC_LEGGINS = new ArmorBaseEffect("enigmatic_leggins", ARMOR_MATERIAL_ENIGMATIC, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENIGMATIC_BOOTS = new ArmorBaseEffect("enigmatic_boots", ARMOR_MATERIAL_ENIGMATIC, 1, EntityEquipmentSlot.FEET);
	
	
	
	public static final Item CORRUPTION_WARP = new ItemCorruptionWarp("corruption_warp");

	//Food
	//public static final Item STRAWBERRY = new FoodBase("strawberry", 4, 6.0F, false);
	public static final Item STRAWBERRY = new EffectFoodBase("strawberry", 4, 6.0F, false, new PotionEffect(MobEffects.HASTE, (60*20), 0, false, true));
	public static final Item CHIP = new DoubleEffectFoodBase("chip", 4, 6.0F, false, new PotionEffect(MobEffects.NAUSEA, (60*20), 0, false, true), new PotionEffect(MobEffects.RESISTANCE, (60*20), 0, false, true));
	public static final Item FRIED_EGG = new DoubleEffectFoodBase("fried_egg", 4, 6.0F, false, new PotionEffect(MobEffects.SATURATION, (60*20), 0, false, true), new PotionEffect(MobEffects.WEAKNESS, (60*20), 0, false, true));
	public static final Item CHICKEN_NUGGETS = new DoubleEffectFoodBase("chicken_nugget", 4, 6.0F, false, new PotionEffect(MobEffects.SPEED, (60*20), 0, false, true), new PotionEffect(MobEffects.GLOWING, (60*20), 0, false, true));
	public static final Item BACON = new DoubleEffectFoodBase("bacon", 4, 6.0F, false, new PotionEffect(MobEffects.SLOWNESS, (60*20), 0, false, true), new PotionEffect(MobEffects.FIRE_RESISTANCE, (60*20), 0, false, true));
	public static final Item CORRUPTED_APPLE = new EffectFoodBase("corrupted_apple", 4, 6.0F, false, new PotionEffect(MobEffects.WITHER, (60*20), 0, false, true));
	

	
}
