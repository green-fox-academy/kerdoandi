import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andi on 2017. 03. 27..
 */
public class Doubled {
  public static void main(String[] args) {
    List<String> text = new ArrayList<>();

    try {
      Path path = Paths.get("assets/duplicated_chars.txt");
      text = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("error");
    }
    System.out.println(text);

    List<String> nonDoubledText = new ArrayList<>();
    for (String oneline : text) {

      if (oneline.length() != 0) {

      }
    }
  }
}