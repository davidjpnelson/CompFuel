class Vehicle {

  int passengers; // number of passengers
  int fuelcap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

  //return the range
  int range() {
    return fuelcap * mpg;
  }

  //compute the fuel needed for the given distance
  double fuelneeded (int miles) {
    return (double) miles / mpg;
  }
}