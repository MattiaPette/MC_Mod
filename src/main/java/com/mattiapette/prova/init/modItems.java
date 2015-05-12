package com.mattiapette.prova.init;

import com.mattiapette.prova.item.itemBlank;
import com.mattiapette.prova.item.itemProva;
import com.mattiapette.prova.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class modItems
{
    public static final itemProva blank = new itemBlank();

    public static void init()
    {
        GameRegistry.registerItem(blank,"blank");
    }
}
