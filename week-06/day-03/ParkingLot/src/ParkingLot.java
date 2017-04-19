import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
  public static void main(String[] args) {
    List<Car> parkingLot = new ArrayList<>();
    for (int i = 0; i < 256; i++) {
      parkingLot.add(new Car(CarType.getRandomCarType(), CarColor.getRandomCarColor()));
    }
    for (int j = 0; j < parkingLot.size(); j++) {
      System.out.println(parkingLot.get(j));
    }
  }
}
