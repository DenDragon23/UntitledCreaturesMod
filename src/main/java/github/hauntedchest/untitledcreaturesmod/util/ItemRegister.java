package github.hauntedchest.untitledcreaturesmod.util;

import github.hauntedchest.untitledcreaturesmod.UntitledCreaturesMod;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UntitledCreaturesMod.MOD_ID);
}
