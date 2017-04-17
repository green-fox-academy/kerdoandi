/**
 * Created by Andi on 4/5/2017.
 */
public class CowsBullsApp {
  public static void main(String[] args) {
    CowsAndBulls game = new CowsAndBulls();

    System.out.println(game.randomNumber);
    while (!game.returnToGuess()){
    }
  }
}
