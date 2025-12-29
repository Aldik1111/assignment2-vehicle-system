public abstract class Vehicle { // create abstract classes
    protected String brand; // private for subclasses
    protected int year;
    private Driver driver;

    // Constructor
    public Vehicle(String brand, int year, Driver driver){
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public abstract void startEngine(); // for using in subclasses
    public abstract void stopEngine();

    public void displayInfo(){
        System.out.println( "Brand: " + brand + "\nYear: " + year );
    }

    public void displayDriver(){
        if(driver != null ) { // if driver is
            driver.displayDriverInfo();
        }
        else{
            System.out.println("ERROR");
        }
    }
}
