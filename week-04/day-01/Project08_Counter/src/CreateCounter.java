/**
 * Created by Andi on 4/3/2017.
 */
public class CreateCounter {
  public static void main(String[] args) {

    Counter counter1 = new Counter(40);

    System.out.println(counter1.get());
    System.out.println(counter1.add());
    System.out.println(counter1.get());
    System.out.println(counter1.add(30));
    System.out.println(counter1.reset());

  }
}
