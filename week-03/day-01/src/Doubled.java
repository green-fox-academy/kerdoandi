import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Andi on 2017. 03. 27..
 */
public class Doubled {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("assets/duplicated_chars.txt");
      ArrayList<String> text = new ArrayList<>(Files.readAllLines(path));
      System.out.println(text);
    } catch (Exception e){
      System.out.println("error");
    }
  }
}
