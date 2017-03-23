/**
 * Created by Andi on 2017. 03. 23..
 */
public class TakesLonger_03 {
  public static void main(String[] args) {

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    String quote1 = quote.substring(0, 20);
    String quote2 = quote.substring(21);

    quote1 = quote1.concat(" always takes longer than ");
    quote1 = quote1.concat(quote2);

    System.out.println(quote1);
  }
}


// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)
