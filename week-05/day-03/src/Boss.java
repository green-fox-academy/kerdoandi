public class Boss extends Monsters{
  private int HP;
  private int currentHP;
  private int SP;
  private int DP;
  private int SV;

  public Boss(String costume, Map map) {
    super(costume, map);
    this.HP = 2 * level* randomNumber + randomNumber;
    this.SP = level * randomNumber + randomNumber;
    this.DP = level / 2 * randomNumber + randomNumber / 2;
    this.SV = 2 * randomNumber + SP;
    this.currentHP = HP;
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