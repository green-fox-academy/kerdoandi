import java.util.ArrayList;
import java.util.Arrays;


public class QuoteSwap {
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    String temp = list.get(2);
    list.set(2, list.get(5));
    list.set(5, temp);

    System.out.println(list);
  }
}


// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place 2/5
// Your task is to fix it by swapping the right words with code

// Also, print the sentence to the output with spaces in between.