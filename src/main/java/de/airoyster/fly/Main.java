package de.airoyster.fly;

import de.airoyster.fly.commands.Fly_CMD;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static String noPerms = ChatColor.AQUA + "Fly- §cFor this you don't have permissions!";
    public static String con = ChatColor.RED + "The Console can't use the command!";
    public static String prefix = ChatColor.AQUA + "Fly- ";

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("fly").setExecutor(new Fly_CMD());
        Bukkit.getConsoleSender().sendMessage("§aFly- §eactivatet!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("§aFly- §edeactivatet!");
    }
}
