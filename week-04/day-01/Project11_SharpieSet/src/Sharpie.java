import sun.security.provider.SHA;

/**
 * Created by Andi on 4/3/2017.
 */
public class Sharpie {
  String color;
  double width;
  double inkAmount;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {

    inkAmount -= 50;
  }
}


//  Create Sharpie class
//We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//        When creating one, we need to specify the color and the width
//        Every sharpie is created with a default 100 as inkAmount
//        We can use() the sharpie objects
//        which decreases inkAmount