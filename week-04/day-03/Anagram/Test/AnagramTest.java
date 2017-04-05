import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andi on 4/5/2017.
 */
public class AnagramTest {

  @Test
  public void isAnagram() throws Exception {
    Anagram anagram= new Anagram("alma", "mala");
    assertEquals(true, anagram.isAnagram());
  }
}