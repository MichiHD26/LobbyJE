package net.minecraft5333.je.plugins.commands;

import net.minecraft5333.je.plugins.builds.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class StartInventory implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null,3*9, "§7Start");

        //left

        inventory.setItem(0, new ItemBuilder(Material.RAW_BEEF).setDisplayName("§aMein JE ID (Spielerkopf)").setLore("§7Name " + player.getName() ,"§7UUID " + player.getUniqueId()).build());
        inventory.setItem(9, new ItemBuilder(Material.APPLE).setDisplayName("§a Einstellungen").setLocalizedName("spawn").build());
        inventory.setItem(18, new ItemBuilder(Material.GOLDEN_APPLE).setDisplayName("§a Schließen").setLocalizedName("spawn").build());

        //middle

        inventory.setItem(12, new ItemBuilder(Material.ARROW).setDisplayName("§a JE").setLocalizedName("spawn").build());
        inventory.setItem(14, new ItemBuilder(Material.BED).setDisplayName("§a Texture UI").setLocalizedName("spawn").build());
        inventory.setItem(16, new ItemBuilder(Material.COOKED_BEEF).setDisplayName("§a Freunde").setLocalizedName("spawn").build());

        player.openInventory(inventory);
        return false;
    }
}
