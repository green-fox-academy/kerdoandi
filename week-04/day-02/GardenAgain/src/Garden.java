import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/4/2017.
 */
public class Garden {

  List<Plants> garden = new ArrayList<>();

  public void addPlants(Plants plant) {
     garden.add(plant);
  }

  public void water(int totalWaterAmount) {
    System.out.println("Watering with " + totalWaterAmount);
    int counter = 0;
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).needWater()) {
        counter++;
      }
    }

    for (int i = 0; i < garden.size(); i++) {
      if(garden.get(i).needWater()) {
        garden.get(i).setWaterAmount(totalWaterAmount/counter);
      }
    }

  }
}
