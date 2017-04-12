public class Skeleton extends Monsters {
  private int HP;
  private int currentHP;
  private int SP;
  private int DP;

  public Skeleton(String costume, Map map) {
    super(costume, map);
    int randomNr = (int) (Math.random() * 6) + 1;
    this.HP = 2 * level* randomNr;
    this.SP = level * randomNr;
    this.DP = level / 2 * randomNr;
  }
}
