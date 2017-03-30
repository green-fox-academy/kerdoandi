/**
 * Created by Andi on 2017. 03. 30..
 */
public class w02NumberAdder {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(toAddNumbers(n));
  }

  public static int toAddNumbers(int i) {
    if (i == 1) {
      return 1;
    } else {
      return i + toAddNumbers(i - 1);
    }
  }
}
