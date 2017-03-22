/**
 * Created by Andi on 2017. 03. 22..
 */
public class Matrix {
  public static void main(String[] args) {
    int size = 4;
    int[][] matrix = new int [size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {

        if (i == j) {
          matrix [i][j] = 1;
        } else {
          matrix [i][j] = 0;
        }
      }
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output