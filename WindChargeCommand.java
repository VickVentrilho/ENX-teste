package main.java.com.example.windcharge;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WindChargeCommand implements CommandExecutor {

    private WindChargePlugin plugin;

    public WindChargeCommand(WindChargePlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Lógica para o comando WindCharge
        return false;
    }
}
