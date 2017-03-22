/**
 * Created by Andi on 2017. 03. 22..
 */
public class Greet {
  public static void main(String[] args) {

    String al = "Greenfox";
    System.out.println(greet(al));
  }

  public static String greet(String al) {
    return "Greatings dear, " + al;
  }
}


//- Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`