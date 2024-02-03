package net.freshplatform;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.autogen.*;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class ModConfig {
    public static ConfigClassHandler<ModConfig> HANDLER = ConfigClassHandler.createBuilder(ModConfig.class)
            .id(new ResourceLocation(GlowingOres.MOD_ID))
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setPath(FabricLoader.getInstance().getConfigDir().resolve(GlowingOres.MOD_ID + ".json5"))
                    .setJson5(true)
                    .build())
            .build();

    private static final int MAX_LIGHT_VALUE = 15;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int diamondOreLight = 15;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int deepSlateDiamondOreLight = 15;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int emeraldOreLight = 12;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int deepSlateEmeraldOreLight = 12;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int goldOreLight = 10;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int deepSlateGoldOreLight = 10;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int lapisOreLight = 7;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int deepSlateLapisOreLight = 7;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int copperOreLight = 7;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int deepSlateCopperOreLight = 7;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int ironOreLight = 4;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int deepSlateIronOreLight = 4;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int coalOreLight = 4;

    @SerialEntry
    @AutoGen(category = "client")
    @IntSlider(min = 0, max = MAX_LIGHT_VALUE, step = 1)
    public int deepSlateCoalOreLight = 4;
}
