import java.util.Scanner;

public class Exercise28 {
  public static void main(String[] args) {
    System.out.println("Please enter an even number: ");

    Scanner number = new Scanner(System.in);
    int row = number.nextInt();

    for (int x = 0; x < row; x++) {

      for (int y = row - 1 - x; y >= 0; y--) {
        System.out.print(" ");
      }

      for (int y = (2*x) + 1; y > 0; y--) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}