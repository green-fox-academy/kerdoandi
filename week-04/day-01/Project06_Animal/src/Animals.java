/**
 * Created by Andi on 4/3/2017.
 */
public class Animals {
 int hungerValue;
 int thirstValue;

  public Animals(int hungerValue, int thirstValue) {
    this.hungerValue = hungerValue;
    this.thirstValue = thirstValue;
  }

  public void toEat() {
    this.hungerValue -= 1;
  }


  public void toDrink() {
    this.thirstValue -= 1;
  }

  public void toPlay() {
    this.hungerValue += 1;
    this.thirstValue += 1;
  }
}
