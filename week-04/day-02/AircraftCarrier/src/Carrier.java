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
    } else {
      System.out.println("Please add F16/F35");
    }
  }

  public int getAircraftCapacity() {
    for (int i = 0; i < carrier.size(); i++) {
      return carrier.get(i).maxAmmo - carrier.get(i).getAmmoStore();
    }
    return 0;
  }

  public int getTotalAircraftCapacity() {
    int totalcap = 0;
    for (int i = 0; i < carrier.size(); i++) {
      totalcap = totalcap + (carrier.get(i).maxAmmo - carrier.get(i).getAmmoStore());
    }
    return totalcap;
  }


  public void fill() {
    if (storeOfAmmo > getTotalAircraftCapacity()) {
      for (int i = 0; i < carrier.size(); i++) {
        storeOfAmmo = carrier.get(i).refill(storeOfAmmo);
      }
    } else if (storeOfAmmo < getTotalAircraftCapacity()) {
      List<Aircrafts> f35List = new ArrayList<>();
      for (int i = 0; i < carrier.size(); i++) {
        if (carrier.get(i).getType().equals("F35")) {
          f35List.add(carrier.get(i));
        }
      }

      for (int i = 0; i < carrier.size(); i++) {
        storeOfAmmo = carrier.get(i).refill(storeOfAmmo);
      }

      if (storeOfAmmo > 0) {
        for (int i = 0; i < carrier.size(); i++) {
          storeOfAmmo = carrier.get(i).refill(storeOfAmmo);
        }
      } else {
        System.out.println("Don't know how to throw an exception.");
      }
    }
  }
}
