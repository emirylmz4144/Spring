package Dependencies.Aggregation;

public class Car {
    private String plate;
    private Driver driver;

    public Car(String plate, Driver driver) {
        this.plate = plate;
        this.driver = driver;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
