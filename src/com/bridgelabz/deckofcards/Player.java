package com.bridgelabz.deckofcards;

import java.util.ArrayList;

public class Player {
    String name;
    String[][] playerCards = new String[1][9];
    public static ArrayList<Player> playerList = new ArrayList<>();

    public static void addPlayer(Player player) {
        playerList.add(player);
    }

    public Player(String name) {
        this.name = name;
    }

    public static Player getPlayer(String name) {
        Player player1 = null;
        for (Player player : playerList) {
           if(player.name.equalsIgnoreCase(name)){
               player1 = player;
               break;
           }

        }
        return  player1;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}