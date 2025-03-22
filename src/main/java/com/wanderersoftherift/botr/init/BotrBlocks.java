package com.wanderersoftherift.botr.init;

import com.wanderersoftherift.botr.BuildersOfTheRift;
import com.wanderersoftherift.botr.block.MessageBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BotrBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BuildersOfTheRift.MODID);

    public static final DeferredBlock<Block> POI_3x3 = registerBlock("poi_3x3", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("poi_3x3")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> POI_5x5 = registerBlock("poi_5x5", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("poi_5x5")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> POI_7x7 = registerBlock("poi_7x7", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("poi_7x7")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> POI_9x9 = registerBlock("poi_9x9", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("poi_9x9")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> POI_11x11 = registerBlock("poi_11x11", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("poi_11x11")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> FEEDBACK = registerBlock("feedback", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("feedback")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> POI_HELP = registerBlock("poi_help", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("poi_help")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> POI_PLACING = registerBlock("poi_placing", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("poi_placing")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> NOT_READY = registerBlock("not_ready", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("not_ready")).strength(0.8f).sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> READY = registerBlock("ready", () -> new MessageBlock(
            BlockBehaviour.Properties.of().setId(blockId("ready")).strength(0.8f).sound(SoundType.WOOL)));

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
