import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {

    System.out.println("Please enter two words with the same length: ");

    Scanner input = new Scanner(System.in);
    String word1 = input.nextLine();
    String word2 = input.nextLine();

    System.out.println("The two words are anagrams: " + isAnagram(word1, word2));

  }

  public static boolean isAnagram(String word1, String word2) {

    if (word1.length() == word2.length()) {

      char[] word1ToCharArray = word1.toCharArray();

      for (int i = 0; i < word1ToCharArray.length; i++) {
        if (!word2.contains(String.valueOf(word1ToCharArray[i]))) {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }
}
