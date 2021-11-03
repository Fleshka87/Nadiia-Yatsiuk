package vehicles;

public class sportCars extends car{
    int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public sportCars(int speed) {
        this.speed = speed;
    }
sportCars Lambo=new sportCars(250);
}
