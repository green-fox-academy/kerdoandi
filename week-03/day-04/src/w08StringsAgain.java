/**
 * Created by Andi on 2017. 03. 30..
 */
public class w08StringsAgain {
  public static void main(String[] args) {
    String text = "kaaaaxxkkaaaxxxxx";
    System.out.println(toRemoveX(text));
  }

  public static String toRemoveX(String text) {
    char remove = 'x';

    if (text.length()<1) {
      return text;

    } else {

      if (text.charAt(0) == remove) {
        return toRemoveX(text.substring(1));
      } else {
        return text.charAt(0) + toRemoveX(text.substring(1));
      }
    }
  }
}
