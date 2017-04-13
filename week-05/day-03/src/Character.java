import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Character extends GameObject {
  int randomNumber;
  int level;


  public Character(String costume, Map map) {
    super(costume, map);
    List<Integer> coordList = generateRandomCoordinates();
    this.posX = coordList.get(0);
    this.posY = coordList.get(1);
    randomNumber = (int) (Math.random() * 6) + 1;
    level = 1;
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
}