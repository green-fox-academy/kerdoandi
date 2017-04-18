/**
 * Created by Andi on 4/18/2017.
 */
public interface CreditCardy {
  int getSumCVV();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCVV(String codeAccount); // computes codeAccount checksum

  String toString (); //String.format("Name=%s CC#=%s CVV=%d");
}
