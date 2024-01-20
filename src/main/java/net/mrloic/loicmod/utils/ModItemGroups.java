package net.mrloic.loicmod.utils;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.RegistryObject;

public class ModItemGroups
{
    private static CreativeModeTab createTab(String label, RegistryObject iconItem)
    {
        return new CreativeModeTab(label)
        {
            @Override
            public ItemStack makeIcon()
            {
                return new ItemStack((ItemLike) iconItem.get());
            }
        };
    }
    public static final CreativeModeTab LOIC_ITEMS_TAB = createTab("loic_items_tab", ModItems.LOIC);
}
