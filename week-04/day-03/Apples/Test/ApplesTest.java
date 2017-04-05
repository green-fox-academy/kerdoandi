import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andi on 4/5/2017.
 */
public class ApplesTest {
  @Test
  public void getName() throws Exception {
    Apples apple = new Apples("apple");
    assertEquals("apple", apple.getName());
  }
}