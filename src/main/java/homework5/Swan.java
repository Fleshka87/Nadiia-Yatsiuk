package homework5;

public class Swan extends Birds implements CanFly, CanEat, CanSwim {

    double speed;

    public Swan(String name, String type, double speed) {
        super(name, type);
        this.speed = speed;
    }

    @Override
    public void canEat() {
        System.out.println("Feed me");

    }

    @Override
    public void canSwim() {
        System.out.println("I live on the lake");

    }

    @Override
    public void canFly() {

    }

    public double speed(String canFly) {
        return speed;
    }

    @Override
    public String toString() {
        return "Swan{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

