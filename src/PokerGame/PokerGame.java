package PokerGame;

import java.util.List;
import java.util.Scanner;

public class PokerGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //create a deck object for our deck
        DeckList deckList = new DeckList();

        //create players of the game.
        Player player1 = new Player("Andrew");
        Player player2 = new Player("Esther");

        //deal Initial cards to players.
        dealIntialCards(deckList, player1, player2);

        //display player hands
        System.out.println(player1);
        System.out.println(player2);

        Player winner = determineWinner(player1,player2);

        //display the winner
        System.out.println(" The winner is "+winner);

    }

    static void dealIntialCards(DeckList deckList, Player player1, Player player2){

        for(int i = 0; i<5; i++){
            player1.receiveCard(deckList.dealCard());
            player2.receiveCard(deckList.dealCard());
        }
    }

    private static Player determineWinner(Player player1, Player player2){
        return compareHands(player1.getHand(), player2.getHand()) > 0 ? player1:player2;
    }

    private static int compareHands(List<Card> hand1, List<Card> hand2) {
        return hand2.get(0).rank.ordinal() - hand1.get(0).rank.ordinal();
    }
}
