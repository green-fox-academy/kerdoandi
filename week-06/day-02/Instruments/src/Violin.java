public class Violin extends StringedInstrument{

  public Violin() {
    super("violin", 4, "screeches");
  }

  @Override
  public void play() {
    System.out.printf(FORMATFORPLAY, name, nrOfStrings, sound);
  }
}
