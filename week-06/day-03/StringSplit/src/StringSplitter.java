import java.util.ArrayList;
import java.util.List;

public class StringSplitter {
  public static void main(String[] args) {
    System.out.println(returnSubtexts("todayiswednesday", 7));
  }

  public static List<String> returnSubtexts(String text, int index) {
    List<String> subTexts = new ArrayList<>();
    try {
      subTexts.add(text.substring(0, index));
      subTexts.add(text.substring(index, text.length()));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Index value is not correct");
    }
    return subTexts;
  }
}


