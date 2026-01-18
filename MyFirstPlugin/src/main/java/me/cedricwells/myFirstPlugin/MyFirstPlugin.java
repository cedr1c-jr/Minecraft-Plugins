package me.cedricwells.myFirstPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.sql.SQLOutput;

public final class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The Plugin Has Started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin has stopped");
    }
}
