package com.wanderersoftherift.botr.init;

import com.wanderersoftherift.botr.BuildersOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BotrCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, BuildersOfTheRift.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BOTR_TAB = CREATIVE_MODE_TABS.register(
            BuildersOfTheRift.MODID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + BuildersOfTheRift.MODID))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(Items.IRON_SHOVEL::getDefaultInstance)
                    .displayItems((parameters, output) -> {
                        BotrItems.BLOCK_ITEMS.forEach(item -> output.accept(item.get()));
                    })
                    .build());

}
