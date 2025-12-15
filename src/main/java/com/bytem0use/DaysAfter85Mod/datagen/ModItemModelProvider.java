package com.bytem0use.DaysAfter85Mod.datagen;

import com.bytem0use.DaysAfter85Mod.DaysAfter85;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DaysAfter85.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
