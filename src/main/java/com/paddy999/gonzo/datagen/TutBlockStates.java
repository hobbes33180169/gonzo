package com.paddy999.gonzo.datagen;

import com.paddy999.gonzo.Gonzo;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockStates extends BlockStateProvider {
    public TutBlockStates(DataGenerator gen, ExistingFileHelper helper) { super(gen, Gonzo.MODID, helper);}

    @Override
    protected void registerStatesAndModels() {

    }
}
