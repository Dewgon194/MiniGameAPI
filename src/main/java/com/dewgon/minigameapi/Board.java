package com.dewgon.minigameapi;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    org.bukkit.scoreboard.Scoreboard board = createBoard();
    public ArrayList<Team> teams = new ArrayList<>();
    Objective objective;

    public Team callTeam(int num){
        return teams.get(num);
    }
    public Scoreboard createBoard() {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        return manager.getNewScoreboard();
    }
    public Objective createObjective(String name, String title) {

        objective = board.registerNewObjective(name, "dummy", title);
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
        objective.getScore(entry).setScore(x);
    }
    public void assignTeams(Player player, Team team){
        team.addEntry(player.getDisplayName());

    }
    public void updateBoard(){
        ArrayList<Player> players = new ArrayList<>(Bukkit.getOnlinePlayers());
        for (int x = 0; x < players.size();){
            Player player = players.get(x);
            player.setScoreboard(board);
            x= x + 1;
        }

    }
}
