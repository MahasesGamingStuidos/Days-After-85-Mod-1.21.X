package com.bytem0use.DaysAfter85Mod.blocks;

import com.bytem0use.DaysAfter85Mod.DaysAfter85;
import com.bytem0use.DaysAfter85Mod.blocks.custom.PresentBlock;
import com.bytem0use.DaysAfter85Mod.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DaysAfter85.MOD_ID);

    public static final DeferredBlock<Block> PRESENT_RED;
    public static final DeferredBlock<Block> PRESENT_BLUE;

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    static{
        PRESENT_RED = registerBlock("present_red", () -> new PresentBlock(BlockBehaviour.Properties.of().noOcclusion()));
        PRESENT_BLUE = registerBlock("present_blue", () -> new PresentBlock(BlockBehaviour.Properties.of().noOcclusion()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
