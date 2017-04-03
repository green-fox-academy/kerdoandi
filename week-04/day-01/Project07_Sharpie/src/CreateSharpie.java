/**
 * Created by Andi on 4/3/2017.
 */
public class CreateSharpie {
  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("green", 15);
    Sharpie sharpie2 = new Sharpie("red", 30);

    sharpie1.use();
    sharpie1.use();

    System.out.println(sharpie1.color + ", " + sharpie1.width + ", " + sharpie1.inkAmount);
    System.out.println(sharpie2.color + ", " + sharpie2.width + ", " + sharpie2.inkAmount);

  }
}
