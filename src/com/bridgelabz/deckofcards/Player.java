package com.bridgelabz.deckofcards;

import java.util.ArrayList;

public class Player {
    String[][] playerCards = new String[1][9];
    public static ArrayList<Player> playerList=new ArrayList<>();
    public static void addPlayer(Player player){
        playerList.add(player);
    }


}
