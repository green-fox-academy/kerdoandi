import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CowsBulls {

  List<String> list = new ArrayList<>();
  Random rand = new Random();

  int randomNumber;
  String state;
  int counter;
  int bulls;
  int cows;
  String status;

  public int getBulls() {
    return bulls;
  }

  public int getCows() {
    return cows;
  }

  public CowsBulls() {
    randomNumber = rand.nextInt(9999) + 1000;
    state = "playing";
    counter = 0;
    bulls = 0;
    cows = 0;
  }

  public List<Integer> convertNumToList(int number) {
    String temp = Integer.toString(number);
    int[] numberInChar = new int[temp.length()];
    for (int i = 0; i < temp.length(); i++) {
      numberInChar[i] = temp.charAt(i) - '0';
    }

    List<Integer> numberList = new ArrayList<>();
    for (int i = 0; i < numberInChar.length; i++) {
      numberList.add(numberInChar[i]);
    }
    return numberList;
  }

  public String returnToGuess() {
    List<Integer> guessList = new ArrayList<>();
    List<Integer> randomList = new ArrayList<>();
    randomList = convertNumToList(this.randomNumber);

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number:");

    int i = input.nextInt();
    guessList = convertNumToList(i);

    if (cows == 4) {
      return status;

    } else {

      for (int j = 0; j < guessList.size(); j++) {
        int temp1 = 0;
        if (guessList.get(j) == randomList.get(j)) {
          temp1++;
          state = "playing";
          counter++;
          cows = temp1;
        }
      }

      for (int m = 0; m < guessList.size(); m++) {
        int temp2 = 0;
        if (randomList.contains(guessList.get(m)) && guessList.get(m) != randomList.get(m)) {
          temp2++;
          state = "playing";
          counter++;
          bulls = temp2;
        }
      }
      System.out.println(status = "Cows: " + cows + ", Bulls: " + bulls);
      return status + returnToGuess();
    }
  }
}

