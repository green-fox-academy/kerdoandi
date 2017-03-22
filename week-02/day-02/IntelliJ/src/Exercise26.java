import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 22..
 */
public class Exercise26 {

  public static void main(String[] args) {

    System.out.println("Please enter a number: ");

    Scanner number = new Scanner(System.in);
    int x = number.nextInt();

    for (int i = 1; i < 11; i++) {
      System.out.println(i*x);
    }
  }
}
