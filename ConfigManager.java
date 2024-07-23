package main.java.com.example.windcharge;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

    private WindChargePlugin plugin;

    public ConfigManager(WindChargePlugin plugin) {
        this.plugin = plugin;
    }

    public void reloadConfig() {
        plugin.reloadConfig();
        FileConfiguration config = plugin.getConfig();
        // Atualizar variáveis de configuração
    }
}
