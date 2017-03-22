/**
 * Created by Andi on 2017. 03. 22..
 */
public class Greet {
  public static void main(String[] args) {

    String al = "Greenfox";

    System.out.println(greet(al));
    System.out.println(greet("Andi"));
  }

  public static String greet(String name) {

    return "Greetings dear, " + name;
  }
}


//- Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`