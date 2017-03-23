import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andi on 2017. 03. 23..
 */
public class MatchMaking {

  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
    int g = girls.size();
    int b = boys.size();
    ArrayList<String> order = new ArrayList<String>();

    for (int i = 0; i < girls.size(); i++) {
      order.add(i * 2, girls.get(i));
      order.add(i * 2 + 1, boys.get(i));
    }

    order.addAll(boys.subList(girls.size(),boys.size()));

    System.out.println(order);
  }
}

// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...
