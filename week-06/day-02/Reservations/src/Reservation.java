import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {
  final String FORMATFORPRINT = "Booking# %s for %s";
  String bookingNumber;
  String dayOfWeek;

  public Reservation() {
    generateBookingNumber();
  }

  public void generateBookingNumber() {
    char[] alphabet = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    List<Character> bookingNumber = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 8; i++) {
      int index = random.nextInt(36);
      bookingNumber.add(alphabet[index]);
    }
  bookingNumber.toString().toUpperCase();
  }


  @Override
  public String getDowBooking() {
    return null;
  }

  @Override
  public String getCodeBooking() {
    return null;
  }

  @Override
  public String toString() {
    return;
  }
}
