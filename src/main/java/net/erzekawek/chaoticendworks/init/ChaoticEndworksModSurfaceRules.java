package net.erzekawek.chaoticendworks.init;

import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.erzekawek.chaoticendworks.mixins.NoiseGeneratorSettingsAccess;

@EventBusSubscriber
public class ChaoticEndworksModSurfaceRules {
	@SubscribeEvent
	public static void init(ServerAboutToStartEvent event) {
		LevelStem levelStem = event.getServer().registryAccess().registryOrThrow(Registries.LEVEL_STEM).get(LevelStem.END);
		ChunkGenerator chunkGenerator = levelStem.generator();
		boolean hasEndBiomes = chunkGenerator.getBiomeSource().possibleBiomes().stream().anyMatch(biomeHolder -> biomeHolder.unwrapKey().orElseThrow().location().getNamespace().equals("chaotic_endworks"));
		if (hasEndBiomes) {
			if (chunkGenerator instanceof NoiseBasedChunkGenerator generator) {
				NoiseGeneratorSettings noiseGeneratorSettings = generator.settings.value();
				registerSurfaceRules(ResourceLocation.parse("chaotic_endworks:floating_archipelago"), noiseGeneratorSettings, Blocks.END_STONE.defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(ResourceLocation.parse("chaotic_endworks:exsomin_timberlands"), noiseGeneratorSettings, ChaoticEndworksModBlocks.EXSOMIN_ENDLYUM.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(ResourceLocation.parse("chaotic_endworks:exsomin_timbermidlands"), noiseGeneratorSettings, ChaoticEndworksModBlocks.EXSOMIN_ENDLYUM.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
			}
		}
	}

	public static void registerSurfaceRules(ResourceLocation biome, NoiseGeneratorSettings noiseGeneratorSettings, BlockState groundBlock, BlockState undergroundBlock) {
		((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings).addSurfaceRule(SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ResourceKey.create(Registries.BIOME, biome)),
				SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(groundBlock)), SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.state(undergroundBlock)))), noiseGeneratorSettings.surfaceRule()));
	}
}
