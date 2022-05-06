package com.paddy999.gonzo.worldgen.dimensions;


import com.paddy999.gonzo.Gonzo;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class Dimensions {

    public static final ResourceKey<Level> GONZO = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(Gonzo.MODID, "gonzo"));

    public static void register() {
        Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(Gonzo.MODID, "gonzo_chunkgen"),
               GonzoChunkGenerator.CODEC);

        Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(Gonzo.MODID, "biomes"),
                GonzoChthonicProvider.CODEC);
    }
}