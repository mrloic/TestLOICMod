package net.mrloic.loicmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrloic.loicmod.LoicMod;
import net.mrloic.loicmod.utils.ModItemGroups;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LoicMod.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> LOIC = ITEMS.register("loic",
            ()-> new Item(new Item.Properties().tab(ModItemGroups.LOIC_ITEMS_TAB)));

    public static final RegistryObject<Item> RAW_LOIC = ITEMS.register("raw_loic",
            ()-> new Item(new Item.Properties().tab(ModItemGroups.LOIC_ITEMS_TAB)));
}
