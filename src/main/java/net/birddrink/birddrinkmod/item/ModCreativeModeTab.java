package net.birddrink.birddrinkmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ORES_TAB = new CreativeModeTab("orestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAINBONIUM.get());
        }
    };
}
