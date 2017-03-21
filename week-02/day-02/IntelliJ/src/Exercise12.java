/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise12  {
  public static void main(String[] args) {

    int a = 123;
    int b = 526;

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("After swapping a = " + a);
    System.out.println("After swapping b = " + b);
  }
}
