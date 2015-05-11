package com.mattiapette.prova;

import com.mattiapette.prova.configuration.ConfigurationHandler;
import com.mattiapette.prova.proxy.Iproxy;
import com.mattiapette.prova.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class Prova {

    @Mod.Instance(Reference.MOD_ID)
    public static Prova instance;

    @SidedProxy(clientSide =Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        ConfigurationHandler.init(e.getSuggestedConfigurationFile());
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
