package dev.jack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import net.kyori.adventure.text.Component;

// Very imp
import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.inventory.meta.ItemMeta;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents; 
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import org.bukkit.entity.FallingBlock;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import java.util.ArrayList;
import java.util.List;

public final class phytnt extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("PhysicsTnt enabled!");

        getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS,event -> event.registrar().register("PhysicsTnt", new BasicCommand() {
            @Override
            public void execute(CommandSourceStack source, String[] args) {
                if (!(source.getSender() instanceof Player player)) {
                       return;
                }
                ItemStack tnt = new ItemStack(Material.TNT, 64);
                ItemMeta meta = tnt.getItemMeta();
        
                meta.displayName(Component.text("TNT PLASH", NamedTextColor.LIGHT_PURPLE));
                meta.setEnchantmentGlintOverride(true);
                tnt.setItemMeta(meta);
                player.getInventory().addItem(tnt);
            }
        }));
    }


    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        ItemStack item = event.getItem();

        // Return Checks
        if (item == null || item.getType() != Material.TNT) {return;}
        if (event.getAction() != Action.RIGHT_CLICK_AIR && event.getAction() != Action.RIGHT_CLICK_BLOCK) {return;}
        if (!Component.text("TNT PLASH", NamedTextColor.LIGHT_PURPLE).equals(item.getItemMeta().displayName())) {return;}

        // Main Code Begins Here
        RayTraceResult Target_Block = player.getWorld().rayTraceBlocks(player.getEyeLocation(), player.getEyeLocation().getDirection(), 60);
        if (Target_Block == null || Target_Block.getHitBlock() == null) {return;}
        Vector vectorpos = Target_Block.getHitPosition();
        Location boom = new Location(player.getWorld(), vectorpos.getX(), vectorpos.getY(), vectorpos.getZ()); 
        // RayTraceResult varname = (world, block_location, block_direction, distance);
        // Vector varname = block_position
        // Location varname = new Location(world, double X, double Y, double Z)

        player.getWorld().playSound(boom, Sound.ENTITY_GENERIC_EXPLODE, 2.0f, 1.0f);
        item.setAmount(item.getAmount() - 1);
        event.setCancelled(true);

        List<BlockSnapshot> blocks = new ArrayList<>();
        
        int radius = 6;
        for (int x = -radius; x <=radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    Location BoomBlock = boom.clone().add(x,y,z);
                    Block block = BoomBlock.getBlock();

                    if (block.getType().isAir()) {continue;}
                    if (BoomBlock.distanceSquared(boom) > radius * radius) {continue;}

                    blocks.add(new BlockSnapshot(block.getLocation(), block.getBlockData().clone() ));
                }  
            }
        }

        // Removes Each Block Present
        for (BlockSnapshot snapshot : blocks) {
            snapshot.location().getBlock().setType(Material.AIR, false);
        }

        // Adds Their Physics Version
        for (BlockSnapshot snapshot : blocks) {
            Location spawnLocation = snapshot.location().clone().add(0.5, 0.5, 0.5);
            FallingBlock fallingBlock = player.getWorld().spawnFallingBlock(spawnLocation,snapshot.data());
            fallingBlock.setDropItem(false);

            Vector direction = spawnLocation.toVector().subtract(boom.toVector()).normalize();
    
            direction.multiply(0.5);
            direction.setY(direction.getY() + 0.4);
            
            fallingBlock.setVelocity(direction);
        }
        
        
    }

    private record BlockSnapshot(Location location, BlockData data) {}
}
