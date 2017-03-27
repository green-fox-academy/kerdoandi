import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lotto {
  public static void main(String[] args) {
    List<String> lottoLines = new ArrayList<>();

     try {
      Path path = Paths.get("assets/lotto.csv");
      ArrayList<String> lotto = new ArrayList<>(Files.readAllLines(path));
//      System.out.println(lotto);

      } catch (IOException e)  {
      System.out.println("error happend: " + e.getClass());
    }

    for (String oneline : lottoLines)  {
      String[] splitLines = oneline.split(";");
      System.out.println(splitLines[11]);
    }
  }
}


