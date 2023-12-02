package PokerGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private final List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void receiveCard(Card card){
        hand.add(card);
    }

    public List<Card> getHand(){
        return hand;
    }

    public String toString(){
        return name +"'s hand: "+hand;
    }
}
