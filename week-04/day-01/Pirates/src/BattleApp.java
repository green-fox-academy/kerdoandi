/**
 * Created by Andi on 4/15/2017.
 */
public class BattleApp {
  public static void main(String[] args) {
    Pirates bela = new Captain("Bela ");
    Pirates geza = new Crew("Geza ");
    Pirates oli = new Captain("oli ");
    Pirates asd = new Captain("asd ");
    Pirates geza2 = new Crew("Geza2 ");
    Pirates geza3 = new Crew("Geza3 ");
    Pirates geza4 = new Crew("Geza4 ");
    Ship shipPirate = new Ship();
    Ship otherShip = new Ship();

    bela.drinkSomeRum();
    bela.drinkSomeRum();
    geza.drinkSomeRum();
    shipPirate.fillShip(bela);
    shipPirate.fillShip(geza);
    bela.die();
    shipPirate.fillShip(oli);
    otherShip.fillShip(asd);
    shipPirate.fillShip(geza2);
    otherShip.fillShip(geza3);
    otherShip.fillShip(geza4);
    oli.drinkSomeRum();
    asd.drinkSomeRum();
    asd.drinkSomeRum();
    asd.drinkSomeRum();
    asd.drinkSomeRum();

    System.out.println(shipPirate.getStatus());
    System.out.println(otherShip.getStatus());
    shipPirate.battle(otherShip);
    System.out.println(shipPirate.getStatus());
    System.out.println(otherShip.getStatus());
  }
}

