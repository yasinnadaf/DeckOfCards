package com.bridgelabz.deckofcards;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeckOfCards {
    static String[] suits = new String[]{"Clubs", "Hearts", "Diamond", "Spades"};
    static String[] ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[][] deckOfCards = new String[4][13];

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
}