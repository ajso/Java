package PokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DeckList {

    private final List<Card> cards = new ArrayList<>();

    public DeckList() {
        for (Suit suit:Suit.values()) {
            for (CardRanks rank:CardRanks.values()) {
                cards.add(new Card(suit,rank));
            }
        }
        //shuffle the cards
        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        if(cards.isEmpty()){
            throw new IllegalStateException("The Deck is Empty");
        }
        return cards.remove(0);
    }
}
