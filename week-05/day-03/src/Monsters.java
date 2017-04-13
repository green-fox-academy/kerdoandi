import java.util.Random;

public class Monsters extends Character {
  private int HP;
  private int currentHP;
  private int SP;
  private int DP;
  private int SV;

  public Monsters(String costume, Map map) {
    super(costume, map);
  }

  public void moveMonster(int heroPosX, int heroPosY) {
    System.out.println("posX: " + posX + " posY: " + posY + " heroX: " + heroPosX + " heroY: " + heroPosY);
    Random random = new Random();
    int r = random.nextInt(2);
    if (r == 0 && posY < 10 && heroPosY > posY) {
      if (!map.isItWall(this.posX, this.posY + 1)) {
        this.posY += 1;
      }
    }

    if (r == 0 && posY < 10 && heroPosY < posY) {
      if (!map.isItWall(this.posX, this.posY + 1)) {
        this.posY -= 1;
      }
    }

    if (r == 1 && posX < 9 && heroPosX > posX) {
      if (!map.isItWall(this.posX + 1, this.posY)) {
        this.posX += 1;
      }
    }

    if (r == 1 && posX > 0 && heroPosX < posX) {
      if (!map.isItWall(this.posX - 1, this.posY)) {
        this.posX -= 1;
      }
    }
  }

  public int getDP() {
    return DP;
  }

  public int getHP() {
    return HP;
  }

  public int getSV() {
    return SV;
  }

  public void setCurrentHP(Hero hero) {
    this.currentHP = this.getHP() - (hero.getSV() - this.getDP());
  }

  public int getCurrentHP() {
    return currentHP;
  }
}