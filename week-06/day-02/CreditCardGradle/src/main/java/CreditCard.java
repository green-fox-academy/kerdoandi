import org.apache.commons.lang.RandomStringUtils;

public class CreditCard implements CreditCardy {
  private String name;
  private String CC;
  private int CVV;
  private static int cardHolderID = 0;

  CreditCard() {
    generateCardHolderName();
    this.CC = RandomStringUtils.randomNumeric(16);
    cumeSumCVV(this.CC);
  }

  private void generateCardHolderName() {
    this.name = "ABC".concat(String.valueOf(cardHolderID++));
}

  @Override
  public int getSumCVV() {
    return this.CVV;
  }

  @Override
  public String getNameCardholder() {
    return this.name;
  }

  @Override
  public String getCodeAccount() {
    return this.CC;
  }

  @Override
  public int cumeSumCVV(String CC) {
    String[] CCarray = this.CC.split("");
    this.CVV = 0;
    for (int i = 0; i < CCarray.length; i++) {
      this.CVV = this.CVV + Integer.parseInt(CCarray[i]);
    }
    return this.CVV;
  }

  @Override
  public String toString() {
    String tempformat = String.format("Name=%s CC#=%s CVV=%d", getNameCardholder(), getCodeAccount(), getSumCVV()) + " (validated)";
    return tempformat;
  }
}
