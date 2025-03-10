package net.erzekawek.chaoticendworks.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.erzekawek.chaoticendworks.endbiomes.TheEndBiomes;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ChaoticEndworksModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addSmallIslandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("chaotic_endworks:floating_archipelago")), 1d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("chaotic_endworks:exsomin_timberlands")), 2d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("chaotic_endworks:exsomin_timberlands")), ResourceKey.create(Registries.BIOME, ResourceLocation.parse("chaotic_endworks:exsomin_timbermidlands")),
					2d);
		});
	}
}
