package poker;

import java.util.Random;

public class Deck {
    static Random random = new Random();
    String[] ranks;
    Suit[] suits;
    Card[] cards;

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void genereitNewDeck() {
        int cardCounter = 0;
        ranks = getRanksArray();
        suits = getSuitsArray();
        cards = new Card[52];

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[cardCounter++] = new Card(suits[i], ranks[j]);
            }
        }
    }

    public Suit[] getSuitsArray() {
        return new Suit[]{Suit.HEARTS, Suit.PIKES, Suit.CLOVES, Suit.TILES};

    }

    private String[] getRanksArray() {
        String[] ranks = new String[13];
        for (int i = 0; i < ranks.length; i++) {
            int choice = random.nextInt(13);
            switch (choice) {
                case 0:
                    ranks[i] = "2";
                    break;
                case 1:
                    ranks[i] = "3";
                    break;
                case 2:
                    ranks[i] = "4";
                    break;
                case 3:
                    ranks[i] = "5";
                    break;
                case 4:
                    ranks[i] = "6";
                    break;
                case 5:
                    ranks[i] = "7";
                    break;
                case 6:
                    ranks[i] = "8";
                    break;
                case 7:
                    ranks[i] = "9";
                    break;
                case 8:
                    ranks[i] = "10";
                    break;
                case 9:
                    ranks[i] = "J";
                    break;
                case 10:
                    ranks[i] = "Q";
                    break;
                case 11:
                    ranks[i] = "K";
                    break;
                case 12:
                    ranks[i] = "A";
                    break;
                default:
                    System.out.println("ошибка");
            }
        }
        return ranks;
    }
}
