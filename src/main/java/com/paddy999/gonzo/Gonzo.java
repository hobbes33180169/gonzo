package com.paddy999.gonzo;

import com.paddy999.gonzo.setup.Registration;
import com.paddy999.gonzo.setup.ModSetup;
import com.paddy999.gonzo.setup.ClientSetup;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.minecraftforge.api.distmarker.Dist;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(Gonzo.MODID)
public class Gonzo
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "gonzo";
    public Gonzo()
    {
        ModSetup.setup();
        Registration.init();

        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener((ClientSetup::init)));

    }
}
