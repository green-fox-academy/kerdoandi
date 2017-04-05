import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Andi on 4/5/2017.
 */
public class CountLetterTest {
  @Test
  public void countLetter() throws Exception {
    CountLetter text = new CountLetter("asdfasd");

    Map<String, Integer> x = new HashMap<>();
    x.put("a", 2);
    x.put("s", 2);
    x.put("d", 2);
    x.put("f", 1);

    assertEquals(x, text.countLetter());
  }
}