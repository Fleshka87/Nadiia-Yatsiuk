package vehicles;

import details.Engine;
import profession.Driver;

public class SportCar extends Car{
   private int speed;

    public SportCar(String carBrand, String carType, int carWeight, profession.Driver driver, details.Engine engine, int speed) {
        super(carBrand, carType, carWeight, driver, engine);
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
