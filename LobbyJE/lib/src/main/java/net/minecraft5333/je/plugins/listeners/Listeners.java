package net.minecraft5333.je.plugins.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Listeners implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent e){
        if(e.getCause().equals(EntityDamageEvent.DamageCause.FALL)){
            e.setCancelled(true);
        }
    }
}
