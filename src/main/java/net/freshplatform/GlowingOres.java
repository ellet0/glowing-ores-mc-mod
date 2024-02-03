package net.freshplatform;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;


public class GlowingOres implements ClientModInitializer {
    public static final String MOD_ID = "glowingores";

    @Override
    public void onInitializeClient() {
        ModConfig.HANDLER.load();
        setLights();
    }

    public static void setLights() {
        ModConfig modConfig = ModConfig.HANDLER.instance();
        BlockWithLight[] blocksWithLight = {
                new BlockWithLight(Blocks.DIAMOND_ORE, modConfig.diamondOreLight),
                new BlockWithLight(Blocks.DEEPSLATE_DIAMOND_ORE, modConfig.deepSlateDiamondOreLight),
                new BlockWithLight(Blocks.EMERALD_ORE, modConfig.emeraldOreLight),
                new BlockWithLight(Blocks.DEEPSLATE_EMERALD_ORE, modConfig.deepSlateEmeraldOreLight),
                new BlockWithLight(Blocks.GOLD_ORE, modConfig.goldOreLight),
                new BlockWithLight(Blocks.DEEPSLATE_GOLD_ORE, modConfig.deepSlateGoldOreLight),
                new BlockWithLight(Blocks.LAPIS_ORE, modConfig.lapisOreLight),
                new BlockWithLight(Blocks.DEEPSLATE_LAPIS_ORE, modConfig.deepSlateLapisOreLight),
                new BlockWithLight(Blocks.COPPER_ORE, modConfig.copperOreLight),
                new BlockWithLight(Blocks.DEEPSLATE_COPPER_ORE, modConfig.deepSlateCopperOreLight),
                new BlockWithLight(Blocks.IRON_ORE, modConfig.ironOreLight),
                new BlockWithLight(Blocks.DEEPSLATE_IRON_ORE, modConfig.deepSlateIronOreLight),
                new BlockWithLight(Blocks.COAL_ORE, modConfig.coalOreLight),
                new BlockWithLight(Blocks.DEEPSLATE_COAL_ORE, modConfig.deepSlateCoalOreLight)
        };
        for (BlockWithLight blockWithLight : blocksWithLight) {
            addLight(blockWithLight.block().getStateDefinition().getPossibleStates(), blockWithLight.light());
        }
    }

    private static void addLight(ImmutableList<BlockState> blockStates, int light) {
        for (BlockState blockState : blockStates) {
            blockState.lightEmission = light;
        }
    }
}