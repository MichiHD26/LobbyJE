package net.minecraft5333.je.plugins;

import net.minecraft5333.je.plugins.Inventory.hotbar;
import net.minecraft5333.je.plugins.commands.StartInventory;
import net.minecraft5333.je.plugins.commands.TeleportCommand;
import net.minecraft5333.je.plugins.commands.TeleportInventory;
import net.minecraft5333.je.plugins.commands.start.SettingsInventory;
import net.minecraft5333.je.plugins.listeners.BlockListener;
import net.minecraft5333.je.plugins.listeners.InventoryListener;
import net.minecraft5333.je.plugins.listeners.JoinQuitListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        //start
        System.out.println(ChatColor.GREEN +"Der Plugin startet");

        //commands
        getCommand("start").setExecutor(new StartInventory());
        getCommand("warp").setExecutor(new TeleportInventory());
        getCommand("settings").setExecutor(new SettingsInventory());

        //commands hub

        getCommand("hub").setExecutor(new TeleportCommand());
        getCommand("lobby").setExecutor(new TeleportCommand());
        getCommand("home").setExecutor(new TeleportCommand());

        //listener

        Bukkit.getPluginManager().registerEvents(new JoinQuitListener(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryListener(),this);
        Bukkit.getPluginManager().registerEvents(new hotbar(),this);
        Bukkit.getPluginManager().registerEvents(new BlockListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
