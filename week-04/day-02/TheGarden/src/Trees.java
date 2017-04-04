/**
 * Created by Andi on 4/4/2017.
 */
public class Trees extends Garden{
  int waterAmount;
  String type;

  public Trees(String color) {
    super(color);
    waterAmount = 0;
    type = "Tree";
  }

  public void needWater() {
    if (this.waterAmount < 10) {
      System.out.println("The " + this.getColor() + this.type + " needs water.");
    } else {
      System.out.println("The " + this.getColor() + this.type + " doesnt need water.");
    }
  }

  public int getWaterAmount() {
    return this.waterAmount;
  }
}
