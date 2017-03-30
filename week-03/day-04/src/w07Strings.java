import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;

public class w07Strings {
  public static void main(String[] args) {
    String text = "afaaaxxxaaaaxxxxaaaaa";
    System.out.println(toReplaceXToY(text));
  }

  public static String toReplaceXToY(String text) {

    if (!text.contains("x")) {
      return text;
    } else {
      char oldChar = 'x';
      char newChar = 'y';
      text = text.replace(String.valueOf(oldChar), String.valueOf(newChar));
      return text;
    }
  }
}
