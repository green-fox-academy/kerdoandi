/**
 * Created by Andi on 4/4/2017.
 */
public class Aircrafts {
  int maxAmmo;
  int baseDamage;
  private int ammoStore;

  public Aircrafts(int maxAmmo, int baseDamage, int ammoStore) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammoStore = ammoStore;
  }

  public int getAmmoStore() {
    return this.ammoStore;
  }

  public void setAmmoStore(int number) {
    this.ammoStore = this.ammoStore + number;
  }
  public int fight() {
    int damage = this.ammoStore * this.baseDamage;
    this.ammoStore = 0;
    return damage;
  }

  public int refill(int fillAmount) {
    int capacity = maxAmmo - ammoStore;
    if (capacity == 0) {
      return fillAmount;
    } else {
      if (fillAmount > capacity) {
        this.setAmmoStore(capacity);
        return fillAmount - capacity;
      } else {
        this.setAmmoStore(fillAmount);
        return 0;
      }
    }
  }

  public String getType() {
    return "";
  }



}
