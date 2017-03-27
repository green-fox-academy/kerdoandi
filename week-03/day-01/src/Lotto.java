import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lotto {
  public static void main(String[] args) {
    List<String> lottoDataList = new ArrayList<>();
    Map<String, Integer> lottoNumbersCounterMap = new HashMap<String, Integer>();

    try {
      Path path = Paths.get("assets/lotto.csv");
      lottoDataList = Files.readAllLines(path);

    } catch (IOException e) {
      System.out.println("error happend: " + e.getClass());
    }

//    for (int i = 0; i < lottoDataList.size(); i++) {
    for (String dataList : lottoDataList) {
      String[] lottoDataListSplitted = dataList.split(";");
      for (int j = lottoDataListSplitted.length - 5; j < lottoDataListSplitted.length; j++) {
        String lottoNumber = lottoDataListSplitted[j];
        if (!lottoNumbersCounterMap.containsKey(lottoNumber)) {
          lottoNumbersCounterMap.put(lottoNumber, 1);
        } else {
          Integer lottoNumberCounter = lottoNumbersCounterMap.get(lottoNumber);
          lottoNumbersCounterMap.put(lottoNumber, lottoNumberCounter + 1);
        }
      }
    }

    List<Integer> lottoNumbersOccurance = new ArrayList<>();
    for (String lottoNumber : lottoNumbersCounterMap.keySet()) {

      Integer value = lottoNumbersCounterMap.get(lottoNumber);
//      System.out.println(lottoNumber + " " + value);
      lottoNumbersOccurance.add(value);
    }

    List<Integer> topFiveOccurance = new ArrayList<>();
    Collections.sort(lottoNumbersOccurance);
    for (int i = lottoNumbersOccurance.size() - 1; i > lottoNumbersOccurance.size() - 6; i--) {
      topFiveOccurance.add(lottoNumbersOccurance.get(i));
    }

    for (String lottoNumber : lottoNumbersCounterMap.keySet()) {
      Integer value = lottoNumbersCounterMap.get(lottoNumber);
      if (topFiveOccurance.contains(value)) {
        System.out.println(lottoNumber + "," + value);

      }
    }
  }
}


