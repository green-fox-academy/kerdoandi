import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise12 {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };

    List<List<Integer>> matrixFromLists = new ArrayList<List<Integer>>();
    matrixFromLists.add(Arrays.asList(1, 2, 3));
    matrixFromLists.add(Arrays.asList(4, 5, 6));
    matrixFromLists.add(Arrays.asList(7, 8, 9));

    System.out.println(Arrays.toString(returnSumOfEachRow(matrix)));
    System.out.println(Arrays.toString(returnSumOfEachRowWithListMatrix(matrixFromLists)));
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

  private static int[] returnSumOfEachRowWithListMatrix(List<List<Integer>> listMatrix) {
    int[] sumOfRowArray = new int[listMatrix.size()];
    for (int i = 0; i < listMatrix.size(); i++) {
      int sumOfGivenRow = 0;
      for (int j = 0; j < listMatrix.get(i).size(); j++) {
        sumOfGivenRow += listMatrix.get(i).get(j);
      }
      sumOfRowArray[i] = sumOfGivenRow;
    }
    return sumOfRowArray;
  }
}

