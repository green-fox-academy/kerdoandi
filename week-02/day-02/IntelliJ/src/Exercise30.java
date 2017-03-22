import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 22..
 */
public class Exercise30 {
  public static void main(String[] args) {
    System.out.println("PLease enter a number: ");

    Scanner number = new Scanner(System.in);
    int num = number.nextInt();

    for (int x = 0; x < num; x++) {

      for (int y = 0; y < num; y++) {

        if (x == 0) {
          System.out.print("%");
        } else if (x == (num -1)) {
          System.out.print("%");
        } else if (y == 0) {
          System.out.print("%");
        } else if (y == (num - 1)) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}