package me.xixun.lslor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender negr, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("left")) {
            negr.sendMessage("block lefted to " + args[0]);
        }

        return false;
    }
}
