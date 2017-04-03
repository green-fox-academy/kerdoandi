/**
 * Created by Andi on 4/3/2017.
 */
public class Counter {
  int firstValue;
  int value;


  public Counter(int value) {
    this.value = value;
    this.firstValue = value;
  }

  public Counter() {
    this(0);
  }

  public int add() {
    return value = value + 1;
  }

  public int add(int number) {
    return value = value + number;
  }

  public int get() {
    return value;
  }

  public int reset() {
    return value = firstValue;
  }
}





//  Create Counter class
//which has an integer field value
//                when creating it should have a default value 0 or we can specify it when creating
//        we can add(number) to this counter another whole number
//        or we can add() without parameters just increasing the counter's value by one
//        and we can get() the current value
//        also we can reset() the value to the initial value