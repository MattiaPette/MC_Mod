package com.mattiapette.prova;

import com.mattiapette.prova.handler.ConfigurationHandler;
import com.mattiapette.prova.init.modBlocks;
import com.mattiapette.prova.init.modItems;
import com.mattiapette.prova.proxy.Iproxy;
import com.mattiapette.prova.reference.Reference;
import com.mattiapette.prova.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Prova {

    @Mod.Instance(Reference.MOD_ID)
    public static Prova instance;

    @SidedProxy(clientSide =Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        ConfigurationHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        modItems.init();
        modBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        //crafting recipy
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        //dopo le altre mod
    }

}
