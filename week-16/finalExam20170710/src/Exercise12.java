public class Exercise12 {

  public static void main(String[] args) {
    
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

