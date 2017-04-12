/**
 * Created by Andi on 4/12/2017.
 */
public class GameObject {
  int posX;
  int posY;
  String costume;
  Map map;

  public GameObject(int posX, int posY, String costume) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
  }

  public GameObject(int posX, int posY, String costume, Map map) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
    this.map = map;
  }

  public GameObject(String costume, Map map) {
    this.costume = costume;
    this.map = map;
  }

  public GameObject() {
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
