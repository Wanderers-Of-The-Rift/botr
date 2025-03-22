package com.wanderersoftherift.botr.datagen;

import com.wanderersoftherift.botr.BuildersOfTheRift;
import com.wanderersoftherift.botr.init.BotrBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class BotrModelProvider extends ModelProvider {
    public BotrModelProvider(PackOutput output) {
        super(output, BuildersOfTheRift.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.POI_3x3.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/poi_3x3")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.POI_5x5.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/poi_5x5")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.POI_7x7.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/poi_7x7")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.POI_9x9.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/poi_9x9")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.POI_11x11.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/poi_11x11")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.POI_PLACING.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/poi_placing")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.POI_HELP.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/poi_help")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.FEEDBACK.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/feedback")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.NOT_READY.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/not_ready")));
        blockModels.createHorizontallyRotatedBlock(BotrBlocks.READY.get(),
                singleTexturedOrientableOnlyTop(modLocation("block/ready")));
    }

    public TexturedModel.Provider singleTexturedOrientableOnlyTop(ResourceLocation texture) {
        return TexturedModel.ORIENTABLE_ONLY_TOP.updateTexture(updater -> {
            updater.put(TextureSlot.TOP, texture);
            updater.put(TextureSlot.SIDE, texture);
            updater.put(TextureSlot.FRONT, texture);
        });
    }

}
