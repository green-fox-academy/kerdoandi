/**
 * Created by Andi on 4/5/2017.
 */
public class Fibonacci {

  public int toComputeFibonacci(int index) {

    if (index == 0) {
      return 0;
    } else if (index == 1) {
      return 1;
    } else {
      return toComputeFibonacci(index - 1) + toComputeFibonacci(index - 2);
    }
  }
}
