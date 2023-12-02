package PokerGame;

import java.util.Scanner;

public class PokerGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //create a deck object for our deck
        DeckList deckList = new DeckList();

        //create players of the game.
        Player player1 = new Player("Andrew");
        Player player2 = new Player("Esther");

    }

    static void dealIntialCards(DeckList deckList, Player player1, Player player2){

    }
}
