/**
 * Created by Andi on 2017. 03. 21..
 */
public class Exercise11 {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int dailySeconds = 24*60*60;

    System.out.println("Remaining seconds: " + (dailySeconds - (currentHours * 3600 + currentMinutes * 60 + currentSeconds)));
  }
}
