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
                        output.accept(ModBlocks.SANDY_BRICKS);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
