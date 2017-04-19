import java.util.Random;

public enum CarColor {
  RED, BLUE, GREEN, BLACK, WHITE, SILVER, PINK;

  public static CarColor getRandomCarColor() {
    Random random = new Random();
    int randomNr = random.nextInt(CarColor.values().length);
    return CarColor.values()[randomNr];
  }
}
