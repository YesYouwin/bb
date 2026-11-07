package com.test;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;
// import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;


public class LeaveListener implements Listener{

    @EventHandler
    public void onLeave(PlayerQuitEvent event) { 
        event.quitMessage(Component.text(event.getPlayer().getName() + " Has Left The Server").color(NamedTextColor.RED));
        // .decorate(TextDecoration.BOLD)
    }
}