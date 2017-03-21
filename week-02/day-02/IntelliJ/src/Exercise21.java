import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise21 {
  public static void main(String[] args) {

    System.out.println("Please enter two numbers: ");

    Scanner number = new Scanner(System.in);
    int y = number.nextInt();
    int x = number.nextInt();

    if (x == y && (x+y) > 20 ) {
      System.out.println("The party is exellent!");
    } else if ( x != y && (x+y) > 20 ) {
      System.out.println("Quite cool party!");
    } else if ( (x+y) < 20 ) {
      System.out.println("Average party...");
    } else if (y == 0) {
      System.out.println("Sausage party");
    } else {
      System.out.println("Party");
    }
  }
}
