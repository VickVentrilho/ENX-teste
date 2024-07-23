package main.java.com.example.windcharge;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class WindChargePlugin extends JavaPlugin {

    private double explosionStrength;
    private boolean enableParticles;
    private double projectileSpeed;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        FileConfiguration config = getConfig();
        explosionStrength = config.getDouble("explosionStrength");
        enableParticles = config.getBoolean("enableParticles");
        projectileSpeed = config.getDouble("projectileSpeed");

        getCommand("windcharge").setExecutor(new WindChargeCommand(this));
        Bukkit.getPluginManager().registerEvents(new WindChargeListener(this), this);
    }

    public double getExplosionStrength() {
        return explosionStrength;
    }

    public boolean isEnableParticles() {
        return enableParticles;
    }

    public double getProjectileSpeed() {
        return projectileSpeed;
    }
}