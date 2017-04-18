public class Violin extends StringedInstrument{

  public Violin() {
    super("violin", "screeches", 4);
  }

  @Override
  public void play() {
    System.out.printf(FORMATFORPLAY, name, nrOfStrings, sound);
  }
}
