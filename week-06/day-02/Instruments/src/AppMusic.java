public class AppMusic {
  public static void main(String[] args) {
    ElectricGuitar electricGuitar = new ElectricGuitar();
    BassGuitar bassGuitar = new BassGuitar();
    Violin violin = new Violin();

    System.out.println("Test1");
    electricGuitar.play();
    bassGuitar.play();
    violin.play();
  }
}
