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

    char[] doubledTextInCharArray = textInList.get(0).toCharArray();
    System.out.println(doubledTextInCharArray[0]);



  }


}

