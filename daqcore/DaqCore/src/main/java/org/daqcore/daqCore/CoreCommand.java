package org.daqcore.daqCore;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CoreCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Check if the sender is a player
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // Handle /core and /eventcore commands
            if (command.getName().equalsIgnoreCase("core") || command.getName().equalsIgnoreCase("eventcore")) {
                // Broadcast the message to all players
                sender.getServer().broadcastMessage(ChatColor.GREEN + "----------" + ChatColor.GREEN + "DAQ-CORE" + ChatColor.GREEN + "-------------");
                sender.getServer().broadcastMessage(ChatColor.GREEN + "-------" + ChatColor.GREEN + "VERSION: 1.0" + ChatColor.GREEN + "---------");
                sender.getServer().broadcastMessage(ChatColor.GREEN + "--" + ChatColor.GREEN + "OWNER OF THE CORE: Daqzy" + ChatColor.GREEN + "--");
                sender.getServer().broadcastMessage(ChatColor.GREEN + "--" + ChatColor.GREEN + "CONTACT: " + ChatColor.YELLOW + "DAQZY_ IN DISCORD" + ChatColor.GREEN + "--");

                // Play a success sound
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.5f);
                return true; // Command executed successfully
            }
        }

        // If sender is not a player (console), just broadcast the message
        sender.getServer().broadcastMessage(ChatColor.GREEN + "----------" + ChatColor.GREEN + "DAQ-CORE" + ChatColor.GREEN + "-------------");
        sender.getServer().broadcastMessage(ChatColor.GREEN + "-------" + ChatColor.GREEN + "VERSION: 1.0" + ChatColor.GREEN + "---------");
        sender.getServer().broadcastMessage(ChatColor.GREEN + "--" + ChatColor.GREEN + "OWNER OF THE CORE: Daqzy" + ChatColor.GREEN + "--");
        sender.getServer().broadcastMessage(ChatColor.GREEN + "--" + ChatColor.GREEN + "CONTACT: " + ChatColor.YELLOW + "DAQZY_ IN DISCORD" + ChatColor.GREEN + "--");

        // Play an error sound if an invalid command is used
        if (!(command.getName().equalsIgnoreCase("core") || command.getName().equalsIgnoreCase("eventcore"))) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0f, 1.0f);
                player.sendMessage(ChatColor.RED + "Invalid command! Use /core or /eventcore.");
            }
            return false; // Command was incorrect
        }

        return false;
    }
}
