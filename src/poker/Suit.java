package poker;

public enum Suit {
    HEARTS("\u2660"), TILES("\u2665"), CLOVES("\u2666"), PIKES("\u2663");

    private final String cardSuit;

    Suit(String suit) {
        this.cardSuit = suit;
    }

    public String getCardSuit() {
        return cardSuit;
    }


}
