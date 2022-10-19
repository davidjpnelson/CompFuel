// A program that uses the Vehicle Class

class VehicleDemo1{
  public static void main(String[] args) {
    Vehicle coupe = new Vehicle(2, 14, 35); // create a Vehicle object named coupe
    Vehicle minivan = new Vehicle(7, 18, 21); //create a Vehicle object named minivan
    double gallons;
    int dist = 252;

    gallons = coupe.fuelneeded(dist);

    // state the passenger amount and compute gallons needed to go the distance
    System.out.println("A coupe carries " + coupe.passengers + " passengers. It needs "
        + gallons + " gallons of fuel to go " + dist + " miles.");

    gallons = minivan.fuelneeded(dist);

    // state the passenger amount and compute the range of a minivan assuming a full tank of gas
    System.out.println("A minivan carries " + minivan.passengers + " passengers. It needs "
        + gallons + " gallons of fuel to go " + dist + " miles.");
  }
}