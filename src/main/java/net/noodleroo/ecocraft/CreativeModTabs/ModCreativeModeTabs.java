package net.noodleroo.ecocraft.CreativeModTabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.noodleroo.ecocraft.EcoCraft;
import net.noodleroo.ecocraft.item.ModItems;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EcoCraft.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ECOCRAFT = CREATIVE_MODE_TABS.register("ecocraft",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CCOIN.get()))
                    .title(Component.translatable("creativetab.ecocraft.ecocraft_items"))
                    .displayItems((itemDisplayPerameters, output) -> {
                        output.accept(ModItems.CCOIN.get());
                        output.accept(ModItems.ICOIN.get());
                        output.accept(ModItems.GCOIN.get());
                        output.accept(ModItems.DCOIN.get());



                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
