/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise6 {
  public static void main(String[] args) {

    int dailyCodingHours = 6;
    int wksOfSemester = 17;
    int workdaysOfWk = 5;

    int avgTimeSpent = dailyCodingHours*wksOfSemester*workdaysOfWk;

    System.out.println("Average time spent with coding in a semester by an attendee is: " + avgTimeSpent);

    float wklyAvgWorkHours = 52;
    float percentageOfCodingHrs = wklyAvgWorkHours/avgTimeSpent*100;

    System.out.println("The percentage of the coding hours in the semester is: " + percentageOfCodingHrs + "%");

  }

}
