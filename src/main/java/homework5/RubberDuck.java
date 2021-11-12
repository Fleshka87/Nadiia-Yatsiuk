package homework5;

import java.util.Objects;

public class RubberDuck extends Birds implements CanSwim {

    String material;
    String beak;

    public RubberDuck(String name, String type, String material, String beak) {
        super(name, type);
        this.material = material;
        this.beak = beak;
    }

    @Override
    public void canSwim() {
        System.out.println("Kria Kria");

    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "material='" + material + '\'' +
                ", beak='" + beak + '\'' +
                '}';
    }

    @Override
    public void iAm() {
        super.iAm();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RubberDuck that = (RubberDuck) o;
        return Objects.equals(material, that.material) && Objects.equals(beak, that.beak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, beak);
    }
}