package com.wanderersoftherift.botr.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ClientConfig {
    public static final ModConfigSpec SPEC;

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    static {
        // BUILDER.comment(" == Botr Client Configs ==");

        SPEC = BUILDER.build();
    }
}
