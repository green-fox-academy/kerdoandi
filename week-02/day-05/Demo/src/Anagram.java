import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
  public static void main(String[] args) {

    System.out.println("Please enter two words with the same length: ");

    Scanner input = new Scanner(System.in);
    String word1 = input.nextLine();
    String word2 = input.nextLine();

    System.out.println("The two words are anagrams: " + isAnagram(word1, word2));


    System.out.println(isAnagram(word1, word2));

  }

  public static boolean isAnagram(String word1, String word2) {

    if (word1.length() == word2.length()) {

      ArrayList<Character> charListWord1 = new ArrayList<Character>();
      ArrayList<Character> charListWord2 = new ArrayList<Character>();

      for (char w: word1.toCharArray()) {
        charListWord1.add(w);
      }

      for (char w: word2.toCharArray()) {
        charListWord2.add(w);
      }

      for (int i = 0; i < charListWord1.size(); i++) {
        if (charListWord2.contains(charListWord1.get(i))) {
          charListWord2.remove(charListWord1.get(i));
        } else {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }
}
