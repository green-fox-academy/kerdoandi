public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar(int nrOfStrings) {
    super("electric guitar", "twang", nrOfStrings);
  }

  public ElectricGuitar() {
    this(6);
  }

  @Override
  public void play() {
    System.out.printf(FORMATFORPLAY, name, nrOfStrings, sound);
  }
}
