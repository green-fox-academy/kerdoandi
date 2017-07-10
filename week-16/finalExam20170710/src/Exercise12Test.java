import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise12Test {
  @Test
  void returnSumOfRowsMethodShouldReturnWithAnArray() throws Exception {
    int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };
    int[] sumOfRows = {6, 15, 24};
    assertEquals(Arrays.toString(sumOfRows), Arrays.toString(Exercise12.returnSumOfEachRow(matrix)));
  }
}