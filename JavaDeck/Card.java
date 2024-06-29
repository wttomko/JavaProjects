package JavaDeck;

public class Card {
    String id;
    String suit;
    int value;
    String power;
    
    public Card(String id, String suit, int value, String power){
        this.id=id;
        this.suit=suit;
        this.value=value;
        this.power=power;
    }
    public void displayCard(){
        System.out.println(this.id + " of " + this.suit);
    }
}
