public class AppMusic {
  public static void main(String[] args) {
    ElectricGuitar electricGuitar = new ElectricGuitar();
    BassGuitar bassGuitar = new BassGuitar();
    Violin violin = new Violin();

    System.out.println("Test1 Play");
    electricGuitar.play();
    bassGuitar.play();
    violin.play();

    System.out.println();
    System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
    System.out.println();
    System.out.println("Test2 Play");
  }
}
