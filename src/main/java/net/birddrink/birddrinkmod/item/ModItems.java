package net.birddrink.birddrinkmod.item;

import net.birddrink.birddrinkmod.BirddrinkMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BirddrinkMod.MOD_ID);
    public static final RegistryObject<Item> RAINBONIUM = ITEMS.register("rainbonium",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ORES_TAB)));
    public static final RegistryObject<Item> RAW_RAINBONIUM = ITEMS.register("raw_rainbonium",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ORES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));
    }
}
