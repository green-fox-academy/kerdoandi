/**
 * Created by Andi on 4/3/2017.
 */
public class CarAndStation {
  public static void main(String[] args) {

    Car opel = new Car();
    Station omw = new Station(3000);
    omw.refill(opel);

    System.out.println(omw.gasAmount);
    System.out.println(opel.gasAmount);
    System.out.println(opel.capacity);
  }
}
