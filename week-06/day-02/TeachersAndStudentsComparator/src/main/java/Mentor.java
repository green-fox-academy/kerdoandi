public class Mentor extends Person implements Comparable<Mentor> {
  String level;
  public static final String INTERMEDIATE = "intermediate";
  public static final String SENIOR = "senior";


  public String getLevel() {
    return level;
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = INTERMEDIATE;
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " " + this.level + " mentor.");
  }

  @Override
  public int compareTo(Mentor o) {
    if (this.level.equals(INTERMEDIATE) && o.level.equals(INTERMEDIATE)) {
      return 0;
    } else if (this.level.equals(SENIOR) && o.level.equals(SENIOR)) {
      return 0;
    } else if (this.level.equals(INTERMEDIATE) && o.level.equals(SENIOR)) {
      return -1;
    } else {
      return 1;
    }
  }
}