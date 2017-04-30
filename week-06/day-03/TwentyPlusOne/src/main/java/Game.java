import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffleDeck();
    playGame(deck);
  }

  public static void playGame(Deck deck) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int opponentScore = random.nextInt(22) + 15;
    int sumOfCards = 0;

    for (int i = 0; i < 2; i++) {
      sumOfCards += pullCard(deck);
      System.out.println(sumOfCards);
    }
    System.out.println("Would you like to continue?");
    while (sumOfCards < 22 && stopOrCont(scanner.nextLine()) != false) {
      sumOfCards += pullCard(deck);
      System.out.println(sumOfCards);
      if (sumOfCards <= 21) {
        System.out.println("Would you like to continue?");
      }
    }

    if (21 < sumOfCards || sumOfCards < opponentScore) {
      String tempFormat = "You've lost. Your score is %d, the opponent's score is %d.";
      String.format(tempFormat, sumOfCards, opponentScore);
    } else {
      String tempFormat = "Congrats, you've won. Your score is %d, the opponent's score is %d.";
      String.format(tempFormat, sumOfCards, opponentScore);

    }
  }

  public static int pullCard(Deck deck) {
    Card pulledCard = deck.pullFirst();
    System.out.println(pulledCard);
    return pulledCard.getCardValue();
  }

  public static boolean stopOrCont(String userInput) {
    if (userInput.equals("yes")) {
      return true;
    } else {
      return false;
    }
  }
}
