import java.util.ArrayList;
import java.util.List;

public class Deck {
  List<Card> deck;
  int deckSize;

  public Deck() {
    deck = new ArrayList<>();
    deckSize = Card.CardColor.values().length * Card.Suit.values().length * Card.Rank.values().length;
    fillDeck();
  }

  public void fillDeck() {
    for (Card.CardColor color : Card.CardColor.values()) {
      for (Card.Suit suit : Card.Suit.values()) {
        for (Card.Rank rank : Card.Rank.values()) {
          if (deck.size() < deckSize) {
            deck.add(new Card(color, suit, rank));
          }
        }
      }
    }
  }
}
