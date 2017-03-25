import java.util.Random;
import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 25..
 */
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

    while (won == false)  {
      int userInput = input.nextInt();

      if (userInput > randomNumber) {
        System.out.println("Too high.");
      } else if (userInput < randomNumber)  {
        System.out.println("Too low.");
      } else  {
        won = true;
        System.out.println("Congratulations. You won!");
      }
    }









  }
}
