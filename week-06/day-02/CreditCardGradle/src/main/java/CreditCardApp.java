import java.util.ArrayList;
import java.util.List;

public class CreditCardApp {
  public static void main(String[] args) {
    List<CreditCard> creditCardList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      creditCardList.add(new CreditCard());
    }
    for (int j = 0; j < creditCardList.size(); j++) {
      System.out.println(creditCardList.get(j));
    }
  }
}
