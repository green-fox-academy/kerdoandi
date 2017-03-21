import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise16 {
  public static void main(String[] args) {

    System.out.println("Please enter two numbers: ");

    Scanner animals = new Scanner(System.in);
    int chicken = animals.nextInt();
    int pig = animals.nextInt();

    System.out.println("Nr of legs: " + (chicken * 2 + pig * 4));




  }
}
