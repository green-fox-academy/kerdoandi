import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monsters extends GameObject {
  int level;

  public Monsters(String costume, Map map) {
    super(costume, map);
    List<Integer> coordList = generateRandomCoordinates();
    this.posX = coordList.get(0);
    this.posY = coordList.get(1);
    this.level = 1;
  }


  public List<Integer> generateRandomCoordinates() {
    List<Integer> randomCoords = new ArrayList<>();
    Random random = new Random();
    int x = 3;
    int y = 0;
    while (map.isItWall(x, y)) {
      x = random.nextInt(10);
      y = random.nextInt(11);
    }
    randomCoords.add(x);
    randomCoords.add(y);
    return randomCoords;
  }

  public void moveMonster(int heroPosX, int heroPosY) {
    System.out.println("posX: " + posX + " posY: " + posY + "herox: " + heroPosX + " heroY: " + heroPosY);
    if (posY < 10 && heroPosY > posY) {
      if (!map.isItWall(this.posX, this.posY + 1)) {
        this.posY += 1;
      }
    }

    if (posY < 10 && heroPosY < posY) {
      if (!map.isItWall(this.posX, this.posY + 1)) {
        this.posY -= 1;
      }
    }

    if (posX < 9 && heroPosX > posX) {
      if (!map.isItWall(this.posX + 1, this.posY)) {
        this.posX += 1;
      }
    }

    if (posX > 0 && heroPosX < posX) {
      if (!map.isItWall(this.posX - 1, this.posY)) {
        this.posX -= 1;
      }
    }
  }
}
