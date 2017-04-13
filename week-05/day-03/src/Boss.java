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
  }
}