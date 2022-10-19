class Vehicle {

  int passengers; // number of passengers
  int fuelcap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

  // This is a constructor for Vehicle
  Vehicle(int p, int f, int m) {
    passengers = p;
    fuelcap = f;
    mpg = m;
  }

  // Return the range
  int range() {
    return fuelcap * mpg;
  }

  // Compute the fuel needed for the given distance
  double fuelneeded (int miles) {
    return (double) miles / mpg;
  }
}