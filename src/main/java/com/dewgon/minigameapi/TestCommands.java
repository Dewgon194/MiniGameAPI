package com.dewgon.minigameapi;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TestCommands implements CommandExecutor {
    private sBoard sboard;

    public TestCommands(sBoard sboard) {
        this.sboard = sboard;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 3) {
            sender.sendMessage(ChatColor.RED + "Too many arguments!");
            return true;
        } else if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "Too few arguments!");
        } else if (args.length == 3) {
            if (args[0].equals("sBoard")) {
                String commandType = args[1];
                switch(commandType){
                    case "createTeam":
                        break;
                    case "createBoard":
                        break;
                    case "createObjective":
                        break;

                }
            }

        }
        return false;
    }
}
