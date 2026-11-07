package com.test;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.title.Title;

public class JoinListener implements Listener{
    
    private final PlayerTracker tracker;
    public JoinListener(PlayerTracker tracker) {
        this.tracker = tracker;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        int joins = tracker.jointracker(player);
        
        player.showTitle(Title.title(Component.text("Welcome " + player.getName() + "!").color(NamedTextColor.GREEN)
            .decorate(TextDecoration.BOLD),Component.text("Enjoy Your Stay!").color(NamedTextColor.LIGHT_PURPLE)));
        if (joins == 1) {
            event.joinMessage(Component.text(player.getName() + " is a NewComer!! Everyone Welcome Them")
                .color(NamedTextColor.GOLD).decorate(TextDecoration.BOLD));
        } 
        else {
            event.joinMessage(Component.text(player.getName() + " Has Joined The Server! [Times Joined: " + joins + "]")
                .color(NamedTextColor.GREEN));}
            // Declare joinMessage as under an event as it is working under the event which is our "PlayerJoinEvent"
    }
}