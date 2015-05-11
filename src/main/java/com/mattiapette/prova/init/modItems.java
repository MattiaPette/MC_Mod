package com.mattiapette.prova.init;

import com.mattiapette.prova.item.itemBlank;
import com.mattiapette.prova.item.itemProva;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Mattia on 11/05/2015.
 */
public class modItems
{
    public static final itemProva blank = new itemBlank();

    public static void init()
    {
        GameRegistry.registerItem(blank,"blank");
    }
}
