import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise20 {
  public static void main(String[] args) {

    System.out.println("Please enter two numbers: ");

    Scanner number = new Scanner(System.in);
    int x = number.nextInt();
    int y = number.nextInt();

    if (x < y) {
      System.out.println("The bigger nr is " + y);
    } else if (x > y) {
      System.out.println("The bigger nr is " + x);
    } else {
      System.out.println("x=y");
    }
  }
}
