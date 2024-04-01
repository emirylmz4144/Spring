package Dependencies.Composition;

public class Car {
    /*
    Bir arabada bulunması gereken başka özellikler(propertyler)
     */
    private Engine engine;

    public Car(Engine engine) {
        Engine e = new Engine("Toyota", "XYZ", 200, 4, "Benzin");

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
