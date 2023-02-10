package de.airoyster.fly.commands;

import de.airoyster.fly.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly_CMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Main.con);
            return false;
        }
        Player p = (Player) sender;

        if (p.hasPermission("system.fly")) {
            if (args.length == 0) {
                if (!p.getAllowFlight()) {
                    p.setAllowFlight(true);
                    p.setFlying(true);
                    p.sendMessage(Main.prefix + "§6Fly §aactivatet!");
                } else {
                    p.setAllowFlight(false);
                    p.setFlying(false);
                    p.sendMessage(Main.prefix + "§6Fly §adeactivatet!");
                }
            } else {
                sender.sendMessage(Main.prefix + "§cError! §aplease use '/fly'");
            }
        } else {
            p.sendMessage(Main.noPerms);
        }
        return false;
    }
}