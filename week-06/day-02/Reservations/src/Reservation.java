import java.util.Random;

public class Reservation implements Reservationy {
  private String bookingNumber;
  private String dayOfWeek;

  Reservation() {
    generateBookingNumber();
    generateDayOfWeek();
  }

  private void generateBookingNumber() {
    char[] alphabet = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] bookingNumber = new char[8];
    Random random = new Random();
    for (int i = 0; i < 8; i++) {
      int index = random.nextInt(alphabet.length);
      bookingNumber[i] = alphabet[index];
    }
    String bookingNr = new String(bookingNumber);
    this.bookingNumber = bookingNr.toUpperCase();
  }

  private void generateDayOfWeek() {
    String[] dowList = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    Random random = new Random();
    int randomIndex = random.nextInt(dowList.length);
    this.dayOfWeek = dowList[randomIndex];
  }

  @Override
  public String getDowBooking() {
    return this.dayOfWeek;
  }

  @Override
  public String getCodeBooking() {
    return this.bookingNumber;
  }

  @Override
  public String toString() {
    String FORMATFORPRINT = "Booking# %s for %s";
    return String.format(FORMATFORPRINT, getCodeBooking(), getDowBooking());
  }
}