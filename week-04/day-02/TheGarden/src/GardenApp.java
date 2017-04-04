import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/4/2017.
 */
public class GardenApp {
  public static void main(String[] args) {

    Flowers y = new Flowers("yellow");
    Flowers x = new Flowers("blue");
    Trees m = new Trees("purple");
    Trees n = new Trees("orange");

    Garden garden = new Garden();
    garden.addPlants(y);
    garden.addPlants(x);
    garden.addPlants(m);
    garden.addPlants(n);

    y.needWater();
    x.needWater();
    m.needWater();
    n.needWater();

    garden.water(40);
    y.needWater();
    x.needWater();
    m.needWater();
    n.needWater();

    garden.water(70);
    y.needWater();
    x.needWater();
    m.needWater();
    n.needWater();






  }
}
