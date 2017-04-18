public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super("bass guitar", "Dumm-dumm-dumm", 4);
  }

  @Override
  public void play() {
    System.out.printf(FORMATFORPLAY, name, nrOfStrings, sound);
  }
}
