package com.dewgon.minigameapi;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

import java.util.List;

public class Board {

    org.bukkit.scoreboard.Scoreboard board = createBoard();
    public static List<Team> teams;

    public Scoreboard createBoard() {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        return manager.getNewScoreboard();
    }
    public Objective createObjective() {

        Objective objective = board.registerNewObjective("Title", "dummy", "test.xyz");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        return objective;
    }



    public void createTeam(String name, String colour) {

        Team team = board.registerNewTeam(name);
        ChatColor color = ChatColor.valueOf(colour.toUpperCase());
        team.setDisplayName(color + StringUtils.capitalize(colour));
        team.setColor(color);
        teams.add(team);
    }
    public void createScore(String entry, int x) {

        createObjective().getScore(entry).setScore(x);
    }
    public void assignTeams(Player player, Team team){
        team.addEntry(player.getDisplayName());

    }
}
