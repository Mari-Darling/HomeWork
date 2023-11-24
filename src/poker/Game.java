package poker;

import java.util.Random;

public class Game {
    public static Random random = new Random();

    public static void main(String[] args) {
        // Deck deck = new Deck();
        // deck.genereitNewDeck();
        // deck.printDeck();

        Helper helper = new Helper();
        Hand hand = new Hand();
        hand.dealingCards();
        hand.showHand();
        helper.askToChangeCards(hand);
        hand.showHand();
        if (new WinningCombinations().isFlash(hand.handCards)) {
            System.out.println("Flash!");
        }

    }
}
