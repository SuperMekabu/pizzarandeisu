package com.supermekabu.pizzarandeisu.registry;

import com.supermekabu.pizzarandeisu.block.Pizza;
import com.supermekabu.pizzarandeisu.block.PulgogiPizza;
import com.supermekabu.pizzarandeisu.block.PulledPorkPizza;
import com.supermekabu.pizzarandeisu.block.TeriyakiChickenPizza;
import com.supermekabu.pizzarandeisu.main.Pizzarandeisu;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Pizzarandeisu.ModId)
public class PizzarandeisuBlocks {

    public static final PulledPorkPizza pulledPorkPizza = new PulledPorkPizza();
    public static final TeriyakiChickenPizza teriyakiChickenPizza = new TeriyakiChickenPizza();
    public static final PulgogiPizza pulgogiPizza = new PulgogiPizza();

    private static BlockItem blockItemOf(Pizza pizza, Integer stackTo) {
        return new BlockItem(pizza, new Item.Properties().tab(Pizzarandeisu.PizzarandeisuTab).stacksTo(stackTo));
    }

    private static BlockItem blockItemOf(Pizza pizza) {
        return new BlockItem(pizza, new Item.Properties().tab(Pizzarandeisu.PizzarandeisuTab).stacksTo(1));
    }

    @Mod.EventBusSubscriber(modid = Pizzarandeisu.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register {
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            final Block[] blocks = {
                    pulledPorkPizza,
                    teriyakiChickenPizza,
                    pulgogiPizza
            };

            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
            final BlockItem[] blockItems = {
                    blockItemOf(pulledPorkPizza),
                    blockItemOf(teriyakiChickenPizza),
                    blockItemOf(pulgogiPizza)
            };

            for (BlockItem item : blockItems) {
                final Block block = item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}
