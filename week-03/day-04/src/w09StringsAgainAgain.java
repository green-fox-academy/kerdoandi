/**
 * Created by Andi on 2017. 03. 30..
 */
public class w09StringsAgainAgain {
  public static void main(String[] args) {
    String text = "sjabfifga";
    System.out.println(toSeparate(text));
  }

  public static String toSeparate(String text) {
    String symbol = "*";

    if (text.length() < 2) {
      return text;
    } else {
      return text.charAt(0) + symbol + toSeparate(text.substring(1));
    }
  }
}
