package com.dewgon.minigameapi.utils;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.ScoreboardManager;

public class Scoreboard {

    public org.bukkit.scoreboard.Scoreboard createBoard() {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard board = manager.getNewScoreboard();
        board.registerNewObjective("Title", "dummy", "test.xyz");
        return board;
    }

    org.bukkit.scoreboard.Scoreboard board = createBoard();

    public void createTeam(String name) {
        board.registerNewTeam(name);
    }

    public void createScore() {

    }


}
