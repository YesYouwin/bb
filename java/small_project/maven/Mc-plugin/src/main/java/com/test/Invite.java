package com.test;

import org.bukkit.plugin.java.JavaPlugin;

public class Invite extends JavaPlugin{
    
    private PlayerTracker tracker;

    @Override
    public void onEnable() {
        tracker = new PlayerTracker(this);
        registerListeners();
        getLogger().info("Registering Invite Plugin");
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new JoinListener(tracker), this);
        getServer().getPluginManager().registerEvents(new LeaveListener(), this);
    }
}