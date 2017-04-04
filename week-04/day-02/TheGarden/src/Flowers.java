/**
 * Created by Andi on 4/4/2017.
 */
public class Flowers extends Garden{
  private int waterAmount;
  String type;

  public Flowers(String color) {
    super(color);
    waterAmount = 0;
    type = "Flower";
  }

  public void needWater() {
    if (this.waterAmount < 5) {
      System.out.println("The " + this.getColor() + this.type + " needs water.");
    } else {
      System.out.println("The " + this.getColor() + this.type + " doesnt need water.");
    }
  }

  public int getWaterAmount() {
    return this.waterAmount;
  }
}
