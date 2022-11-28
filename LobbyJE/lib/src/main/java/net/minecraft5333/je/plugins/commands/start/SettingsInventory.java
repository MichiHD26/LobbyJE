package net.minecraft5333.je.plugins.commands.start;

import net.minecraft5333.je.plugins.builds.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SettingsInventory implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null, 3*9, "Einstellungen");

        //left

        inventory.setItem(0, new ItemBuilder(Material.ARROW).setDisplayName("§aServer Info").setLocalizedName("spawn").build());
        inventory.setItem(9, new ItemBuilder(Material.ARROW).setDisplayName("§aZurück").setLocalizedName("spawn").build());
        inventory.setItem(18, new ItemBuilder(Material.ARROW).setDisplayName("§aSchließen").setLocalizedName("spawn").build());

        //settings layer 1

        inventory.setItem(2, new ItemBuilder(Material.ARROW).setDisplayName("§aMein Konto").setLocalizedName("spawn").build());
        inventory.setItem(3, new ItemBuilder(Material.ARROW).setDisplayName("§aSprache ändern").setLocalizedName("spawn").build());
        inventory.setItem(4, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(5, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(6, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(7, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(8, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());

        //settings layer 2

        inventory.setItem(11, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(12, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(13, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(14, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(15, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(16, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(17, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());

        //settings layer 3

        inventory.setItem(20, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(21, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(22, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(23, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(24, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(25, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());
        inventory.setItem(26, new ItemBuilder(Material.ARROW).setDisplayName("§a?").setLocalizedName("spawn").build());

        player.openInventory(inventory);
        return false;
    }
}
