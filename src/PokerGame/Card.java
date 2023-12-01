package PokerGame;

public class Card {

    private final Suit suit;
    private final CardRanks rank;

    public Card(Suit suit, CardRanks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString(){
        return rank  +" of " + suit;
    }
}
