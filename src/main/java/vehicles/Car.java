package vehicles;

public class Car {
    private String carBrand;
    private String carType;
    private int carWeight;
    profession.Driver Driver;
    details.Engine Engine;

    public Car(String carBrand, String carType, int carWeight, profession.Driver driver, details.Engine engine) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.carWeight = carWeight;
        Driver = driver;
        Engine = engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public void startCar () {
        System.out.println("Let's drive");
    }
    public void rightTurn () {
        System.out.println("Turn right");
    }
    public void lefTurn () {
        System.out.println("Turn left");
    }
    public void printInfo (String carBrand, String driver,double engine){
        System.out.println("Brand is " + carBrand + " Driver is " + Driver + " Engine has " + Engine);
    }
    public void stop (){
        System.out.println("Stop");}

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carType='" + carType + '\'' +
                ", carWeight=" + carWeight +
                ", Driver=" + Driver +
                ", Engine=" + Engine +
                '}';
    }
}
