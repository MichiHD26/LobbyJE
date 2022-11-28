package net.minecraft5333.je.plugins.Inventory;

import net.minecraft5333.je.plugins.builds.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class hotbar implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onIMove(InventoryClickEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().getInventory().clear();
        e.getPlayer().getInventory().setItem(0, new ItemBuilder(Material.ARROW).build());
        e.getPlayer().getInventory().setItem(3, new ItemBuilder(Material.COMPASS).build());
        e.getPlayer().getInventory().setItem(5, new ItemBuilder(Material.WATCH).build());
        e.getPlayer().getInventory().setItem(8, new ItemBuilder(Material.CHEST).build());
    }
}
