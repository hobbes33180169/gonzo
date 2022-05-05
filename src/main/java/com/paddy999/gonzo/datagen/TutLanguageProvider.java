package com.paddy999.gonzo.datagen;

import com.paddy999.gonzo.Gonzo;

import com.paddy999.gonzo.setup.Registration;
import com.paddy999.gonzo.Gonzo;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.paddy999.gonzo.setup.ModSetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {

    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Gonzo.MODID, locale);
    }

    @Override
    protected void addTranslations() {

    }
}