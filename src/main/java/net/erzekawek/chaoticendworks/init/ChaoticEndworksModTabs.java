
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.chaoticendworks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.erzekawek.chaoticendworks.ChaoticEndworksMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ChaoticEndworksModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChaoticEndworksMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CHAOTIC_ENDWORKS_CREATIVE_TAB = REGISTRY.register("chaotic_endworks_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chaotic_endworks.chaotic_endworks_creative_tab")).icon(() -> new ItemStack(ChaoticEndworksModBlocks.EXSOMIN_LOG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_WOOD.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_LOG.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_PLANKS.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_LEAVES.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_STAIRS.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_SLAB.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_FENCE.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_FENCE_GATE.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_PRESSURE_PLATE.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_BUTTON.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_DOOR.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_TRAPDOOR.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_ENDLYUM.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_SHORTGRASS.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_BLINTLIGHT.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_STALKFLOWER.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_GRASS.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.EXSOMIN_FLOWER.get().asItem());
				tabData.accept(ChaoticEndworksModBlocks.MINOLITE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ChaoticEndworksModBlocks.ENDSTONE_STAIRS.get().asItem());
			tabData.accept(ChaoticEndworksModBlocks.END_STONE_SLAB.get().asItem());
		}
	}
}
