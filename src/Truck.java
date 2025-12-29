public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, Driver driver, double capacity, int numAxles){
        super(brand, year, driver);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck " + brand + "(" + year + ") engine start. Capacity: " + capacity + ". Axles: " + numAxles);
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stop. ");
    }
}
