import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 22..
 */
public class Printer {

  public static void print(String input) {
    System.out.println(input);
  }

  public static void main(String[] args) {
    System.out.println("Please type sg: ");

    Scanner type = new Scanner(System.in);
    String text = type.nextLine();

    print(text);
  }


}


//- Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...