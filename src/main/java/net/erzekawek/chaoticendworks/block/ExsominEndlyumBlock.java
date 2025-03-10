
package net.erzekawek.chaoticendworks.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ExsominEndlyumBlock extends Block {
	public ExsominEndlyumBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 9f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
