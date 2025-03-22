package com.wanderersoftherift.botr.init;

import com.wanderersoftherift.botr.BuildersOfTheRift;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BotrTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(BuildersOfTheRift.id(name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(BuildersOfTheRift.id(name));
        }
    }
}
