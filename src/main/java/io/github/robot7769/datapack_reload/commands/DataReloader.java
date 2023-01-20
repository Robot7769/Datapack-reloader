package io.github.robot7769.datapack_reload.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DataReloader implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("datapack.reload")) {
                player.sendMessage("§4Reloading datapacks...");
                Bukkit.reloadData();
                player.sendMessage("§aDatapack reloaded");
                return true;
            }
        }
        return false;
    }
}
