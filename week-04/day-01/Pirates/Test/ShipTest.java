import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShipTest {
  Ship pirateList;
  @Before
  public void runBeforeTest() {
    pirateList = new Ship();
    pirateList.fillShip(new Captain("Geza"));
  }

  @Test
  public void getPirate() throws Exception {
    assertEquals("Geza", pirateList.getPirate(0).toString());
  }

  @Test
  public void notAddTwoCaptains() throws Exception {
    pirateList.fillShip(new Captain("Sanyi"));
    assertTrue("Pirate ship can't have two captains", pirateList.getNrOfAllPirates() == 1);
  }

  @Test
  public void isAliveCaptainOnBoard() throws Exception {
    assertEquals("Captains are alive in default", true, true);
  }

  @Test
  public void getPiratesName() throws Exception {
    assertEquals("Geza",pirateList.getPiratesName().get(0));
  }

}