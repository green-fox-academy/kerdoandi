import java.util.Arrays;

/**
 * Created by Andi on 4/5/2017.
 */
public class Anagram {
  String text1;
  String text2;

  public Anagram(String text1, String text2) {
    this.text1 = text1;
    this.text2 = text2;
  }

  public boolean isAnagram() {
    char[] text1Char = text1.toCharArray();
    char[] text2Char = text2.toCharArray();
    Arrays.sort(text1Char);
    Arrays.sort(text2Char);
    text1 = Arrays.toString(text1Char);
    text2 = Arrays.toString(text2Char);

    return text1.equalsIgnoreCase(text2);
  }

  public static void main(String[] args) {
    Anagram anagram = new Anagram("Alma", "mala");


  }
}

