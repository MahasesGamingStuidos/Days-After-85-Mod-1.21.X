package com.bytem0use.DaysAfter85Mod.blocks.custom;

import com.bytem0use.DaysAfter85Mod.blocks.ModBlockEntities;
import com.bytem0use.DaysAfter85Mod.blocks.blockEntity.LockerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.Direction;
import org.jetbrains.annotations.Nullable;

import net.minecraft.world.level.block.state.properties.EnumProperty;

public class LockerBlock extends ChestBlock implements EntityBlock {

    public LockerBlock(Properties properties) {
        super(0.0F, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LockerBlockEntity(ModBlockEntities.LOCKER.get(), pos, state);
    }

    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) {
            BlockEntity blockentity = world.getBlockEntity(pos);
            if (blockentity instanceof LockerBlockEntity) {
                // default chest drop behavior handled by super or container logic elsewhere
            }
        }
        super.onRemove(state, world, pos, newState, isMoving);
    }
}
package com.bytem0use.DaysAfter85Mod.blocks.custom;

public class LockerBlock {
}
