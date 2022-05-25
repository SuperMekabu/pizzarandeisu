package com.supermekabu.pizzarandeisu.registry;

import com.supermekabu.pizzarandeisu.item.Pulgogi;
import com.supermekabu.pizzarandeisu.item.PulledPork;
import com.supermekabu.pizzarandeisu.item.TeriyakiChicken;
import com.supermekabu.pizzarandeisu.main.Pizzarandeisu;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Pizzarandeisu.ModId)
public class PizzarandeisuItems {

    public static final PulledPork pulledPork = new PulledPork();
    public static final Pulgogi pulgogi = new Pulgogi();
    public static final TeriyakiChicken teriyakiChicken = new TeriyakiChicken();

    @Mod.EventBusSubscriber(modid = Pizzarandeisu.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            final Item[] items = {
                    pulledPork,
                    pulgogi,
                    teriyakiChicken
            };
            event.getRegistry().registerAll(items);
        }
    }
}
