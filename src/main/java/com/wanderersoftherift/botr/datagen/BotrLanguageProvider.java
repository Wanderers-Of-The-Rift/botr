package com.wanderersoftherift.botr.datagen;

import com.wanderersoftherift.botr.BuildersOfTheRift;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

/* Handles Data Generation for I18n of the locale 'en_us' of the Botr mod */
public class BotrLanguageProvider extends LanguageProvider {
    public BotrLanguageProvider(PackOutput output) {
        super(output, BuildersOfTheRift.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        /*
         * Helpers are available for various common object types. Every helper has two variants: an add() variant for
         * the object itself, and an addTypeHere() variant that accepts a supplier for the object. The different names
         * for the supplier variants are required due to generic type erasure. All following examples assume the
         * existence of the values as suppliers of the needed type. See
         * https://docs.neoforged.net/docs/1.21.1/resources/client/i18n/ for translation of other types.
         */

    }

    private static @NotNull String getTranslationString(Block block) {
        String idString = BuiltInRegistries.BLOCK.getKey(block).getPath();
        StringBuilder sb = new StringBuilder();
        for (String word : idString.toLowerCase(Locale.ROOT).split("_")) {
            sb.append(word.substring(0, 1).toUpperCase(Locale.ROOT));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
