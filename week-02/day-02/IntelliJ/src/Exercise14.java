import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise14 {
  public static void main(String[] args) {

    System.out.println("What is your name?");

    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    System.out.println("Hello, " + name + "!");
  }
}
