import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/4/2017.
 */
public class Carrier {
  List<Aircraft> carrier = new ArrayList<>();
  int storeOfAmmo;
  int healthPoint;

  public Carrier(int storeOfAmmo, int healthPoint) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
  }

  public int getHealthPoint() {
    return this.healthPoint;
  }

  public void setHealthPoint(int i) {
    this.healthPoint = this.healthPoint + i;
  }

  public Aircraft getAircraft(int i) {
    return carrier.get(i);
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
      List<Aircraft> f35List = new ArrayList<>();
      for (int i = 0; i < carrier.size(); i++) {
        if (carrier.get(i).getType().equals("F35")) {
          f35List.add(carrier.get(i));
        }
      }
      for (int i = 0; i < f35List.size(); i++) {
        storeOfAmmo = f35List.get(i).refill(storeOfAmmo);
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

  public int getCarrierDamage() {
    int carrierDamage = 0;
    for (int i = 0; i < carrier.size(); i++) {
      carrierDamage = carrierDamage + carrier.get(i).fight();
    }
    return carrierDamage;
  }

  public void fight(Carrier enemy) {
    enemy.setHealthPoint(enemy.getHealthPoint() - getCarrierDamage());
  }

  public int getNumberofAircrafts() {
    return carrier.size();
  }

  public void getAllAircraftStatus() {
    for (Aircraft ac : carrier) {
      ac.getStatus();
    }
  }

  public void getStatus() {
    System.out.println("Aircraft count: " + getNumberofAircrafts() + ", Ammo Storage: " + storeOfAmmo + ", Total damage: " + getCarrierDamage());
  }

}
