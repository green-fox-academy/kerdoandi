public class CreditCardReservation  {
  private CreditCards creditCards;
  private Reservations reservations;

  CreditCardReservation() {
    reservations = new Reservations();
    creditCards = new CreditCards();
  }

  @Override
  public String toString() {
  String tempFormat = "Booking# %s for %s paid by Name=%s CC#=%s CVV=%d";
  return String.format(tempFormat, reservations.getCodeBooking(),
          reservations.getDowBooking(), creditCards.getNameCardholder(),
          creditCards.getCodeAccount(), creditCards.getSumCVV());
  }
}
