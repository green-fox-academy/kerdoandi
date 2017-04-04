import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/4/2017.
 */
public class Garden {
  List<Object> garden = new ArrayList<>();

  public void addPlants(Flowers flower) {
    garden.add(flower);
  }

  public void addPlants(Trees tree) {
    garden.add(tree);
  }

  public void water(int totalWaterAmount) {
    System.out.println("Watering with " + totalWaterAmount);

    int counter = 0;
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Trees) {
        if (((Trees) garden.get(i)).getWaterAmount() < 10) {
          counter++;
          }

      } else {
        if (((Flowers) garden.get(i)).getWaterAmount() < 5) {
          counter++;
        }
      }
    }

    for (int i = 0; i < garden.size(); i++ ) {
      if (garden.get(i) instanceof Trees) {
        if (((Trees) garden.get(i)).getWaterAmount() < 10) {
          ((Trees) garden.get(i)).setWaterAmount(totalWaterAmount/counter);
        }

      } else {
        if (((Flowers) garden.get(i)).getWaterAmount() < 5) {
          ((Flowers) garden.get(i)).setWaterAmount(totalWaterAmount/counter);
        }
      }
    }





  }
}
