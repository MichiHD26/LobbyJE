package net.minecraft5333.je.plugins.commands;

import net.minecraft5333.je.plugins.builds.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class TeleportInventory implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null, 6*9, "§7Teleport");

        //Hauptlobby

        inventory.setItem(22, new ItemBuilder(Material.BLAZE_POWDER).setDisplayName("§aZur Spawn").setLocalizedName("spawn").build());
        inventory.setItem(31, new ItemBuilder(Material.BLAZE_ROD).setDisplayName("§aPremium Lobby").setLocalizedName("spawn").build());

        player.openInventory(inventory);
        return false;
    }
}
