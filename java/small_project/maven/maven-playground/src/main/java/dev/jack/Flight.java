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

        Player player = event.getPlayer();
        ItemStack item = event.getItem();
        UUID playerId = player.getUniqueId();

        if (item != null && item.getType() == Material.NETHER_STAR && 
            (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
            if (activePlayers.contains(playerId)) {
                player.sendMessage("Little Bro Wait For The First One To End");
                return;
            }

            item.setAmount(item.getAmount() - 1);
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
                    if (fallProtected.contains(playerId)) {
                        fallProtected.remove(playerId);
                        }
                    }, 100L);
                }, 100L);
            }
        }


    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        
        if (!(event.getEntity() instanceof Player player) || event.getCause() != EntityDamageEvent.DamageCause.FALL) {
            return;
        }
        
        if (fallProtected.contains(player.getUniqueId())) {
            event.setCancelled(true);
            player.sendMessage("You've been saved from the fall!");
            fallProtected.remove(player.getUniqueId());
        }
    }
}