import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 2017. 03. 27..
 */
public class ReversedZenLines {
  public static void main(String[] args) {
    String filepath = "assets/reversed_zen_lines.txt";
    List<String> reversedText = new ArrayList<>();
    reversedText = Functions.readFileIntoArrayList(filepath);
    printTextInOrder(reversedText);
  }

  public static void printTextInOrder(List<String> reversedText) {
    for (int i = 0; i < reversedText.size()-1; i++) {
      char[] text = reversedText.get(i).toCharArray();
      for (int j = text.length - 1; j > -1; j--) {
        System.out.print(text[j]);
      }
      System.out.println();
    }
  }
}
