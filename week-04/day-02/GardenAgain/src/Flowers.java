/**
 * Created by Andi on 4/4/2017.
 */
public class Flowers extends Plants{

  public Flowers(String color, String type, double waterAmount) {
    super(color, type, waterAmount, 5);
  }

  @Override
  public void setWaterAmount(int water) {
    this.waterAmount = this.waterAmount + water * 0.75;
  }

}
