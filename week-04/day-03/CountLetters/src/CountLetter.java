import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andi on 4/5/2017.
 */
public class CountLetter {
  String text;

  public CountLetter(String text) {
    this.text = text;
  }


  public Map countLetter() {
    Map<String, Integer> map = new HashMap<>();
    char[] charText = text.toCharArray();

    for (char c : charText) {
      if (!map.containsKey(String.valueOf(c))) {
        map.put(String.valueOf(c),1);
      } else {
        Integer counter = map.get(String.valueOf(c));
        map.put(String.valueOf(c), counter + 1);
      }
    }
    return map;
  }

  public static void main(String[] args) {
    CountLetter t = new CountLetter("asdfasd");
    System.out.println(t.countLetter());

  }
}
