package com.example.user.dartsplayers;


import java.util.ArrayList;

/**
 * Created by user on 12/12/2016.
 */
public class Ranking {

    private ArrayList<Player> rankings;

    public Ranking() {
        this.rankings = new ArrayList<Player>();
    }

    public int countPlayers() {
        return rankings.size();
    }

    public void addPlayerByIndex(Player player) {
        int index = (player.getRanking() - 1);
        rankings.add(index, player);
    }

    public String getPlayerByRanking(int rank) {
        int index = (rank - 1);
        Player player = rankings.get(index);
        return player.toString();
    }

    public void replaceLastPlayer(Player player) {
        int index = (countPlayers() - 1);
        rankings.remove(index);
        addPlayerByIndex(player);
    }

    public String getPlayerByName(String name) {
        for (Player player : rankings) {
            if (player.getName().equals(name)) {
                return player.toString();
            }
        }
                return "No such player";
            }
}









