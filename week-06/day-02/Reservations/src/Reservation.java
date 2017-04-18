import java.util.Random;

public class Reservation implements Reservationy {
  final String FORMATFORPRINT = "Booking# %s for %s";
  String bookingNumber;
  String dayOfWeek;

  public Reservation() {
    generateBookingNumber();
    generateDayOfWeek();
  }

  void generateBookingNumber() {
    char[] alphabet = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] bookingNumber = new char[8];
    Random random = new Random();
    for (int i = 0; i < 8; i++) {
      int index = random.nextInt(36);
      bookingNumber[i] = alphabet[index];
    }
    String bookingNr = new String(bookingNumber);
    this.bookingNumber = bookingNr.toUpperCase();
  }

  void generateDayOfWeek() {
    String[] dowList = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    Random random = new Random();
    int randomIndex = random.nextInt(7);
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
    String tempFormat = FORMATFORPRINT;
    tempFormat = String.format(tempFormat, getCodeBooking(), getDowBooking());
    return tempFormat;
  }
}