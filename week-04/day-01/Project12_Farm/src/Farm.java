import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/3/2017.
 */
public class Farm {
  List<Animals> animals = new ArrayList<>();
  private int totalSlots;

  public Farm(int totalSlots) {
    this.totalSlots = totalSlots;
  }

  public void breed() {
    if (totalSlots > animals.size()) {
      animals.add(new Animals());
    }
  }


  public void slaughter() {
    Animals tempLeastHungry = animals.get(0);

    for (int i = 1; i < animals.size(); i++) {
      if (animals.get(i).hungerValue < tempLeastHungry.hungerValue) {
      tempLeastHungry = animals.get(i);
      }
    }
    animals.remove(tempLeastHungry);
  }
}












