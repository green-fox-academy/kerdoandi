public class Skeleton extends Monsters {
  private int HP;
  private int currentHP;
  private int SP;
  private int DP;
  private int SV;

  public Skeleton(String costume, Map map) {
    super(costume, map);
    this.HP = 2 * level * randomNumber;
    this.SP = level * randomNumber;
    this.DP = level / 2 * randomNumber;
    this.SV = 2 * randomNumber + SP;
  }
}
