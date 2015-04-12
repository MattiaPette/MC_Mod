package com.mattiapette.prova;

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

    @SidedProxy(clientSide = "com.mattiapette.prova.proxy.ClientProxy", serverSide = "com.mattiapette.prova.proxy.ServerProxy")
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        //config items block
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
