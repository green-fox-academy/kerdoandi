package date;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthdayWithLocalDate implements date.BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    LocalDate localDate = LocalDate.parse(str);
    return localDate;
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    String monthAndDay = date.toString().substring(5,7) + ". " + date.toString().substring(8) + ".";
    return monthAndDay;
  }
  // TODO - return the date formatted: month & day (MM. dd.)

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    return (date.getMonth() == LocalDate.now().getMonth() && date.getDayOfMonth() == LocalDate.now().getDayOfMonth());
}

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    int age = LocalDate.now().getYear() - birthday.getYear();
    return age;
  }
  // TODO - return how many years age the input date 'birthday' was

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    LocalDate now = LocalDate.now();
    int expected;
    if (now.getDayOfYear() == date.getDayOfYear()) {
      expected = 0;
    } else if (now.getDayOfYear() > date.getDayOfYear()) {
      return LocalDate.of(now.getYear(), 12, 31).getDayOfYear() - now.getDayOfYear() + date.getDayOfYear();
    } else {
      return date.getDayOfYear() - now.getDayOfYear();
    }
    return expected;
  }
  // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}