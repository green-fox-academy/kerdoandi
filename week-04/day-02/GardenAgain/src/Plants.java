/**
 * Created by Andi on 4/4/2017.
 */
public class Plants {
  String color;
  String type;
  double waterAmount;

  public Plants(String color, String type, double waterAmount) {
    this.color = color;
    this.type = type;
    this.waterAmount = waterAmount;
  }

  public double getWaterAmount() {
    return this.waterAmount;
  }

  public void setWaterAmount(int water) {
    this.waterAmount = this.waterAmount + water;
}
