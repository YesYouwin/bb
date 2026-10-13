package dev.jack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


public class Flight extends JavaPlugin implements Listener {

    private final Set<UUID> activePlayers = new HashSet<>();
    private final Set<UUID> fallProtected = new HashSet<>();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction() != Action.RIGHT_CLICK_AIR && event.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }

        Player player = event.getPlayer();
        ItemStack item = event.getItem();
        ItemStack itemToRemove = new ItemStack(Material.NETHER_STAR, 1);

        if (item == null || item.getType() != Material.NETHER_STAR) {
            return;
        }

        UUID playerId = player.getUniqueId();

        if (activePlayers.contains(playerId)) {
            player.sendMessage("Little Bro Wait For The First One To End");
            return;
        }
        
        activePlayers.add(playerId);
        player.setAllowFlight(true);
        player.setFlying(true);
        player.sendMessage("You feel the power of the Nether Star!");
        
        getServer().getScheduler().runTaskLater(this, () -> {
            player.setFlying(false);
            player.setAllowFlight(false);
            player.sendMessage("Flight Over!");
            activePlayers.remove(playerId);
            fallProtected.add(playerId);

            getServer().getScheduler().runTaskLater(this, () -> {
                fallProtected.remove(playerId);
                }, 100L);
            }, 100L);

        }


    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        
        if (!(event.getEntity() instanceof Player player)) {
            return;
        }
        
        if (event.getCause() != EntityDamageEvent.DamageCause.FALL) {
            return;
        }
        
        if (fallProtected.contains(player.getUniqueId())) {
            event.setCancelled(true);
            player.sendMessage("You've been saved from the fall!");
        }
    }
}