package dev.jack;

import org.bukkit.plugin.java.JavaPlugin;

public class HelloPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello, Minecraft!");
    }
}