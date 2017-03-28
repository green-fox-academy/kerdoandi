import java.util.List;

/**
 * Created by Andi on 2017. 03. 28..
 */
public class EncodedZenLines {
  public static void main(String[] args) {
    String filepath = "assets/encoded_zen_lines.txt";
    List<String> encodedText = Functions.readFileIntoArrayList(filepath);
    System.out.println(encodedText);
  }
}
