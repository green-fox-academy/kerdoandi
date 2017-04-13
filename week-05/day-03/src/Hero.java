import java.util.List;

public class Hero extends Character {
  private int HP;
  private int currentHP;
  private int SP;
  private int DP;
  private int SV;


  public Hero(String costume, Map map) {
    super(costume, map);
    this.HP = 20 + 3 * randomNumber;
    this.SP = 5 + randomNumber;
    this.DP = 2 * randomNumber;
    this.SV = 2 * randomNumber + SP;
    this.currentHP = HP;
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

  public void setCurrentHP(Monsters monster) {
    this.currentHP = this.getHP() - (monster.getSV() - this.getDP());
  }

  public int getCurrentHP() {
    return this.currentHP;
  }

  public int getHP() {
    return this.HP;
  }

  public int getDP() {
    return this.DP;
  }

  public int getSV() {
    return this.SV;
  }

  public void battle(List<Monsters> matchingMonsterList) {
    for (Monsters monster : matchingMonsterList) {
      if (this.SV > monster.getDP()) {
        monster.setCurrentHP(this);
      }
      if (monster.getSV() > this.getDP()) {
        this.setCurrentHP(monster);
      }
      System.out.println("hero currentHP: " + this.getCurrentHP() + "hero HP: " + this.getHP() + "monster HP: " + monster.getHP());
    }
  }
}