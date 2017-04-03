/**
 * Created by Andi on 4/3/2017.
 */
public class CreateAnimals {
  public static void main(String[] args) {
    Animals dog = new Animals(50, 50);
    Animals cat = new Animals(50, 50);

    cat.toDrink();
    cat.toEat();
    cat.toPlay();
    cat.toPlay();

    System.out.println(cat.hungerValue);

  }
}
