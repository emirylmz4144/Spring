package Dependencies.Composition;

public class Engine {
    private String manufacturer;
    private String model;
    private int horsepower;
    private int cylinders;
    private String fuelType;

    public Engine(String manufacturer, String model, int horsepower, int cylinders, String fuelType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getFuelType() {
        return fuelType;
    }
}
