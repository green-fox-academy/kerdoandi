import java.util.Scanner;

/**
 * Created by Andi on 2017. 03. 22..
 */
public class Sum {
  public static void main(String[] args) {
    System.out.println("number: ");
    Scanner number = new Scanner(System.in);
    int x = number.nextInt();

    System.out.println(sum(x));

  }

  public static int sum(int input) {
    int result = 0;
    for (int m = 1; m <= input; m++) {
      result = result + m;
    }
    return result;
  }

}
