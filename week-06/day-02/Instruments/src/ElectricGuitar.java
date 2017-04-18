public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    super("electric guitar", "twang", 6);
  }

  @Override
  public void play() {
    System.out.printf(FORMATFORPLAY, name, nrOfStrings, sound);
  }
}
