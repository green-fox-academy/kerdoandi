import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
  List<Card> deck = new ArrayList<>();
  int deckInitSize;

  public Deck() {
    deckInitSize = Card.CardColor.values().length * Card.Suit.values().length * Card.Rank.values().length;
    fillDeck();
  }

  public void fillDeck() {
    for (Card.CardColor color : Card.CardColor.values()) {
      for (Card.Suit suit : Card.Suit.values()) {
        for (Card.Rank rank : Card.Rank.values()) {
          deck.add(new Card(color, suit, rank));
        }
      }
    }
  }

  public List<Card> getDeck() {
    return deck;
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

  public Card pullFirst() {
    Card firstCard = deck.get(0);
    deck.remove(firstCard);
    return firstCard;
  }

  public Card pullLast() {
    Card lastCard = deck.get(deck.size() - 1);
    deck.remove(deck.get(deck.size() - 1));
    return lastCard;
  }

  public Card pullRandom() {
    Random random = new Random();
    int randomCardIndex = random.nextInt(deck.size());
    Card randomCard = deck.get(randomCardIndex);
    deck.remove(randomCard);
    return randomCard;
  }

  public int getDeckSize() {
    return deck.size();
  }
}
