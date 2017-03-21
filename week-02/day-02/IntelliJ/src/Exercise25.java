import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise25 {
  public static void main(String[] args) {

    System.out.println("Please enter 2 numbers: ");

    Scanner number = new Scanner(System.in);
    int a = number.nextInt();
    int b = number.nextInt();

    if (a > b) {
      System.out.println("The second number should be bigger");
    } else {
      for (int i = a; i <= b; i++) {
        System.out.println(i);
      }
    }
  }
}
