package me.xixun.lslor;


import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.A;

import java.io.File;
import java.io.IOException;

public final class LsLOR extends JavaPlugin {
    private File customConfigFile ;
    private FileConfiguration customConfig ;

    public static final String path = "plugins/lsrm/";

    public boolean ladno = false;

    @Override
    public void onEnable() {
        System.out.println("ку авенух");

        getServer().getPluginManager().registerEvents(new nloevent(), this);

        try {
            writeData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            readData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidConfigurationException e) {
            throw new RuntimeException(e);
        }

    }


    public void writeData() throws IOException {
        FileConfiguration fileConfiguration = this.getConfig();
        fileConfiguration.set("x", nloevent.x);
        fileConfiguration.set("z", nloevent.z);
        fileConfiguration.set("x2", nloevent.x2);
        fileConfiguration.set("z2", nloevent.z2);
        fileConfiguration.set("x3", nloevent.x3);
        fileConfiguration.set("z3", nloevent.z3);
        fileConfiguration.set("x4", nloevent.x4);
        fileConfiguration.set("z4", nloevent.z4);
        fileConfiguration.save(path + "config.yml");
    }

    public void readData() throws IOException, InvalidConfigurationException {
        FileConfiguration fileConfiguration = new YamlConfiguration();
        fileConfiguration.load(path + "config.yml");

        nloevent.x = (double) fileConfiguration.get("x");
        nloevent.x2 = (double) fileConfiguration.get("x2");
        nloevent.x3 = (double) fileConfiguration.get("x3");
        nloevent.x4 = (double) fileConfiguration.get("x4");
        nloevent.z = (double) fileConfiguration.get("z");
        nloevent.z2 = (double) fileConfiguration.get("z2");
        nloevent.z3 = (double) fileConfiguration.get("z3");
        nloevent.z4 = (double) fileConfiguration.get("z4");
    }




    public void onDisable()
    {
        System.out.println("пока авенух");
    }
}
