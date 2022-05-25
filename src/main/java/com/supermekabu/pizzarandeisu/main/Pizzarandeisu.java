package com.supermekabu.pizzarandeisu.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;

@Mod("pizzarandeisu")
public class Pizzarandeisu {
    public static final String ModId = "pizzarandeisu";

    public static final CreativeModeTab PizzarandeisuTab = new PizzarandeisuTab();

    public static String toRegistryName(String name) {
        return String.format("pizzarandeisu_%s", name);
    }

}
