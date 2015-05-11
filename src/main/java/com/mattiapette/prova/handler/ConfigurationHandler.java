package com.mattiapette.prova.handler;

import com.mattiapette.prova.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;
    public static Boolean testValue = false;

    public static void init(File configFile)
    {
        //create a config object from the given config file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
        }
    }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "this is an example");
        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
          loadConfiguration();
        }
    }
}