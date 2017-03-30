import java.lang.reflect.Array;
import java.util.ArrayList;

public class w10Fibonacci {
  public static void main(String[] args) {
    int n = 8;

    System.out.print(toCalculateFibonacci(n));

  }

  public static int toCalculateFibonacci(int i) {

    if (i == 0) {

      return 0;

    } else if (i == 1) {

      return 1;
    } else {

      return toCalculateFibonacci(i - 1) + toCalculateFibonacci(i - 2);

    }
  }
}
