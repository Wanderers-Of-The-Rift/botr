package com.wanderersoftherift.botr.datagen;

import com.wanderersoftherift.botr.BuildersOfTheRift;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

public class BotrModelProvider extends ModelProvider {
    public BotrModelProvider(PackOutput output) {
        super(output, BuildersOfTheRift.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {

    }

}
