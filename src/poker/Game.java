package poker;

import java.util.Random;

public class Game {
    public static Random random = new Random();

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.genereitNewDeck();
        deck.printDeck();

    }
}
