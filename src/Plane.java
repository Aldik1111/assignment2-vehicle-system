public class Plane extends Vehicle{
    private int capacity;
    private String fuelType;

    public Plane(String brand, int year, Driver driver, int capacity, String fuelType){
        super(brand, year, driver);
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Plane " + brand +"(" + year + ") engine start. Capacity: " + capacity + ". Fuel type: " + fuelType);
    }

    @Override
    public void stopEngine() {
        System.out.println("Plane engine stop.");
    }
}
