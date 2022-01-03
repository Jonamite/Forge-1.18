package com.jonamite.dense.item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DENSE_TAB = new CreativeModeTab("densetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHAPSTICK.get());
        }
    };

}