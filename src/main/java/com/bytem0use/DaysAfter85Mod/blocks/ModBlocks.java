package com.bytem0use.DaysAfter85Mod.blocks;

import com.bytem0use.DaysAfter85Mod.DaysAfter85;
import com.bytem0use.DaysAfter85Mod.blocks.custom.PresentBlock;
import com.bytem0use.DaysAfter85Mod.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DaysAfter85.MOD_ID);

    public static final DeferredBlock<Block> PRESENT_RED;
    public static final DeferredBlock<Block> PRESENT_BLUE;
    public static final DeferredBlock<Block> PRESENT_GREEN;
    public static final DeferredBlock<Block> PRESENT_ORANGE;
    public static final DeferredBlock<Block> PRESENT_PURPLE;
    public static final DeferredBlock<Block> PRESENT_YELLOW;
    public static final DeferredBlock<Block> PRESENT_STACK;
    public static final DeferredBlock<Block> SANDY_BRICKS;


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
        PRESENT_GREEN = registerBlock("present_green", () -> new PresentBlock(BlockBehaviour.Properties.of().noOcclusion()));
        PRESENT_ORANGE = registerBlock("present_orange", () -> new PresentBlock(BlockBehaviour.Properties.of().noOcclusion()));
        PRESENT_PURPLE = registerBlock("present_purple", () -> new PresentBlock(BlockBehaviour.Properties.of().noOcclusion()));
        PRESENT_YELLOW = registerBlock("present_yellow", () -> new PresentBlock(BlockBehaviour.Properties.of().noOcclusion()));
        PRESENT_STACK = registerBlock("present_stack", () -> new PresentBlock(BlockBehaviour.Properties.of().noOcclusion()));
        SANDY_BRICKS = registerBlock("sandy_bricks", () -> new Block(BlockBehaviour.Properties.of().strength(.2f).sound(SoundType.DEEPSLATE_BRICKS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
