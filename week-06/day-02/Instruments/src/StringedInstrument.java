public abstract class StringedInstrument extends Instrument {
  int nrOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  public StringedInstrument(String name, int nrOfStrings) {
    super(name);
    this.nrOfStrings = nrOfStrings;
  }
}
