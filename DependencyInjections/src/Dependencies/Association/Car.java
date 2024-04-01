package Dependencies.Association;

import Dependencies.Aggregation.Driver;

public class Car
{
    private String plate;
    private Driver driver;


    public Car(String plate, Driver driver) {
        this.plate = plate;
        this.driver = driver;
    }

    public void takeCustomer(Customer customer)
    {
        //işlemler
    }

}
