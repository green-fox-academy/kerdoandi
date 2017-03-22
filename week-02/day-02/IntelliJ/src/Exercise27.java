import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 22..
 */
public class Exercise27 {

  public static void main(String[] args) {
    System.out.println("Please enter a number: ");

    Scanner number = new Scanner(System.in);
    int row = number.nextInt();

    for (int x = 1; x <= row; x++) {

      for (int y = 1; y <= x; y++) {
        System.out.print("*");
      }

      System.out.println(" ");
    }
  }
}