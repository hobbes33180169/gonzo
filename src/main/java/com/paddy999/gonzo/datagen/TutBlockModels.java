package com.paddy999.gonzo.datagen;

import com.paddy999.gonzo.Gonzo;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockModels extends ItemModelProvider {
    public TutBlockModels(DataGenerator generator, ExistingFileHelper existingFileHelper){super(generator, Gonzo.MODID, existingFileHelper);} {
    }

    @Override protected void registerModels() {

    }

}
