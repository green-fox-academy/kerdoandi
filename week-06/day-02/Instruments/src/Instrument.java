public abstract class Instrument {
  String name;
  String sound;

  public Instrument(String name, String sound) {
    this.name = name;
    this.sound = sound;
  }

  public abstract void play();
}
