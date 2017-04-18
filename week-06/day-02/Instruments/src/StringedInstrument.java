public abstract class StringedInstrument extends Instrument {
  int nrOfStrings;
  final String FORMATFORPLAY = "%s, a %d-stringed instrument that %s\n";
  String sound;

  public StringedInstrument(String name, int nrOfStrings, String sound) {
    super(name);
    this.nrOfStrings = nrOfStrings;
    this.sound = sound;
  }
}
