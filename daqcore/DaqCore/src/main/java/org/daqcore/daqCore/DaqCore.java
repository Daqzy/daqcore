package org.daqcore.daqCore;

import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.ChatColor; // This is required for color codes!

public final class DaqCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "----------" + ChatColor.GREEN + "DAQ-CORE" + ChatColor.GREEN + "-------------");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "-------" + ChatColor.GREEN + "VERSION: 1.0" + ChatColor.GREEN + "---------");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--" + ChatColor.GREEN + "OWNER OF THE CORE: Daqzy" + ChatColor.GREEN + "--");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--" + ChatColor.GREEN + "CONTACT: " + ChatColor.YELLOW + "DAQZY_ IN DISCORD" + ChatColor.GREEN + "--");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "----------" + ChatColor.GREEN + "DAQ-CORE" + ChatColor.GREEN + "-------------");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "-------" + ChatColor.GREEN + "VERSION: 1.0" + ChatColor.GREEN + "---------");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--" + ChatColor.GREEN + "OWNER OF THE CORE: Daqzy" + ChatColor.GREEN + "--");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--" + ChatColor.GREEN + "CONTACT: " + ChatColor.YELLOW + "DAQZY_ IN DISCORD" + ChatColor.GREEN + "--");
    }
}