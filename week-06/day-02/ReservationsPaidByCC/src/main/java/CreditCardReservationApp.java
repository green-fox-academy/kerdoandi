import java.util.ArrayList;
import java.util.List;

public class CreditCardReservationApp {
  public static void main(String[] args) {
    List<CreditCardReservation> app = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      app.add(new CreditCardReservation());
    }

    for (CreditCardReservation ccr : app) {
      System.out.println(ccr);
    }
  }
}
