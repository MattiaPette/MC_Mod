package com.mattiapette.creativeTab;

import com.mattiapette.prova.init.modItems;
import com.mattiapette.prova.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class creativeTabProva
{
    public static final CreativeTabs PROVA_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return modItems.blank;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Prova";
        }
    };

}
