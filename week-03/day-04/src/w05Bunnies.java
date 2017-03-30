public class w05Bunnies {
  public static void main(String[] args) {
    int bunnies = 15;
    System.out.println(toCountBunnyEars(bunnies));
  }

  public static int toCountBunnyEars(int i) {
    if (i == 0) {
      return 0;
    } else {
      int nrOfEars = 2;
      return i*nrOfEars;
    }
  }



}

