package vehicles;

import details.Engine;
import profession.Driver;

public class Truck extends Car{
    private int carrying;

    public Truck(String carBrand, String carType, int carWeight, profession.Driver driver, details.Engine engine, int carrying) {
        super(carBrand, carType, carWeight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carrying=" + carrying +
                '}';
    }
}
