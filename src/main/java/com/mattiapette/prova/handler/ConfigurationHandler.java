package com.mattiapette.prova.handler;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        //create a config object from the given config file
        configuration= new Configuration(configFile);
        boolean configValue=false;
        try
        {
            //load the configuration
            configuration.load();

            //read the proprieties
            configValue=configuration.get("la mia prima categoria! posso cambiarla!", "configValue", true, "this is an example").getBoolean(true);
        }
        catch (Exception e)
        {
            //log the exception
        }
        finally
        {
           if(configuration.hasChanged())
           {
               //se è cambiato, salva il file
                configuration.save();
           }
        }
        System.out.println(configValue);

    }
}
