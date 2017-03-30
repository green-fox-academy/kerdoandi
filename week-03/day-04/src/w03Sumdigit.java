/**
 * Created by Andi on 2017. 03. 30..
 */
public class w03Sumdigit {
  public static void main(String[] args) {
    int n = 1555555;
    System.out.println(toSumDigits(n));
  }

  public static int toSumDigits(int i)  {
    if (i < 10) {
      return i;
    } else {
      int j = i % 10;
      return j + toSumDigits(i/10);
    }
  }
}
