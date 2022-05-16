package dev.strafeland.club.signrefill;

import dev.strafeland.club.signrefill.listeners.PotionSignListener;
import dev.strafeland.club.signrefill.listeners.SoupSignListener;
import dev.strafeland.club.signrefill.listeners.TrashSignListener;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main instance;

    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[SignRefill]" + ChatColor.GREEN + " Plugin has been enabled successfully.");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "  / ____| | | | ____ | \\l| |                ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + " | (___   | | | |  __|  \\| |                ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "  \\___|  | | | | |_ | . `  |                ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "  ____)|  | | | |__| | |\\  |                ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + " |_____/  |_| \\_____|_|_\\_|                ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + " |  __ \\ |  ____|  ____|_   _| |    | |     ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + " | |__)|| | |__  | |__    | | | |    | |     ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + " |  _  /  |  __| |  __|   | | | |    | |     ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + " | | \\ \\| |____| |     _| |_| |____| |____ ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + " |_|  \\_\\______|_|    |_____|______|______|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Created by zNotHydr0 :)");
        instance = this;
        this.registerListeners();

    }

    private void registerListeners() {
        PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents(new PotionSignListener(this), this);
        manager.registerEvents(new SoupSignListener(this), this);
        manager.registerEvents(new TrashSignListener(this), this);

    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "[SignRefill]" + ChatColor.RED + "Plugin has been disabled successfully.");
    }

    public static Main getInstance() {
        return instance;

    }
}
