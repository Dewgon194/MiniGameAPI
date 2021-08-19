package com.dewgon.minigameapi;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(ChatColor.AQUA + "MiniGameAPI enabled");
        getCommand("minigameapi").setExecutor(new TestCommands(new sBoard()));

    }

    @Override
    public void onDisable() {

    }
}
