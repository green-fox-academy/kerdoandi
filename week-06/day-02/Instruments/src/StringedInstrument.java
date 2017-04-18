public abstract class StringedInstrument extends Instrument {
  int nrOfStrings;
  final String FORMATFORPLAY = "%s, a %d-stringed instrument that %s\n";

  public StringedInstrument(String name,  String sound, int nrOfStrings) {
    super(name, sound);
    this.nrOfStrings = nrOfStrings;
  }
}
