import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 22..
 */
public class Exercise29 {
  public static void main(String[] args) {
    System.out.println("Please enter an even number: ");

    Scanner number = new Scanner(System.in);
    int row = number.nextInt();

    for (int x = 0; x < row; x++) {
      for (int y = row - 1 - x; y > 0; y--) {
        System.out.print(" ");
      }

      for (int m = (2*x) + 1; m > 0; m--) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int x = row - 1; x > 0; x--) {
      for (int y = row - x; y > 0; y--) {
        System.out.print(" ");
      }

      for (int m = (2*x) - 1; m > 0; m--) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}