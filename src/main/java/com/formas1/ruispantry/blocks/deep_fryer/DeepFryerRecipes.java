package com.formas1.ruispantry.blocks.deep_fryer;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;
import com.formas1.ruispantry.init.ModBlocks;
import com.formas1.ruispantry.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DeepFryerRecipes
{
	private static final DeepFryerRecipes COOKING_BASE = new DeepFryerRecipes();
	private final Map<ItemStack, ItemStack> cookingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static DeepFryerRecipes instance()
    {
        return COOKING_BASE;
    }
	
	private DeepFryerRecipes()
	{
		this.addCooking(Items.POTATO, new ItemStack(ModItems.CHIP), 10.0f);
		this.addCooking(Items.EGG, new ItemStack(ModItems.FRIED_EGG), 10.0f);
		this.addCooking(Items.CHICKEN, new ItemStack(ModItems.CHICKEN_NUGGETS), 10.0f);
		this.addCooking(Items.PORKCHOP, new ItemStack(ModItems.BACON), 10.0f);
	}
	
	public void addCookingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addCooking(Item.getItemFromBlock(input), stack, experience);
    }
	
	public void addCooking(Item input, ItemStack stack, float experience)
    {
        this.addCookingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }
	
	public void addCookingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getCookingResult(input) != ItemStack.EMPTY) 
        { 
        	net.minecraftforge.fml.common.FMLLog.log.info("Ignored cooking recipe with conflicting input: {} = {}", input, stack); return; 
        }
        this.cookingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }
	
	public ItemStack getCookingResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.cookingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getCookingList()
    {
        return this.cookingList;
    }

    public float getCookingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}