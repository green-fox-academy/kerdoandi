import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise19 {
  public static void main(String[] args) {

    System.out.println("Please enter a numbers: ");

    Scanner number = new Scanner(System.in);
    int x = number.nextInt();

    if (x <= 0) {
      System.out.println("Not enough");
    } else if (x == 1) {
      System.out.println("One");
    } else if (x == 2) {
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }
  }
}
