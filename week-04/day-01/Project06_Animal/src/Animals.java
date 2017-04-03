/**
 * Created by Andi on 4/3/2017.
 */
public class Animals {
 int hungerValue;
 int thirstValue;

  public Animals() {
    hungerValue = 50;
    thirstValue = 50;
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
