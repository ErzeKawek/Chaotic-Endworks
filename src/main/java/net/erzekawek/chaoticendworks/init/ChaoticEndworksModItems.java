
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.chaoticendworks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.erzekawek.chaoticendworks.ChaoticEndworksMod;

public class ChaoticEndworksModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ChaoticEndworksMod.MODID);
	public static final DeferredItem<Item> EXSOMIN_WOOD = block(ChaoticEndworksModBlocks.EXSOMIN_WOOD);
	public static final DeferredItem<Item> EXSOMIN_LOG = block(ChaoticEndworksModBlocks.EXSOMIN_LOG);
	public static final DeferredItem<Item> EXSOMIN_PLANKS = block(ChaoticEndworksModBlocks.EXSOMIN_PLANKS);
	public static final DeferredItem<Item> EXSOMIN_LEAVES = block(ChaoticEndworksModBlocks.EXSOMIN_LEAVES);
	public static final DeferredItem<Item> EXSOMIN_STAIRS = block(ChaoticEndworksModBlocks.EXSOMIN_STAIRS);
	public static final DeferredItem<Item> EXSOMIN_SLAB = block(ChaoticEndworksModBlocks.EXSOMIN_SLAB);
	public static final DeferredItem<Item> EXSOMIN_FENCE = block(ChaoticEndworksModBlocks.EXSOMIN_FENCE);
	public static final DeferredItem<Item> EXSOMIN_FENCE_GATE = block(ChaoticEndworksModBlocks.EXSOMIN_FENCE_GATE);
	public static final DeferredItem<Item> EXSOMIN_PRESSURE_PLATE = block(ChaoticEndworksModBlocks.EXSOMIN_PRESSURE_PLATE);
	public static final DeferredItem<Item> EXSOMIN_BUTTON = block(ChaoticEndworksModBlocks.EXSOMIN_BUTTON);
	public static final DeferredItem<Item> EXSOMIN_DOOR = doubleBlock(ChaoticEndworksModBlocks.EXSOMIN_DOOR);
	public static final DeferredItem<Item> EXSOMIN_TRAPDOOR = block(ChaoticEndworksModBlocks.EXSOMIN_TRAPDOOR);
	public static final DeferredItem<Item> EXSOMIN_ENDLYUM = block(ChaoticEndworksModBlocks.EXSOMIN_ENDLYUM);
	public static final DeferredItem<Item> EXSOMIN_SHORTGRASS = block(ChaoticEndworksModBlocks.EXSOMIN_SHORTGRASS);
	public static final DeferredItem<Item> ENDSTONE_STAIRS = block(ChaoticEndworksModBlocks.ENDSTONE_STAIRS);
	public static final DeferredItem<Item> END_STONE_SLAB = block(ChaoticEndworksModBlocks.END_STONE_SLAB);
	public static final DeferredItem<Item> EXSOMIN_BLINTLIGHT = block(ChaoticEndworksModBlocks.EXSOMIN_BLINTLIGHT);
	public static final DeferredItem<Item> EXSOMIN_STALKFLOWER = doubleBlock(ChaoticEndworksModBlocks.EXSOMIN_STALKFLOWER);
	public static final DeferredItem<Item> EXSOMIN_GRASS = block(ChaoticEndworksModBlocks.EXSOMIN_GRASS);
	public static final DeferredItem<Item> EXSOMIN_FLOWER = block(ChaoticEndworksModBlocks.EXSOMIN_FLOWER);
	public static final DeferredItem<Item> MINOLITE = block(ChaoticEndworksModBlocks.MINOLITE);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
