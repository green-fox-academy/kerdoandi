/**
 * Created by Andi on 4/12/2017.
 */
public class Character extends GameObject {
  int randomNumber;
  int level;

  public Character(int posX, int posY, String costume, Map map) {
    super(posX, posY, costume, map);
    randomNumber = (int) (Math.random() * 6) + 1;
    level = 1;
  }

  public Character(String costume, Map map) {
    this.costume = costume;
    this.map = map;
    randomNumber = (int) (Math.random() * 6) + 1;
    level = 1;
  }
}
