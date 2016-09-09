/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deal;

/**
 *
 * http://introcs.cs.princeton.edu/java/14array/Deal.java.html
 */

public class Deal {
    public static void main(String[] args) {
        
        
        int GAMES = 100;
        int CARDS_PER_PLAYER = 4;

        // number of players
        int PLAYERS = 15;

        //String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        //String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] theseCards = { "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "H", "H", "H", "H", "C", "C", 
                                "C", "C", "A", "A", "A", "A", "2", "2","2", "2", "T", "T","T","T","N","N","N",
                                "N","D","D","D","D","F","F","S","S"};

        // avoid hardwired constants
        //int SUITS = suit.length;
        //int RANKS = rank.length;
        //int CARDS = SUITS * RANKS;
        int CARDS = 42;


        if (CARDS_PER_PLAYER * PLAYERS > CARDS) throw new RuntimeException("Too many players");


        // initialize deck
//        String[] deck = new String[CARDS];
//        for (int i = 0; i < RANKS; i++) {
//            for (int j = 0; j < SUITS; j++) {
//                deck[SUITS*i + j] = rank[i] + " of " + suit[j];
//            }
//        }
        for (int g =0; g < GAMES; g++){
            System.out.println("Game " + g);

            // shuffle
            for (int i = 0; i < CARDS; i++) {
                int r = i + (int) (Math.random() * (CARDS-i));
                String t = theseCards[r];
                theseCards[r] = theseCards[i];
                theseCards[i] = t;
            }

            // print shuffled deck
            for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
                System.out.println(theseCards[i]);
                if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1) System.out.println();
        }
        }
    }

}
