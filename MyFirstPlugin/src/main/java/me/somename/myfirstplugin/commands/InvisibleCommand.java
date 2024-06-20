package me.somename.myfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class InvisibleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;

            if (p.isInvisible()) {
                p.setInvisible(false);
                p.sendMessage(ChatColor.RED + "You are no longer invisible.");
            }else {
                p.setInvisible(true);
                p.sendMessage(ChatColor.GREEN + "You are invisible.");
            }
        }

        return true;
    }
}
