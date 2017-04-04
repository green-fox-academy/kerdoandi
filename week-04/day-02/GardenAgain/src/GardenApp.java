/**
 * Created by Andi on 4/4/2017.
 */
public class GardenApp {
  public static void main(String[] args) {


  Plants y = new Flowers("yellow", "Flower", 0);
  Plants x = new Flowers("blue", "Flower", 0);
  Plants m = new Trees("purple", "Tree", 0);
  Plants n = new Trees("orange", "Tree", 0);

  Garden garden = new Garden();
  garden.addPlants(y);
  garden.addPlants(x);
  garden.addPlants(m);
  garden.addPlants(n);

  System.out.println();

  y.plantStatus();
  x.plantStatus();
  m.plantStatus();
  n.plantStatus();

  System.out.println();

  garden.water(40);
  y.plantStatus();
  x.plantStatus();
  m.plantStatus();
  n.plantStatus();

  System.out.println();

  garden.water(70);
  y.plantStatus();
  x.plantStatus();
  m.plantStatus();
  n.plantStatus();
  }
}