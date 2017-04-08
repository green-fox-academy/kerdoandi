/**
 * Created by Andi on 4/4/2017.
 */
public class AircraftApp {
  public static void main(String[] args) {

    Carrier carrier = new Carrier(2000, 1000);
    Carrier enemy = new Carrier(2000, 1000);

    carrier.addAircraft("F16");
    carrier.addAircraft("F16");
    carrier.addAircraft("F16");
    carrier.addAircraft("F35");
    carrier.addAircraft("F35");

    carrier.getAllAircraftStatus();
    carrier.getStatus();

    carrier.fill();
    carrier.getAllAircraftStatus();
    carrier.getStatus();

    carrier.fight(enemy);
    carrier.getAllAircraftStatus();
    carrier.getStatus();
  }
}
