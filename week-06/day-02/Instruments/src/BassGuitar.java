public class BassGuitar extends StringedInstrument {
  public BassGuitar(int nrOfStrings) {
    super("bass guitar", "Dumm-dumm-dumm", nrOfStrings);
  }

  public BassGuitar() {
    this(4);
  }

  @Override
  public void play() {
    System.out.printf(FORMATFORPLAY, name, nrOfStrings, sound);
  }
}
