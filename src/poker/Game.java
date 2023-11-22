package poker;

import java.util.Arrays;
import java.util.Random;

public class Game {
   public static Random random = new Random();
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.genereitNewDeck();
        deck.printDeck();

    }
    private static Card getRandomCard(String[] ranks, Suit[] suits){
        int rankChoice = random.nextInt(13);
        int suitChoice = random.nextInt(4);
        return new Card(suits[suitChoice], ranks[rankChoice]);
    }

}
