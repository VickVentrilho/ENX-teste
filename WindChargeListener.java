package main.java.com.example.windcharge;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class WindChargeListener implements Listener {

    private WindChargePlugin plugin;

    public WindChargeListener(WindChargePlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent event) {
        event.getEntity().setVelocity(event.getEntity().getVelocity().multiply(plugin.getProjectileSpeed()));
        // Adicionar lógica para explosão e partículas
    }
}
