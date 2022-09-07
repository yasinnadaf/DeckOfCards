package com.bridgelabz.deckofcards;

import java.util.Arrays;
import java.util.Scanner;

public class DeckOfCards {
    static String[] suits = new String[]{"Clubs", "Hearts", "Diamond", "Spades"};
    static String[] ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[][] deckOfCards = new String[4][13];
    static Scanner sc = new Scanner(System.in);

    public void initializeCards() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deckOfCards[i][j] = suits[i] + ' ' + ranks[j];
            }
        }
        printCards(deckOfCards);
    }

    public void printCards(String[][] cards) {
        System.out.println("Cards in deck: ");
        for (String[] card : cards) {
            System.out.println(Arrays.toString(card));
        }
    }

    void addPlayers() {
        int numOfPlayers;
        do {
            System.out.println("Enter number of players (2 to 4 ): ");
            numOfPlayers = sc.nextInt();
        } while (numOfPlayers < 2 || numOfPlayers > 4);
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("enter new player name");
            String playerName=sc.next();
            Player.addPlayer(new Player(playerName));
        }
        System.out.println(numOfPlayers + " players will play the game: ");
    }


    void changePlayerOrder(){
        System.out.println(Player.playerList);
        System.out.print("Do you want to change Player Order (y/n): ");

        if (sc.next().equalsIgnoreCase("y")){
            System.out.println("sequencing the Players order..");
            int n=Player.playerList.size();
            for (int i = 0; i < n; i++) {
                Player player=null;
                do {
                    System.out.println("enter player-" + (i + 1) + " name");
                    player = Player.getPlayer(sc.next());
                    swapPlayer(i, Player.playerList.indexOf(player));
                }while (player == null);

            }
        }

    }
    public void swapPlayer(int i, int j){
        Player player=Player.playerList.get(i);
        Player.playerList.add(i,Player.playerList.get(j));
        Player.playerList.add(j,player);
    }

}