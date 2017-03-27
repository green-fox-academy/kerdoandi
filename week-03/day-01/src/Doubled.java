import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {

    List<String> textInList = new ArrayList<>();
    String filepath = "assets/duplicated_chars.txt";
    textInList = LottoWithMethods.readFileIntoArrayList(filepath);
//    System.out.println(textInList);

    for (int i = 0; i < textInList.size()-1; i++) {

      char[] textInCharArray = textInList.get(i).toCharArray();
      for (int j = 0; j < textInCharArray.length-1; j=j+2) {
        System.out.print(textInCharArray[j]);
      }
      System.out.println();
    }
  }
}

