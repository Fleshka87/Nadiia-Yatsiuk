package vehicles;

import details.Engine;
import professions.Driver;

public class car {
    public static void main(String[] args) {
        String carBrand = "mycar";
        String carType = "SUV";
        int carWeight = 2000;
        Driver driver;
        Engine engine;
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
            System.out.println("Brand is " + carBrand + " Driver is " + driver + " Engine has " + engine);
        }
        public void stop () {
            System.out.println("Stop");
        }


    }

