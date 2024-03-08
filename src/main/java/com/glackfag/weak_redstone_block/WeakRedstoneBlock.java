package com.glackfag.weak_redstone_block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class WeakRedstoneBlock extends RedstoneBlock {
    public static final WeakRedstoneBlock INSTANCE = new WeakRedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK));
    public static final Identifier ID = new Identifier("weak_redstone_block", "weak_redstone_block");

    private WeakRedstoneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 1;
    }
}