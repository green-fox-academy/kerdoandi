/**
 * Created by Andi on 4/17/2017.
 */
public abstract class Animals {
  String name;
  int age;

  public Animals(String name,int age) {
    this.name = name;
    this.age = age;
  }

  public abstract void greet();

  public abstract void wantChild();

  public abstract void eat();

  public abstract void move();

  public abstract boolean isPredator();
}
