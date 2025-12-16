package com.bytem0use.DaysAfter85Mod.blocks;

import com.bytem0use.DaysAfter85Mod.DaysAfter85;
import com.bytem0use.DaysAfter85Mod.blocks.blockEntity.LockerBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, DaysAfter85.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>> LOCKER = BLOCK_ENTITIES.register("locker", () -> BlockEntityType.Builder.of(LockerBlockEntity::new, ModBlocks.LOCKER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
