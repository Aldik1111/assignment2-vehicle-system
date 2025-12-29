void main() {

    Driver d1 = new Driver("Max Verstappen", "001");
    Driver d2 = new Driver("Lando Norris", "004");

    Vehicle v1 = new Car("Red bull", 2025, d1, 1, "E10");
    Vehicle v2 = new Truck("Volvo", 2019, d2,7.65, 2);
    Vehicle v3 = new Motorcycle("Yamaha", 1995, d1, true);
    Vehicle v4 = new Plane("Airbus", 2020, d2, 600, "ATF");

    Vehicle[] vehicles = {v1, v2, v3, v4};

    for(Vehicle vehicle : vehicles){
        System.out.println("--------------------");
        vehicle.startEngine();
        vehicle.displayInfo();
        vehicle.displayDriver();
        vehicle.stopEngine();
        System.out.println("--------------------");
        System.out.println();
    }
}