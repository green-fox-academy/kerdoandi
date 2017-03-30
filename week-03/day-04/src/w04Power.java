public class w04Power {
  public static void main(String[] args) {
    int n = 2;
    int m = 8;
    System.out.println(toPower(n, m));
  }

  public static int toPower(int i, int j) {
    if (j == 0) {
      return 1;
    } else if (j == 1) {
      return i;
    } else {
      return i * toPower(i,j-1);
    }
  }
}