import java.util.Arrays;

public class Exercise12 {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };
    System.out.println(Arrays.toString(returnSumOfEachRow(matrix)));
  }

  public static int[] returnSumOfEachRow(int[][] matrix) {
    int[] sumOfRowArray = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      int sumOfGivenRow = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        sumOfGivenRow += matrix[i][j];
      }
      sumOfRowArray[i] = sumOfGivenRow;
    }
    return sumOfRowArray;
  }
}

