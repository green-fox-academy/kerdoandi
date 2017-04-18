public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    super("electric guitar", 6, "twang");
}

  @Override
  public void play() {
    System.out.printf(FORMATFORPLAY, name, nrOfStrings, sound);
  }
}
