package com.paddy999.gonzo.setup;

import com.paddy999.gonzo.worldgen.dimensions.Dimensions;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
public class ModSetup {

    public static final String TAB_NAME = "Gonzo";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME){
        @Override
        public ItemStack makeIcon () {return new ItemStack(Items.MUSIC_DISC_11);}

    };
    public static void setup() {
        IEventBus bus = MinecraftForge.EVENT_BUS;

    }
    public static void init(FMLCommonSetupEvent event){
        event.enqueueWork(() -> {


        Dimensions.register();

        });
    }



}
