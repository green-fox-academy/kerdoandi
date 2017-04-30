public class Card {
  enum CardColor {RED, BLACK}
  enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}
  enum Rank {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);
    private final int value;
    Rank(int value) {
      this.value = value;
    }
  }

    CardColor cardColor;
    Suit suit;
    Rank rank;

  public Card(CardColor cardColor, Suit suit, Rank rank) {
    this.cardColor = cardColor;
    this.suit = suit;
    this.rank = rank;
  }
}
