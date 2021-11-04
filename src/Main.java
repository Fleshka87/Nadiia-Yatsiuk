import details.Engine;
import profession.Driver;
import vehicles.Car;
import vehicles.SportCar;
import vehicles.Truck;

public class Main {

    public static void main(String[] args) {
        Driver myDriver = new Driver("Nadiia", "20");
        Engine myEngine = new Engine(3,"V8");

        Driver truckDriver = new Driver("Misha", "15");
        Engine truckEngine = new Engine(6, "FGT");

        SportCar mySportcar = new SportCar("BMW", "SUV", 5, myDriver, myEngine, 5);
        Truck myTruck = new Truck("Volvo", "18 wheels", 360, truckDriver, truckEngine, 25000);

        System.out.println("My truck is " + myTruck.getCarBrand() +" type is "+myTruck.getCarType() +" weight is "+ myTruck.getCarWeight()+
                " Driver name is "+truckDriver+" "+truckEngine+" carrying is "+myTruck.getCarrying());
        System.out.println("My car is " + mySportcar.getCarBrand() +" type is "+mySportcar.getCarType() +" weight is "+ mySportcar.getCarWeight()+
                " Driver name is "+myDriver+" "+myEngine+" carrying is "+mySportcar.getSpeed());

    }


}

