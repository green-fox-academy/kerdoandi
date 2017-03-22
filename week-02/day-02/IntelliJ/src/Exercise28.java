import java.util.Scanner;

public class Exercise28 {
  public static void main(String[] args) {
    System.out.println("Please enter a number: ");

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
  }
}