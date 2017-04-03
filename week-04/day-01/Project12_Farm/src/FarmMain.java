/**
 * Created by Andi on 4/3/2017.
 */
public class FarmMain {
  public static void main(String[] args) {
    Farm pigFarm = new Farm(4);

    for (int i = 0; i < 5; i++) {
      pigFarm.breed();
    }

    pigFarm.animals.get(0).toEat();
    pigFarm.animals.get(0).toEat();
    pigFarm.animals.get(0).toEat();
    pigFarm.animals.get(1).toEat();

    System.out.println(pigFarm.animals.get(0).hungerValue);
    System.out.println(pigFarm.animals.get(1).hungerValue);

    pigFarm.slaughter();

    for (int i = 0; i < pigFarm.animals.size(); i++) {
      System.out.println(pigFarm.animals.get(i).hungerValue);
    }
  }
}
