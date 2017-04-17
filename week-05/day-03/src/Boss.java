public class Boss extends Monsters{
  public static final String DEFAULT_COSTUME = "pic/boss.png";

  public Boss(Map map) {
    super(DEFAULT_COSTUME, map, 2 * level* randomNumber + randomNumber, 2 * level* randomNumber + randomNumber, level * randomNumber + randomNumber, level / 2 * randomNumber + randomNumber / 2, 2 * randomNumber + (level * randomNumber + randomNumber));
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