package com.mattiapette.prova.init;

import com.mattiapette.prova.block.blockFlag;
import com.mattiapette.prova.block.blockProva;
import com.mattiapette.prova.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class modBlocks
{
    public static final blockProva flag = new blockFlag();
    public static void init()
    {
        GameRegistry.registerBlock(flag,"flag");
    }

}
