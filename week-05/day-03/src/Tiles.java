import java.util.HashMap;
import java.util.List;

public class Tiles extends GameObject{

  public Tiles(int posX, int posY, String costume) {
    super(posX, posY, costume);
  }

  public Tiles(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
  }

  public boolean isWall() {
    return this.costume.equals("pic/wall.png");
  }

  public boolean isClear() {
    return this.costume.equals("pic/floor.png");
  }

  public HashMap<Integer, Integer> getWallCoord() {
    HashMap<Integer, Integer> wallCoordinates = new HashMap<>();
    if(!this.isClear()) {
      wallCoordinates.put(posX, posY);
    }
    return wallCoordinates;
  }
}
