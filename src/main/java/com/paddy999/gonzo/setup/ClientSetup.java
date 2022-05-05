package com.paddy999.gonzo.setup;

import com.paddy999.gonzo.Gonzo;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;



@Mod.EventBusSubscriber(modid = Gonzo.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    public static void init(FMLClientSetupEvent event)
    {

    }
}
