import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise15 {
  public static void main(String[] args) {

    double kmToMiles = 0.621371;

    System.out.println("Please enter the distance in km: ");

    Scanner sc = new Scanner(System.in);
    int km = sc.nextInt();

    System.out.println("Your distance in miles: " + km * kmToMiles);
  }
}
