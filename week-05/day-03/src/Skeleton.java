public class Skeleton extends Monsters {
  public static final String DEFAULT_COSTUME = "pic/skeleton.png";
  boolean hasKey;

  public Skeleton(Map map, boolean hasKey) {
    super(DEFAULT_COSTUME, map, 2 * level * randomNumber, 2 * level * randomNumber, level * randomNumber, level / 2 * randomNumber, 2 * randomNumber + level * randomNumber);
    this.hasKey = hasKey;
  }


  public Skeleton(Map map) {
    this(map, false);
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