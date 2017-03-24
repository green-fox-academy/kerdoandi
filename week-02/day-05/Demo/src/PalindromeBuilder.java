/**
 * Created by Andi on 2017. 03. 24..
 */
public class PalindromeBuilder {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(reverseText(reversed));
  }

  public static String reverseText(String textToReverse) {
    String result = "";
    for (int i = textToReverse.length() - 1; i >= 0; i--) {

      result = result + textToReverse.charAt(i);
    }

    return textToReverse.concat(result);
  }
}
