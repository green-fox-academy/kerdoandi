import java.util.Random;

public class Monsters extends Character {


  public Monsters(String costume, Map map, int HP,int currentHP, int SP, int DP, int SV) {
    super(costume, map, HP, currentHP, SP, DP, SV);
  }

  void moveMonster(int heroPosX, int heroPosY) {
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