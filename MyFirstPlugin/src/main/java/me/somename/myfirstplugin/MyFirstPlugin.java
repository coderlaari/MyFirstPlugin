package me.somename.myfirstplugin;

import me.somename.myfirstplugin.commands.FakeOpCommand;
import me.somename.myfirstplugin.commands.InvisibleCommand;
import me.somename.myfirstplugin.commands.ProtectCommand;
import me.somename.myfirstplugin.commands.TPCommand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("My First Plugin started!");
        getCommand("protect").setExecutor(new ProtectCommand());
        getCommand("invisible").setExecutor(new InvisibleCommand());
        getCommand("tp").setExecutor(new TPCommand());
        getCommand("fakeop").setExecutor(new FakeOpCommand());
    }
}
