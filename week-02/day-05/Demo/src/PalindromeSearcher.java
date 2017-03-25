import java.util.ArrayList;

public class PalindromeSearcher {
  public static void main(String[] args) {

    String text = "dog goat dad duck doodle never";
    ArrayList<String> textArrayList = new ArrayList<String>();
    ArrayList<String> palindromeArrayList = new ArrayList<String>();
    String palindromeCandidate = "";

    for (int i = 0; i < text.length() - 2; i++) {
      for (int j = i + 2; j < text.length(); j++) {
        if (text.charAt(i) == text.charAt(j)) {
          palindromeCandidate = text.substring(i, j+1);
          if (isPalindrome(palindromeCandidate))  {
            palindromeArrayList.add(palindromeCandidate);
          }
        }
      }
    }

    System.out.println(palindromeArrayList);

  }


  public static boolean isPalindrome(String input) {

    char[] inputArray = input.toCharArray();

    for (int i = 0; i < input.length(); i++) {
      if (inputArray[i] != inputArray[input.length() - i - 1]) {
        return false;
      }
    }
    return true;
  }
}

