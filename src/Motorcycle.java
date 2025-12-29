public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, Driver driver,boolean hasSidecar) {
        super(brand, year, driver);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        if(hasSidecar) {
            System.out.println("Motorcycle " + brand + "(" + year + ") with sidecar engine start. ");
        }
        else{
            System.out.println("Motorcycle " + brand + "(" + year + ") without sidecar engine start. ");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stop. ");
    }
}
