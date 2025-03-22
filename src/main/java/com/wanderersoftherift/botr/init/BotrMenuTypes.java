package com.wanderersoftherift.botr.init;

import com.wanderersoftherift.botr.BuildersOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BotrMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU,
            BuildersOfTheRift.MODID);
}
