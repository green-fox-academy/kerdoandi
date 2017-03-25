import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
  public static void main(String[] args) {

    System.out.println("Please enter the range");
    Scanner input = new Scanner(System.in);
    int maxNumber = input.nextInt();
    int minNumber = 1;

    Random rn = new Random();
    int randomNumber = rn.nextInt(maxNumber - minNumber +1) + minNumber;
    System.out.println(randomNumber);

    System.out.println("I've the number between 1-100. You have 5 lives.");

    boolean won = false;
    int lives = 5;

    while (won == false && lives > 0)  {
      int userInput = input.nextInt();

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
