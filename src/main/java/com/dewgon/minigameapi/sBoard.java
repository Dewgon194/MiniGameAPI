package com.dewgon.minigameapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.*;

import java.util.Locale;

public class sBoard {

    public Scoreboard createBoard() {

        ScoreboardManager manager = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard board = manager.getNewScoreboard();
        return board;
    }
    public Objective createObjective(){

        Objective objective = board.registerNewObjective("Title", "dummy", "test.xyz");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        return objective;
    }

    org.bukkit.scoreboard.Scoreboard board = createBoard();

    public void createTeam(String name, String colour) {

        Team team = board.registerNewTeam(name);
        team.canSeeFriendlyInvisibles();
        switch (colour.toUpperCase()){
            case "AQUA":
                team.setDisplayName(ChatColor.AQUA + "Aqua");
                team.setColor(ChatColor.AQUA);
                break;
            case "BLACK":
                team.setDisplayName(ChatColor.BLACK + "Black");
                team.setColor(ChatColor.BLACK);
                break;
            case "BLUE":
                team.setDisplayName(ChatColor.BLUE + "Blue");
                team.setColor(ChatColor.BLUE);
                break;
            case "GOLD":
                team.setDisplayName(ChatColor.GOLD + "Gold");
                team.setColor(ChatColor.GOLD);
                break;
            case "GRAY":
                team.setDisplayName(ChatColor.GRAY + "Gray");
                team.setColor(ChatColor.GRAY);
                break;
            case "GREEN":
                team.setDisplayName(ChatColor.GREEN + "Green");
                team.setColor(ChatColor.GREEN);
                break;
            case "RED":
                team.setDisplayName(ChatColor.RED + "Red");
                team.setColor(ChatColor.RED);
                break;
            case "WHITE":
                team.setDisplayName(ChatColor.WHITE + "White");
                team.setColor(ChatColor.WHITE);
                break;
            case "YELLOW":
                team.setDisplayName(ChatColor.YELLOW + "Yellow");
                team.setColor(ChatColor.YELLOW);
                break;
            case "PINK":
                team.setDisplayName(ChatColor.LIGHT_PURPLE + "Pink");
                team.setColor(ChatColor.LIGHT_PURPLE);
                break;

        }


    }

    public void createScore(int x, int y) {

        createObjective().getScore("Red Team Wool").setScore(x);
        createObjective().getScore("Blue Team Wool").setScore(y);
    }


}
