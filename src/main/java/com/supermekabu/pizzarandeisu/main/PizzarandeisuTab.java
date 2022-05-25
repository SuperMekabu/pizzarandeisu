package com.supermekabu.pizzarandeisu.main;


import com.supermekabu.pizzarandeisu.registry.PizzarandeisuBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PizzarandeisuTab extends CreativeModeTab {

    public PizzarandeisuTab() {
        super("pizzarandeisu_tab");
    }


    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(PizzarandeisuBlocks.pulgogiPizza);
    }
}
