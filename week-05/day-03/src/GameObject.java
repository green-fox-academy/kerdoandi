/**
 * Created by Andi on 4/12/2017.
 */
public class GameObject {
  int posX;
  int posY;
  String costume;

  public GameObject(int posX, int posY, String costume) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
  }

  public String getCostume() {
    return costume;
  }

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }
}
