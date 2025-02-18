package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public String name;
    public List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}