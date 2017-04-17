import java.util.Random;

public class Pirates {
  private int rumLevel;
  private boolean isAlive;
  private String name;

  public Pirates(String name) {
    rumLevel = 0;
    isAlive = true;
    this.name = name;
  }

  public void drinkSomeRum() {
    if (this.isAlive) {
      rumLevel++;
    } else {
      System.out.println(this.name + "he's dead");
    }
  }

  public void howItsGoingMate() {
    if (this.isAlive) {
      if (this.rumLevel > 0) {
        int print = (int) (Math.random() * 4);
        for (int i = 0; i < print; i++) {
          System.out.println("Pour me anudder!");
        }
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    } else {
      System.out.println(this.name + "he's dead");
    }
  }

  public void die() {
    this.isAlive = false;
  }

  public void brawl(Pirates otherPirate) {
    Random random = new Random();
    int r = random.nextInt(3);
    if (r == 0) {
      otherPirate.isAlive = false;
    } else if (r == 1) {
      this.isAlive = false;
    } else {
      this.isAlive = false;
      otherPirate.isAlive = false;
    }
  }

  public String getName() {
    return name;
  }


  public int getRumLevel() {
    return rumLevel;
  }

  public boolean isAlive() {
    return isAlive;
  }

  @Override
  public String toString() {
    return name;
  }
}
