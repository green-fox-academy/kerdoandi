public class FleetOfThings {

  public static void main(String[] args) {
    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing("Remove the obstacles");
    Thing standup = new Thing("Stand up");
    Thing lunch = new Thing("Eat lunch");
    standup.complete();
    lunch.complete();

    Fleet fleet = new Fleet();
    fleet.add(milk);
    fleet.add(obstacles);
    fleet.add(standup);
    fleet.add(lunch);

    System.out.println(fleet);
  }
}



// Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch