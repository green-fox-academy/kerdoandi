import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/4/2017.
 */
public class Flowers extends Garden{
  String color;
  private double waterAmount;

  public Flowers(String color) {
    this.color = color;
    waterAmount = 0;
  }

  public void needWater() {
    if (this.waterAmount < 5) {
      System.out.println("The " + this.color + " Flower needs water.");
    } else {
      System.out.println("The " + this.color + " Flower doesnt need water.");
    }
  }

  public double getWaterAmount() {
    return this.waterAmount;
  }

  public void setWaterAmount(int water) {
    this.waterAmount = this.waterAmount + water * 0.75;
  }
}
