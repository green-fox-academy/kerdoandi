
public class w07StringsWithRecursion {
  public static void main(String[] args) {
    String text = "xfaaaxxxaaaaxxxxaaaaa";
    System.out.println(toReplaceXToY(text));
  }

  public static String toReplaceXToY(String text) {
    char oldChar = 'x';
    char newChar = 'y';

    if (text.length() < 1) {

      return text;

    } else {

      if (text.charAt(0) == oldChar) {
        return newChar + toReplaceXToY(text.substring(1));
      } else {
        return text.charAt(0) + toReplaceXToY(text.substring(1));
      }
    }
  }
}
