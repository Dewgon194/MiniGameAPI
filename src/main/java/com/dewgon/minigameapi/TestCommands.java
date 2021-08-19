package com.dewgon.minigameapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scoreboard.Team;

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
                String commandType = args[0];
                switch(commandType){
                    case "createTeam":
                        Team team = sboard.createTeam(args[1], args[2]);
                        break;
                    case "createBoard":
                        sboard.createBoard();
                        break;
                    case "createObjective":
                        sboard.createObjective();
                        break;
                    case "createScore":
                        sboard.createScore(args[1], Integer.parseInt(args[2]));
                        break;
                    case "assignTeam":
                        sboard.assignTeams(Bukkit.getPlayer(args[1]),);

                }
            }

        return false;
    }
}
