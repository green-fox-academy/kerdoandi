/**
 * Created by Andi on 2017. 03. 22..
 */
public class Reverse {
  public static void main(String[] args) {

    int[] aj = {3, 4, 5, 6, 7};

    int temp1 = aj[3];
    int temp2 = aj[4];

    aj[3] = aj[1];
    aj[4] = aj[0];

    aj[1] = temp1;
    aj[0] = temp2;

    for (int i = 0; i < aj.length; i++) {

      System.out.print(aj[i] + ", ");

    }
  }
}

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj
