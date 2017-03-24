
public class PalindromeSearcher {
  public static void main(String[] args) {

    String text = "arramarra";

    System.out.println(searchPalindrome(text));
  }


  public static boolean searchPalindrome(String input) {

    char[] inputArray = input.toCharArray();

    for (int i = 0; i < input.length(); i++) {
      if (inputArray[i] != inputArray[input.length() - i - 1]) {
        return false;
      }
    }
    return true;
  }
}

