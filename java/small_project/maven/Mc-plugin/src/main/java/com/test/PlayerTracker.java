package com.test;

import org.bukkit.entity.Player;

public class PlayerTracker {
    private final Invite plugin; //import the main header

    public PlayerTracker(Invite plugin) {
        this.plugin = plugin;
    }
    public int jointracker(Player player){
        String uuid = player.getUniqueId().toString();
        int joins = plugin.getConfig().getInt("players." + uuid + ".joins", 0);
        joins ++;

        plugin.getConfig().set("players." + uuid + ".name", player.getName());
        plugin.getConfig().set("players." + uuid + ".joins", joins);
        plugin.saveConfig();

        return joins;
    }
}