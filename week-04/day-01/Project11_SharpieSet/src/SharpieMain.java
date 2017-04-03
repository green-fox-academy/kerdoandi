/**
 * Created by Andi on 4/3/2017.
 */
public class SharpieMain {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("green", 15);
    Sharpie sharpie2 = new Sharpie("red", 30);
    Sharpie sharpie3 = new Sharpie("blue", 30);

    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.addSharpie(sharpie1);
    sharpieSet.addSharpie(sharpie2);
    sharpieSet.addSharpie(sharpie3);

    sharpie1.use();
    sharpie1.use();
    sharpie2.use();
    sharpie2.use();

    System.out.println(sharpieSet.countUsable());


    for (int i = 0; i < sharpieSet.sharpieList.size(); i++ ) {
      System.out.println(sharpieSet.sharpieList.get(i).color);
    }

    sharpieSet.removeTrash();

    for (int i = 0; i < sharpieSet.sharpieList.size(); i++ ) {
      System.out.print(sharpieSet.sharpieList.get(i).color + " ");
    }
  }
}
