import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LottoWithMethods {
  public static void main(String[] args) {
    List<String> lottoDataList = new ArrayList<>();
    Map<String, Integer> lottoNumbersCounterMap = new HashMap<String, Integer>();
    String filepath = "assets/lotto.csv";
    lottoDataList = readFileIntoArrayList(filepath);


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

    List<Integer> topFiveOccurance = new ArrayList<>();
    topFiveOccurance = getTopFiveValuesFromHashMap(lottoNumbersCounterMap);
    printKeysToGivenValues(lottoNumbersCounterMap,topFiveOccurance);
  }

  public static List<String> readFileIntoArrayList(String filepath)  {
    List<String> arrayListFromFile = new ArrayList<>();
    try {
      Path path = Paths.get(filepath);
      arrayListFromFile = Files.readAllLines(path);

    } catch (IOException e) {
      System.out.println("error happend: " + e.getClass());
    }
    return arrayListFromFile;
  }

  public static List<Integer> getTopFiveValuesFromHashMap (Map<String, Integer> input) {
    List<Integer> hashMapValueList = new ArrayList<>();
    for (String keyItem : input.keySet()) {
      Integer value = input.get(keyItem);
//      System.out.println(keyItem + " " + value);
      hashMapValueList.add(value);
    }

    List<Integer> topFiveValueList = new ArrayList<>();
    Collections.sort(hashMapValueList);
    for (int i = hashMapValueList.size() - 1; i > hashMapValueList.size() - 6; i--) {
      topFiveValueList.add(hashMapValueList.get(i));
    }

    return topFiveValueList;
  }

  public static void printKeysToGivenValues (Map<String, Integer> mapp, List<Integer> givenValues ) {
    for (String key : mapp.keySet()) {
      Integer value = mapp.get(key);
      if (givenValues.contains(value)) {
        System.out.println(key + "," + value);
      }
    }
  }
}


