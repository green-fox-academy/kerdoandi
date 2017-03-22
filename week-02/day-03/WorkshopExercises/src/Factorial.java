import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 22..
 */
public class Factorial {
  public static void main(String[] args) {

    System.out.println("number: ");
    Scanner number = new Scanner(System.in);
    int x = number.nextInt();

    System.out.println(factorio(x));

  }

  public static int factorio(int input) {
    int result = 1;
    for (int k = 1; k <= input; k++)  {
      result = result * k;
    }

    return result;
  }

}

// - Create a function called `factorio`
//   that returns it's input's factorial