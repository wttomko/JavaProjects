import JavaDeck.Deck;

public class Blackjack {
    public static void main(String[] args){
        Deck D = new Deck("Normal");
        D.shuffleDeck();
        D.displayDeck();
    }
}
