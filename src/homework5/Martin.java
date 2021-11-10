package homework5;

import java.util.Objects;

public class Martin extends Birds{

    String beak;

    public Martin(String name, String type, String beak) {
        super(name, type);
        this.beak = beak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Martin martin = (Martin) o;
        return Objects.equals(beak, martin.beak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beak);
    }

    @Override
    public String toString() {
        return "Martin{" +
                "beak='" + beak + '\'' +
                '}';
    }
}

