/**
 * Created by Andi on 4/4/2017.
 */
public class F16 extends Aircrafts {
  static final String TYPE = "F16";

  public F16(int maxAmmo, int baseDamage, int ammoStore) {
    super(8, 30, 0);
  }

  public String getType() {
    return this.TYPE;
  }
}
