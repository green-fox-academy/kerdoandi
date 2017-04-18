import java.util.ArrayList;
import java.util.List;

public class ReservationApp {
  public static void main(String[] args) {
    List<Reservation> reservationList = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      reservationList.add(new Reservation());
    }
    for (int j = 0; j < reservationList.size(); j++) {
      System.out.println(reservationList.get(j));
    }
  }
}
