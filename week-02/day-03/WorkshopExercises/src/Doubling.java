/**
 * Created by Andi on 2017. 03. 22..
 */
public class Doubling {
  public static void main(String[] args) {
    int ak = 123;
    int gb = 245;

    System.out.println(doubling(ak));
    System.out.println(doubling(456));
    System.out.println(doubling(gb));
  }

  public static int doubling(int toDouble) {

    return 2 * toDouble;
  }

}

// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter
// - Print the result of `doubling(ak)`
