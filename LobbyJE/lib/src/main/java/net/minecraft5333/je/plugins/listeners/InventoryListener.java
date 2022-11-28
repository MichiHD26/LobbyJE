package net.minecraft5333.je.plugins.listeners;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;



public class InventoryListener implements Listener {

    @EventHandler

    public void OnInvClick(InventoryClickEvent event){
        if (event.getCurrentItem() == null) return;
        if (event.getView().getTitle() == "Start"){
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);
            if (event.getCurrentItem().getItemMeta().hasLocalizedName()){
                switch (event.getCurrentItem().getItemMeta().getLocalizedName()){
                    case "survival":
                        player.setGameMode(GameMode.SURVIVAL);
                        player.closeInventory();
                        break;

                    case "creative":
                        player.setGameMode(GameMode.CREATIVE);
                        player.closeInventory();
                        break;

                    case "spawn":
                        player.teleport(Bukkit.getWorld("world").getSpawnLocation());
                        player.closeInventory();
                        break;
                }
            }
        }
    }
}