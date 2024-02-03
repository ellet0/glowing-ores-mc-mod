package net.freshplatform;


import net.minecraft.world.level.block.Block;

// It's better to use enum class with the default values, but I'm just playing around for now
public record BlockWithLight(Block block, int light) {}