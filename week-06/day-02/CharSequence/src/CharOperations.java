import java.util.stream.IntStream;

public class CharOperations implements CharSequence {
  String text;

  public CharOperations(String text) {
   this.text = text;
  }

  @Override
  public int length() {
    return text.length();
  }

  @Override
  public char charAt(int index) {
    char[] textArray = text.toCharArray();
    return textArray[index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return text.substring(start, end);
  }

  @Override
  public String toString() {
    return text;
  }
}
