public class Boss extends Monsters{
  private int HP;
  private int currentHP;
  private int SP;
  private int DP;

  public Boss(String costume, Map map) {
    super(costume, map);
    int randomNr = (int) (Math.random() * 6) + 1;
    this.HP = 2 * level* randomNr + randomNr;
    this.SP = level * randomNr + randomNr;
    this.DP = level / 2 * randomNr + randomNr / 2;
  }
}
