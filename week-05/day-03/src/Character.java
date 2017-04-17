import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Character extends GameObject {
  public static int randomNumber = (int) (Math.random() * 6) + 1;
  public static int level = 3;
  int HP;
  int currentHP;
  int SP;
  int DP;
  int SV;


  Character(String costume, Map map, int HP,int currentHP, int SP, int DP, int SV) {
    super(costume, map);
    List<Integer> coordList = generateRandomCoordinates();
    this.posX = coordList.get(0);
    this.posY = coordList.get(1);
    this.HP = HP;
    this.currentHP =currentHP;
    this.SP = SP;
    this.DP = DP;
    this.SV = SV;
  }

  private List<Integer> generateRandomCoordinates() {
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