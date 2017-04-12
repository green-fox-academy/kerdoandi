public class Hero extends Character {
  private int HP;
  private int currentHP;
  private int SP;
  private int DP;


  public Hero(int posX, int posY, String costume, Map map) {
    super(posX, posY, costume, map);
    this.HP = 20 + 3 * randomNumber;
    this.SP = 5 + randomNumber;
    this.DP = 2 * randomNumber;
  }

  public void moveUp() {
    this.costume = "pic/hero-up.png";
    if (posY > 0) {
      if (!map.isItWall(this.posX, this.posY - 1))
      this.posY -= 1;
    }
  }

  public void moveDown() {
    this.costume = "pic/hero-down.png";
    if (posY < 10) {
      if (!map.isItWall(this.posX, this.posY + 1)) {
        this.posY += 1;
      }
    }
  }

  public void moveRight() {
    this.costume = "pic/hero-right.png";
    if (posX < 9) {
      if (!map.isItWall(this.posX + 1, this.posY)) {
        this.posX += 1;
      }
    }
  }

  public void moveLeft() {
    this.costume = "pic/hero-left.png";
    if (posX > 0) {
      if (!map.isItWall(this.posX - 1, this.posY)) {
        this.posX -= 1;
      }
    }
  }
}
