public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super("bass guitar", 4, "Dumm-dumm-dumm");
  }

  @Override
  public void play() {
    System.out.printf(FORMATFORPLAY, name, nrOfStrings, sound);
  }
}
