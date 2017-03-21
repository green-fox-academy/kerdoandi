import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise18 {
  public static void main(String[] args) {

    System.out.println("Please enter a numbers: ");

    Scanner number = new Scanner(System.in);
    int x = number.nextInt();

    if (x == 0){
      System.out.println("The number is zero.");
    } else if (x % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  }
}
