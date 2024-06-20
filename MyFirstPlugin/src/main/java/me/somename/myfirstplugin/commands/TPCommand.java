package me.somename.myfirstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TPCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;

            if (args.length == 0) {
                p.sendMessage(ChatColor.RED + "You forgot the player you want to teleport to!");
            }else{
                String playername = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playername);

                p.teleport(target);
                target.sendMessage(ChatColor.RED + "Player named " + playername + " teleported to you!");
            }
        }
        return true;
    }
}
