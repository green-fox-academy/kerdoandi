/**
 * Created by Andi on 2017. 03. 23..
 */
public class Reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(reverseText(reversed));
  }

  public static String reverseText(String textToReverse) {
    String result = "";
    for ( int i = textToReverse.length()-1; i >= 0; i-- ) {
      result = result + textToReverse.charAt(i);
    }

    return result;

  }
}

// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.
