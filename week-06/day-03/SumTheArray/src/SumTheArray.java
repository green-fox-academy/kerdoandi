public class SumTheArray {
  public static void main(String[] args) {
   Integer[] intarray = {1,2,3,4,5};
    System.out.println(sumArray(intarray, 6));
  }

  public static <T extends Number> double sumArray(T[] array, int x) {
    double sum = 0;
    try {
      for (int i = 0; i < x; i++) {
        sum = sum + array[i].doubleValue();
      }
      return sum;
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Set lower number");
      return 0;
    }
  }
}
