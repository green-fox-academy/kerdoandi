import java.util.List;

/**
 * Created by Andi on 2017. 03. 28..
 */
public class ReversedZenOrder {
  public static void main(String[] args) {
    String filepath = "assets/reversed_zen_order.txt";
    List<String> reversedLineText = Functions.readFileIntoArrayList(filepath);
    printReverseLines(reversedLineText);

  }
  public static void printReverseLines (List<String> reversedText) {
    for (int i = reversedText.size()-1; i > -1; i--) {
      System.out.println(reversedText.get(i));
    }
  }
}
