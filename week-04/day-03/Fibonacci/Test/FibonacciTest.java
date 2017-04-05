import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andi on 4/5/2017.
 */
public class FibonacciTest {
  @Test
  public void toComputeFibonacci() throws Exception {
    Fibonacci fib = new Fibonacci();
    int index = 5;
    assertEquals(5, fib.toComputeFibonacci(index));
  }
}