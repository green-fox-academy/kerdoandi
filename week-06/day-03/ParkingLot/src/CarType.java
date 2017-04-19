import java.util.Random;

public enum CarType {
  AUDI, OPEL, SUZUKI, BMW, CITROEN;

  public static CarType getRandomCarType() {
    Random random = new Random();
    int randomNr = random.nextInt(CarType.values().length);
    return CarType.values()[randomNr];
  }
}
