package com.wanderersoftherift.botr;

import com.mojang.logging.LogUtils;
import com.wanderersoftherift.botr.config.ClientConfig;
import com.wanderersoftherift.botr.init.BotrBlocks;
import com.wanderersoftherift.botr.init.BotrCreativeTabs;
import com.wanderersoftherift.botr.init.BotrItems;
import com.wanderersoftherift.botr.init.BotrMenuTypes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import org.slf4j.Logger;

@Mod(BuildersOfTheRift.MODID)
public class BuildersOfTheRift {
    public static final String MODID = "botr";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BuildersOfTheRift(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        // Register things
        BotrBlocks.BLOCKS.register(modEventBus);
        BotrItems.ITEMS.register(modEventBus);
        BotrMenuTypes.MENUS.register(modEventBus);
        BotrCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        /*
         * Register ourselves for server and other game events we are interested in. Note that this is necessary if and
         * only if we want *this* class (Botr) to respond directly to events. Do not add this line if there are
         * no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
         */
        NeoForge.EVENT_BUS.register(this);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC);
    }

    /**
     * Helper method to get a {@code ResourceLocation} with our Mod Id and a passed in name
     *
     * @param name the name to create the {@code ResourceLocation} with
     * @return A {@code ResourceLocation} with the given name
     */
    public static ResourceLocation id(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }

    /**
     * Helper method to get a {@code TagKey} with our Mod Id and a passed in name
     *
     * @param name the name to create the {@code TagKey} with
     * @return A {@code TagKey} with the given name
     */
    public static <T> TagKey<T> tagId(ResourceKey<? extends Registry<T>> registry, String name) {
        return TagKey.create(registry, id(name));
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    private void registerCommands(RegisterCommandsEvent event) {

    }

}
