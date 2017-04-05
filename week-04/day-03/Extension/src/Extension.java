import java.util.*;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > c && b > a) {
      return b;
    } else {
      return c;
    }
  }


  int median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 0) {
      return (pool.get(pool.size()/2-1) + pool.get(pool.size()/2))/2;
    } else {
      return pool.get((pool.size()-1)/2);
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    int length = hungarian.length();
    for (int i = 0; i < length; i++) {
      char c = hungarian.charAt(i);
      if (isVowel(c)) {
        hungarian = String.join(c + "v" + c, hungarian.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return hungarian;
  }
}