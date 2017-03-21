import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise17 {
  public static void main(String[] args) {

    Scanner numbers = new Scanner(System.in);

    System.out.println("Please enter five numbers: ");
    int sum = 0;

    for(int i = 0; i < 5; i++) {
      sum = sum + numbers.nextInt();
    }

    System.out.println("Sum is: " + sum);
    System.out.println("Average is: " + sum / 5.);

  }
}
