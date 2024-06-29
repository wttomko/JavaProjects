package JavaDeck;

import java.util.*;
// Deck class
public class Deck{
    ArrayList<Card> deck = new ArrayList<Card>();
    public Deck(String mod){
        //Create Arraylists of all aspects of a single card
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        ArrayList<String> ids = new ArrayList<String>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        // Powers my come in handy for certain games
        ArrayList<String> powers = new ArrayList<String>();

        if (mod=="Normal"){

            Collections.addAll(ids, "2", "3", "4", "5", "6", "7", "8", "9", "Ten", "Jack", "Queen", "King", "Ace");
            Collections.addAll(values, 2,3,4,5,6,7,8,9,10,10,10,10,11);
            for (int i=0; i<13; i++){
                Collections.addAll(powers, "N/A");
            }
        }

        for (int s=0; s<suits.length; s++){
            for (int i=0; i<ids.size(); i++){
                deck.add(new Card(ids.get(i), suits[s], values.get(i), powers.get(i)));
            }
        }
    }

    // Debugging method, print the entire deck to the console - using the method in Card.java
    public void displayDeck(){
        for (int i=0; i<deck.size(); i++){
            deck.get(i).displayCard();
        }
    }
}
