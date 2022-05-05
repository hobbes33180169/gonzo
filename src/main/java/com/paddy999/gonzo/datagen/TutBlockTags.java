package com.paddy999.gonzo.datagen;

import com.paddy999.gonzo.Gonzo;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockTags extends BlockTagsProvider {

    public TutBlockTags(DataGenerator generator, ExistingFileHelper helper){ super(generator, Gonzo.MODID, helper);}

    @Override
    protected void addTags() {

    }

    @Override
    public String getName() {return "Tutorial Tags";}





}


