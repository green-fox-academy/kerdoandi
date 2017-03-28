import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 2017. 03. 28..
 */
public class Functions {
  public static void main(String[] args) {

  }

  public static List<String> readFileIntoArrayList(String filepath)  {
  List<String> arrayListFromFile = new ArrayList<>();
  try {
    Path path = Paths.get(filepath);
    arrayListFromFile = Files.readAllLines(path);

  } catch (IOException e) {
    System.out.println("error happend: " + e.getClass());
  }
  return arrayListFromFile;
  }
}
