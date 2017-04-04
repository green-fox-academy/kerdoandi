/**
 * Created by Andi on 4/4/2017.
 */
public class Aircrafts {
  String type;
  int maxAmmo;
  int baseDamage;
  private int ammoStore;

  public Aircrafts(String type, int maxAmmo, int baseDamage, int ammoStore) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = ammoStore;
    this.ammoStore = ammoStore;
  }

  public int getAmmoStore() {
    return this.ammoStore;
  }

  public void setAmmoStore(int number) {
    this.ammoStore = this.ammoStore + number;
  }

  public int fight() {
    return this.ammoStore * this.baseDamage;

  }



}
