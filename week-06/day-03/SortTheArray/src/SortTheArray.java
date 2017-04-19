import java.util.Arrays;
import java.util.Collections;

public class SortTheArray {
  public static void main(String[] args) {
    Integer[] intArray = {4,6,2,6,8,0,76,2,6};
    Double[] doubleArray = {1.5, 6.7, 8.5, 9.5, 2.5, 7.1};
    toDescendArray(intArray);
    toDescendArray(doubleArray);
  }

  public static <T extends Number> void toDescendArray(T[] array) {
    Arrays.sort(array, Collections.reverseOrder());
    for (T t : array) {
      System.out.print(t + " ");
    }
    System.out.println();
  }
}
