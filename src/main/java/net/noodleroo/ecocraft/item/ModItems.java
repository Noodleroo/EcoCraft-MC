package net.noodleroo.ecocraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.noodleroo.ecocraft.EcoCraft;



public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EcoCraft.MOD_ID);

    public static final RegistryObject<Item> CCOIN = ITEMS.register("ccoin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ICOIN = ITEMS.register("icoin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GCOIN = ITEMS.register("gcoin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DCOIN = ITEMS.register("dcoin",
            () -> new Item(new Item.Properties()));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
