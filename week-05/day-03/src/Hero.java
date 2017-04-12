public class Hero extends GameObject {
  private int HP;
  private int currentHP;
  private int SP;
  private int DP;


  public Hero(int posX, int posY, String costume, Map map) {
    super(posX, posY, costume, map);
    int randomNr = (int) (Math.random() * 6) + 1;
    this.HP = 20 + 3 * randomNr;
    this.SP = 5 + randomNr;
    this.DP = 2 * randomNr;
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
