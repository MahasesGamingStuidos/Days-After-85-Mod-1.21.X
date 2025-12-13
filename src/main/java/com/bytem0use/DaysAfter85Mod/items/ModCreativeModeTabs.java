package com.bytem0use.DaysAfter85Mod.items;

import com.bytem0use.DaysAfter85Mod.DaysAfter85;
import com.bytem0use.DaysAfter85Mod.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DaysAfter85.MOD_ID);

    public static final Supplier<CreativeModeTab> PRESENT_STACK_TAB = CREATIVE_MODE_TAB.register("present_stack_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PRESENT_RED))
                    .title(Component.translatable("creativetab.da85.present_stack"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.PRESENT_RED);
                        output.accept(ModBlocks.PRESENT_BLUE);
                        output.accept(ModBlocks.PRESENT_GREEN);
                        output.accept(ModBlocks.PRESENT_ORANGE);
                        output.accept(ModBlocks.PRESENT_PURPLE);
                        output.accept(ModBlocks.PRESENT_YELLOW);
                        output.accept(ModBlocks.PRESENT_STACK);
                        output.accept(ModBlocks.STRING_LIGHTS);
                        output.accept(ModBlocks.SPEAKER);
                        output.accept(ModBlocks.WINDOW);
                        output.accept(ModBlocks.WALL_PHONE);
                        output.accept(ModBlocks.GREEN_WALL_PHONE);
                        output.accept(ModBlocks.BLUE_WALL_PHONE);
                        output.accept(ModBlocks.STAGE_BLOCK);
                        output.accept(ModBlocks.STAGE_BLOCK);
                        output.accept(ModBlocks.RED_STAR_FLOOR);
                        output.accept(ModBlocks.GREEN_STAR_FLOOR);
                        output.accept(ModBlocks.BLUE_STAR_FLOOR);
                        output.accept(ModBlocks.STAR_FLOOR);
                        output.accept(ModBlocks.RED_STAR_FLOOR);
                        output.accept(ModBlocks.RED_STAR_CURTAIN);
                        output.accept(ModBlocks.RED_STRIPED_CURTAIN);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
