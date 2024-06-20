package me.somename.myfirstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class FakeOpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("Usage: /fakeop <player>");
            return false;
        }

        Player target = Bukkit.getPlayerExact(args[0]);

        if (target == null) {
            sender.sendMessage("Player not found.");
            return true;
        }

        target.sendMessage(ChatColor.ITALIC + "" + ChatColor.GRAY + "[Server: Made " + target.getName() + " a server operator]");
        sender.sendMessage( ChatColor.GREEN + target.getName() + " has been fake-opped.");

        return true;
    }
}
