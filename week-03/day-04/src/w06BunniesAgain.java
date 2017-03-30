public class w06BunniesAgain {
  public static void main(String[] args) {
    int bunnies = 15;
    System.out.println(toCountEars(bunnies));
  }

  public static int toCountEars(int i) {
    if (i == 0) {
      return 0;
    } else if (i % 2 == 1) {
      int nrOfEarsEven = 2;
      return nrOfEarsEven + toCountEars(i - 1);
    } else {
      int nrOfEarsOdd = 3;
      return nrOfEarsOdd + toCountEars(i - 1);
    }
  }
}
