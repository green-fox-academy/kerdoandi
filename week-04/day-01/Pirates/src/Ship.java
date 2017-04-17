import java.util.ArrayList;
import java.util.List;

public class Ship {
  public List<Pirates> pirateList = new ArrayList<>();

  public Ship() {
  }

  public Pirates getPirate(int i) {
    return pirateList.get(i);
  }

  public void fillShip(Pirates pirate) {
    if (pirate instanceof Crew) {
      pirateList.add(pirate);
    } else if (pirate instanceof Captain) {
      if (!isAliveCaptainOnBoard()) {
        pirateList.add(pirate);
      }
    }
  }

  public boolean isAliveCaptainOnBoard() {
    for (Pirates p : pirateList) {
      if (p instanceof Captain && p.isAlive()) {
        return true;
      }
    }
    return false;
  }

  public List<String> getPiratesName() {
    List<String> pirateNameList = new ArrayList<>();
    for (Pirates p : pirateList) {
      pirateNameList.add(p.getName());
    }
    return pirateNameList;
  }

  public int getCaptainRumLevel() {
    int captainRumLevel = 0;
    for (Pirates p : pirateList) {
      if (p instanceof Captain && p.isAlive()) {
        captainRumLevel = p.getRumLevel();
      }
    }
    return captainRumLevel;
  }

  public int getNrOfAllPirates() {
    return pirateList.size();
  }

  public int getNrOfPiratesAlive() {
    int alivePirates = 0;
    for (Pirates p : pirateList) {
      if (p.isAlive()) {
        alivePirates++;
      }
    }
    return alivePirates;
  }

  public int getDeadPirates() {
    int deadPirates = 0;
    for (Pirates p : pirateList) {
      if (!p.isAlive()) {
        deadPirates++;
      }
    }
    return deadPirates;
  }

  public void battle(Ship othership) {
    if ((this.getNrOfPiratesAlive() + this.getCaptainRumLevel()) > (othership.getNrOfPiratesAlive() + othership.getCaptainRumLevel())) {
      System.out.println("We won");
      int deathNr = (int) (Math.random() * othership.getNrOfPiratesAlive() + 1);
      for (int i = 0; i < deathNr - 1; i++) {
        othership.getPirate(i).die();
      }
    } else {
      System.out.println("We loose");
      int deathNr = (int) (Math.random() * this.getNrOfPiratesAlive() + 2);
      for (int i = 0; i < deathNr - 1; i++) {
        this.getPirate(i).die();
      }
    }
  }


  public String getStatus() {
    return "Nr of pirates on board: " + getNrOfAllPirates() + ", alive: " + getNrOfPiratesAlive() + ", dead: " + getDeadPirates() + ", captain consumed rum: " + getCaptainRumLevel() + "\n" + getPiratesName();
  }

  @Override
  public String toString() {
    return "pirateList=" + getPiratesName();
  }
}

