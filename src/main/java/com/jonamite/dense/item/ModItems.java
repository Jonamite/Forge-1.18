package com.jonamite.dense.item;

import com.jonamite.dense.Dense;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Dense.MOD_ID);

    public static final RegistryObject<Item> CHAPSTICK = ITEMS.register("chapstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DENSE_TAB)));

    public static final RegistryObject<Item> WOOD_CHAPSTICK = ITEMS.register("wood_chapstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DENSE_TAB)));

    public static final RegistryObject<Item> GLASS_CHAPSTICK = ITEMS.register("glass_chapstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DENSE_TAB)));

    public static final RegistryObject<Item> IRON_CHAPSTICK = ITEMS.register("iron_chapstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DENSE_TAB)));

    public static final RegistryObject<Item> GOLD_CHAPSTICK = ITEMS.register("gold_chapstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DENSE_TAB)));

    public static final RegistryObject<Item> DIAMOND_CHAPSTICK = ITEMS.register("diamond_chapstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DENSE_TAB)));

    public static final RegistryObject<Item> EMERALD_CHAPSTICK = ITEMS.register("emerald_chapstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DENSE_TAB)));

    public static final RegistryObject<Item> NETHERITE_CHAPSTICK = ITEMS.register("netherite_chapstick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DENSE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
