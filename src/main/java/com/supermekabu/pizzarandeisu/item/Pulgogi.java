package com.supermekabu.pizzarandeisu.item;

import com.supermekabu.pizzarandeisu.main.Pizzarandeisu;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Pulgogi extends Item {
    final String ItemName = Pizzarandeisu.toRegistryName("pulgogi");

    public Pulgogi() {
        super(
                new Properties().tab(Pizzarandeisu.PizzarandeisuTab)
                        .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).meat().build())
        );
        this.setRegistryName(this.ItemName);
    }
}
