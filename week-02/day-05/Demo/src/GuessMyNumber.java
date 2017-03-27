import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
  public static void main(String[] args) {
    HashMap<String, Integer> levelsWithLivesMap = new HashMap<String, Integer>();
    levelsWithLivesMap.put("beginner", 15);
    levelsWithLivesMap.put("intermediate", 10);
    levelsWithLivesMap.put("advanced", 5);

    System.out.println("You can choose from 3 difficulty levels: \n\t- beginner\n\t- intermediate\n\t- advanced\n\nPlease enter the difficulty level:");

    Scanner levelScanner = new Scanner(System.in);
    String level = levelScanner.nextLine();

    while (!levelsWithLivesMap.containsKey(level)) {
      System.out.println("Please enter the correct level name:");
      level = levelScanner.nextLine();
    }

    int lives = levelsWithLivesMap.get(level);

    System.out.println("\nPlease enter a number which will be the maximum of the range:");
    Scanner rangeScanner = new Scanner(System.in);
    while (!rangeScanner.hasNextInt()) {
      rangeScanner.nextLine();
      System.out.println("Please enter a number: ");
    }
    int maxNumber = rangeScanner.nextInt();
    int minNumber = 1;

    Random rn = new Random();
    int randomNumber = rn.nextInt(maxNumber - minNumber +1) + minNumber;

    System.out.println("\nOk, let's play. I've the number between 1-" + maxNumber + ". You have " + lives + " lives.");

    boolean won = false;
    while (won == false && lives > 0)  {
      Scanner inputScanner = new Scanner(System.in);
      while (!inputScanner.hasNextInt()) {
        inputScanner.nextLine();
        System.out.println("Please enter a number: ");
      }
      int userInput = inputScanner.nextInt();

      if (userInput > randomNumber) {
        lives--;
        System.out.println("Too high. You have " + lives + " lives left.");
      } else if (userInput < randomNumber)  {
        lives--;
        System.out.println("Too low. You have " + lives + " lives left.");
      } else  {
        won = true;
        System.out.println("Congratulations. You won!");
      }
    }
    if (won == false) {
      System.out.println("You have lost.");
    }
  }
}
