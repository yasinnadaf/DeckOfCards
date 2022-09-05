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

    void addPlayers(){
        int numOfPlayers;
        do{
            System.out.println("Enter number of players (2 to 4 ): ");
            numOfPlayers = sc.nextInt();
        }while (numOfPlayers < 2 || numOfPlayers > 4);
            for(int i = 0; i < numOfPlayers; i++){
                Player.addPlayer(new Player());
            }
            System.out.println(numOfPlayers+" players will play the game: ");
        }
    }