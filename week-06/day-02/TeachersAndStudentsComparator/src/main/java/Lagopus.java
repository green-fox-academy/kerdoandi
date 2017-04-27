import java.util.ArrayList;
import java.util.List;


public class Lagopus {
  String className;
  List<Student> studentList = new ArrayList<>();
  List<Mentor> mentorList = new ArrayList<>();

  public Lagopus(String className) {
    this.className = className;
  }

  public void addStudent(Student s) {
    studentList.add(s);
  }

  public void addMentor(Mentor m) {
    mentorList.add(m);
  }

  public void info() {
    System.out.println(this.className + " class has " + studentList.size() + " students and " + mentorList.size() + " mentors.");
  }
}
