import java.util.*;

public class ParkingLot {
  public static void main(String[] args) {
    List<Car> parkingLot = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
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

    Map<String, Integer> map = new HashMap<>();
    String carNameMaxOccurance = "";
    Integer maxOccurance = 0;
    for (int i = 0; i < parkingLot.size(); i++) {
      String carname = parkingLot.get(i).toString();
      if (map.containsKey(carname)) {
        Integer carOccurance = map.get(carname);
        map.put(carname, carOccurance + 1);
        if ((carOccurance + 1) > maxOccurance) {
          carNameMaxOccurance = carname;
          maxOccurance = carOccurance + 1;
        }
      } else {
        map.put(carname, 1);
        if (1 > maxOccurance) {
          carNameMaxOccurance = carname;
          maxOccurance = 1;
        }
      }
    }
    System.out.println("Most popular car: " + carNameMaxOccurance + " occurs " + maxOccurance + " times.");
    System.out.println(map);
  }
}

