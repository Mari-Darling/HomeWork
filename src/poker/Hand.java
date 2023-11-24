package poker;

public class Hand {
    Card[] handCards = new Card[5];
    Deck deck = new Deck();

    public void dealingCards() {
        deck.genereitNewDeck();
        int counter = 0;
        while (counter < 5) {
            Card card = deck.getRandomCard();
            if (card.isAvalible()) {
                handCards[counter] = card;
                card.setAvalible(false);
                counter++;
            }
        }

    }

    public void showHand() {
        int i = 0;
        for (; i < handCards.length - 1; i++) {
            System.out.printf("%-15d|", i);
        }
        System.out.printf("%-15d%n", i);

        for (i = 0; i < handCards.length - 1; i++) {
            System.out.printf("%-15s|", handCards[i]);
        }
        System.out.printf("%-15s%n", handCards[i]);
    }

    public void changeCards(String[] cardNumbers) {
        System.out.print("Будут заменены карты с номерами: ");
        for (String cardNumber : cardNumbers) {
            System.out.print(cardNumber + " ");
            while (true) {
                Card card = deck.getRandomCard();
                if (card.isAvalible()) {
                    // вызвать returnCard?
                    handCards[Integer.parseInt(cardNumber) - 1] = card;
                    card.setAvalible(false);
                    break;
                }
            }
        }
        System.out.println();
    }

    public void returnCard(String cardNumber) {
        Card cardToReturn = handCards[Integer.parseInt(cardNumber) - 1];
        System.out.println("вы возвращаете карту");
        System.out.printf("номер карты: %s карта: %s%n", cardNumber, cardToReturn);
        deck.returnCard(cardToReturn);
    }
}
