/**
 * Created by Andi on 4/4/2017.
 */
public class Plants {
  String color;
  String type;
  double waterAmount;
  int waterLimit;



  public Plants(String color, String type, double waterAmount, int waterLimit) {
    this.color = color;
    this.type = type;
    this.waterAmount = waterAmount;
    this.waterLimit = waterLimit;
  }

  public double getWaterAmount() {
    return this.waterAmount;
  }

  public void setWaterAmount(int water) {
    this.waterAmount = this.waterAmount + water;
}

  public boolean needWater() {
    return waterAmount < waterLimit;
  }

  public void plantStatus() {
    if (this.waterAmount < waterLimit) {
      System.out.println("The " + this.color + " " + this.type + " needs water.");
    } else {
      System.out.println("The " + this.color +  " " + this.type + " doesnt need water.");
    }
  }
}

