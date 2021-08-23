package com.dewgon.minigameapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static com.dewgon.minigameapi.Board.teams;

public class TestCommands implements CommandExecutor {
    private Board board;

    public TestCommands(Board board) {
        this.board = board;
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
            switch (commandType) {
                case "createTeam":
                    if (args[1] != null && args[2] != null) {
                        board.createTeam(args[1], args[2]);
                        System.out.println("Team created with name " + args[1] + " and color " + args[2]);
                    }
                    break;
                case "createBoard":
                    board.createBoard();
                    System.out.println("Board Created");
                    break;
                case "createObjective":
                    board.createObjective();
                    System.out.println("Objective Created");
                    break;
                case "createScore":
                    if (args[1] != null && args[2] != null) {
                        board.createScore(args[1], Integer.parseInt(args[2]));
                        System.out.println("Score created with details " + args[1] + " and " + args[2]);
                    }
                    break;
                case "assignTeam":
                    if (Bukkit.getPlayer(args[1]) != null) {
                        board.assignTeams(Bukkit.getPlayer(args[1]), teams.get(Integer.parseInt(args[2])));
                    }

            }
        }

        return false;
    }
}
