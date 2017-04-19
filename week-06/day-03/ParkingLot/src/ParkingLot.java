import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
  public static void main(String[] args) {
    List<Car> parkingLot = new ArrayList<>();
    for (int i = 0; i < 50; i++) {
      parkingLot.add(new Car(CarType.getRandomCarType(), CarColor.getRandomCarColor()));
    }

    for (int j = 0; j < CarType.values().length; j++) {
      int nrOfSameType = 0;
      for (int m = 0; m < parkingLot.size(); m++) {
        if (parkingLot.get(m).getCarType().equals(CarType.values()[j]))
          nrOfSameType++;
      }
      System.out.println("CarType: " + CarType.values()[j] + " " + nrOfSameType);
    }

    System.out.println();

    for (int j = 0; j < CarColor.values().length; j++) {
      int nrOfSameColor = 0;
      for (int m = 0; m < parkingLot.size(); m++) {
        if (parkingLot.get(m).getCarColor().equals(CarColor.values()[j]))
          nrOfSameColor++;
      }
      System.out.println("CarColor: " + CarColor.values()[j] + " " + nrOfSameColor);
    }

    Map<Car, Integer> carMap = new HashMap<>();
    for (int i = 0; i < parkingLot.size(); i++) {
      if (!carMap.containsKey(parkingLot.get(i))) {
        carMap.put(parkingLot.get(i), 1);
      } else {
        carMap.put(parkingLot.get(i), carMap.get(parkingLot.get(i)) + 1);
      }
    }
    System.out.println(carMap);
  }
}

