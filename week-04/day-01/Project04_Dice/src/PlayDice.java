/**
 * Created by Andi on 4/3/2017.
 */
public class PlayDice {
  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.getCurrent();
    myDice.roll();

    for (int i = 0; i < myDice.getCurrent().length; i++) {
      while (myDice.getCurrent(i) != 6) {
        myDice.reroll(i);
      }
    }

    for (int i = 0; i < myDice.getCurrent().length; i++) {
      System.out.println(myDice.getCurrent(i));
    }
  }
}
