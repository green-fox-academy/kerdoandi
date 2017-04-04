/**
 * Created by Andi on 4/4/2017.
 */
public class Trees extends Plants{

  public Trees(String color, String type, double waterAmount) {
    super(color, type, waterAmount,10);
  }

  @Override
  public void setWaterAmount(int water) {
    this.waterAmount = this.waterAmount + water * 0.4;
  }

}
