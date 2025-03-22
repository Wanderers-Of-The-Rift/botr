package com.wanderersoftherift.botr.init;

import com.wanderersoftherift.botr.BuildersOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BotrBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BuildersOfTheRift.MODID);

    private static <T extends Block> DeferredBlock<T> registerBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        BotrItems.registerSimpleBlockItem(key, register);
        return register;
    }

    private static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(BuildersOfTheRift.MODID, name));
    }
}
