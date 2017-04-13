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
    System.out.println("posX: " + posX + " posY: " + posY + " herox: " + heroPosX + " heroY: " + heroPosY);
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

  public int getDP() {
    return DP;
  }

  public void setCurrentHP(int currentHP) {
    this.currentHP = currentHP;
  }

  public int getHP() {
    return HP;
  }
}