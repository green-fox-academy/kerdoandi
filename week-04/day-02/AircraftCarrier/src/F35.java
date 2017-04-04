/**
 * Created by Andi on 4/4/2017.
 */
public class F35 extends Aircrafts {
  static final String TYPE = "F36";

  public F35(String type, int maxAmmo, int baseDamage, int ammoStore) {
    super(12, 50, 0);
  }

  public String getType() {
    return this.TYPE;
  }

}
