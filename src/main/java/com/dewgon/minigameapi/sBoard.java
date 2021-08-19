package com.dewgon.minigameapi;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class sBoard {

    org.bukkit.scoreboard.Scoreboard board = createBoard();

    public Scoreboard createBoard() {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        return manager.getNewScoreboard();
    }
    public Objective createObjective() {

        Objective objective = board.registerNewObjective("Title", "dummy", "test.xyz");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        return objective;
    }



    public Team createTeam(String name, String colour) {

        Team team = board.registerNewTeam(name);
        ChatColor color = ChatColor.valueOf(colour.toUpperCase());
        team.setDisplayName(color + StringUtils.capitalize(colour));
        team.setColor(color);
        return team;
    }
    public void createScore(String entry, int x) {

        createObjective().getScore(entry).setScore(x);
    }
    public void assignTeams(Player player, Team team){
        team.addEntry(player.getDisplayName());

    }
}
