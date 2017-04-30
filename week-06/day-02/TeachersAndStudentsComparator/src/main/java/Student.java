public class Student extends Person implements Comparable<Student> {

  private String previousOrganization;
  private int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + "year old " + this.getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String po) {
    super(name, age, gender);
    this.previousOrganization = po;
    this. skippedDays = 0;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this. skippedDays = 0;
  }

  @Override
  public int compareTo(Student o) {
    return this.skippedDays - o.skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }

}