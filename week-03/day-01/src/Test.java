import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Test {
  public static void main(String[] args) {
  try {
       Path path = Paths.get("teaching-materials/exercises/file-manipulations/read_lotto_csv/otos.csv");
    List<String> lines = Files.readAllLines(path);
  } catch catch (Exception e) {
      System.out.println("error: " + e.getClass());
  }
  }
}
