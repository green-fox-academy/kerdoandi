/**
 * Created by Andi on 2017. 03. 30..
 */
public class w01Counter {
  public static void main(String[] args) {
    int n = 5;
    toCountDown(n);
  }

  public static int toCountDown(int i) {
    if (i == 0) {
      System.out.println(0);
      return 0;

    } else {
      System.out.println(i);

      return toCountDown(i-1);
    }
  }
}
