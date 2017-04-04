import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/4/2017.
 */
public class Carrier {
  List<Aircrafts> carrier = new ArrayList<>();
  int storeOfAmmo;
  int healthPoint;

  public Carrier(int storeOfAmmo, int healthPoint) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
  }

  public void addAircraft(String type) {
    if (F16.TYPE.equals(type)) {
      carrier.add(new F16());
    } else if (F35.TYPE.equals(type)) {
      carrier.add(new F35());
    } else{
      System.out.println("Please add F16/F35");
    }

  }
}
