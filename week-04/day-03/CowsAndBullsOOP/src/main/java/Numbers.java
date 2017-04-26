import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers {
  private int level;
  List<Integer> numbers;

  public Numbers(int level) {
    this.level = level;
    fillList(this.level);
}

  public void fillList(int numberLength) {
    List<Integer> numberList = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < numberLength; i++ ) {
      numberList.add(random.nextInt(10));
    }
  }

  @Override
  public String toString() {
    return "Numbers=" + numbers;
  }
}

