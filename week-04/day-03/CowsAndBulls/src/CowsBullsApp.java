/**
 * Created by Andi on 4/5/2017.
 */
public class CowsBullsApp {
  public static void main(String[] args) {
    CowsBulls game = new CowsBulls();

    System.out.println(game.convertNumToList(45803));

    game.returnToGuess();
    System.out.println(game.randomNumber);
    System.out.println(game.getBulls());
    System.out.println(game.getCows());
  }
}
