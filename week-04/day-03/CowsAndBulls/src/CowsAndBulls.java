import java.util.*;

public class CowsAndBulls {
  private Random rand = new Random();
  int randomNumber;
  private int counter;
  private int bulls;
  private int cows;

  CowsAndBulls() {
    randomNumber = rand.nextInt(9999) + 1000;
    counter = 1;
    bulls = 0;
    cows = 0;
  }

  private List<Integer> convertNumToList(int number) {
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

  boolean returnToGuess() {
    List<Integer> guessList;
    List<Integer> randomList;
    bulls = 0;
    cows = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int i = input.nextInt();
    guessList = convertNumToList(i);
    randomList = convertNumToList(this.randomNumber);

    List<Integer> notMatchingIndexList = new ArrayList<>();
    for (int j = 0; j < guessList.size(); j++) {
      if (guessList.get(j).equals(randomList.get(j))) {
        cows++;
      } else {
        notMatchingIndexList.add(j);
      }
    }

    List<Integer> shortGuessList = new ArrayList<>();
    for (int n = 0; n < notMatchingIndexList.size(); n++) {
      shortGuessList.add(guessList.get(notMatchingIndexList.get(n)));
    }

    List<Integer> shortRandomList = new ArrayList<>();
    for (int p = 0; p < notMatchingIndexList.size(); p++) {
      shortRandomList.add(randomList.get(notMatchingIndexList.get(p)));
    }

    for (int m = 0; m < shortGuessList.size(); m++) {
      if (shortRandomList.contains(shortGuessList.get(m))) {
        bulls++;
      }
    }

    if (cows == 4) {
      System.out.println("Congrats, you won!");
      return true;
    } else {
      System.out.println("Cows: " + cows + ", Bulls: " + bulls + ", counter: " + counter++);
    }
    return false;
  }
}

