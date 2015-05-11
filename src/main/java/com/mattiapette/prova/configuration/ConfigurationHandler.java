package com.mattiapette.prova.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //create a config object from the given config file
        Configuration config= new Configuration(configFile);
        boolean configValue=false;
        try
        {
            //load the configuration
            config.load();

            //read the proprieties
            configValue=config.get("la mia prima categoria! posso cambiarla!", "configValue", true, "this is an example").getBoolean(true);
        }
        catch (Exception e)
        {
            //log the exception
        }
        finally
        {
            //save the config file
            config.save();
        }
        System.out.println(configValue);

    }
}
